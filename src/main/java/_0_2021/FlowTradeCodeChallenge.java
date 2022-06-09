package _0_2021;

import java.io.*;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.DoubleSummaryStatistics;
import java.util.Objects;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
// insert additional imports here if needed

public class FlowTradeCodeChallenge {

    private static final String FINISH_COMMAND = "finish";
    private static final String CALCULATE_CONSTANT = "calculate";
    private static final String PRIVATE_TRADE_COMMAND = "privateTrade";
    private static final String PUBLIC_TRADE_COMMAND = "publicTrade";
    // The rest of the class is the harness code. Please ignore it.
    private static final String INIT_COMMAND = "init";
    private ConcurrentNavigableMap<Long, Trade> tradesMap = new ConcurrentSkipListMap<>();
    private TestClock testClock;
    private int caclulationIntervalMillis;

    public FlowTradeCodeChallenge(int caclulationIntervalMillis, TestClock utcClock) {
        this.caclulationIntervalMillis = caclulationIntervalMillis;
        this.testClock = utcClock;
    }

    /**
     * Format:
     * init: "init\n<interval>\n"
     * on private trade:"privateTrade\n<clock_millis>\n<price>\n<size>\n<timestamp>\n"
     * on public trade:"publicTrade\n<clock_millis>\n<price>\n<size>\n<timestamp>\n"
     * calculate: "calculate\n<clock_millis>\n"
     * finish: "finish\n"
     */
    public static void main(String[] args) throws IOException {
        /*
init
2000
calculate
100
finish
        * */

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));) {

            TestClock clock = new TestClock(ZoneOffset.UTC);
            String initCommand = bufferedReader.readLine();
            assert initCommand.equals(INIT_COMMAND);
            int interval = Integer.parseInt(bufferedReader.readLine());

            FlowTradeCodeChallenge solution = new FlowTradeCodeChallenge(interval, clock);

            String command;
            int price;
            int size;
            long timestamp;
            do {
                command = bufferedReader.readLine();
                if (command.equals(PRIVATE_TRADE_COMMAND) || command.equals(PUBLIC_TRADE_COMMAND)) {
                    clock.currentMillis = Long.parseLong(bufferedReader.readLine());
                    price = Integer.parseInt(bufferedReader.readLine());
                    size = Integer.parseInt(bufferedReader.readLine());
                    timestamp = Long.parseLong(bufferedReader.readLine());
                    onTrade(command, solution, price, size, timestamp);

                } else if (command.equals(CALCULATE_CONSTANT)) {
                    clock.currentMillis = Long.parseLong(bufferedReader.readLine());
                    bufferedWriter.write(String.format("%.5f", solution.calculateMissedVolumeFraction()));
                    bufferedWriter.newLine();
                }
            } while (!command.equals(FINISH_COMMAND));
        }
    }

    private static void onTrade(String command, FlowTradeCodeChallenge solution, int price, int size, long timestamp) {
        if (command.equals(PRIVATE_TRADE_COMMAND)) {
            solution.onPrivateTrade(price, size, timestamp);
        } else {
            solution.onPublicTrade(price, size, timestamp);
        }

    }

    public void onPrivateTrade(int price, int size, long timestampMillis) {
        tradesMap.put(timestampMillis, new Trade(price, size, timestampMillis, false));
    }

    public void onPublicTrade(int price, int size, long timestampMillis) {
        tradesMap.put(timestampMillis, new Trade(price, size, timestampMillis, true));
    }

    public double calculateMissedVolumeFraction() {
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
//        tradesMap.headMap(testClock.currentMillis - testClock.millis()).values().forEach(stats::combine);

        // volume = price * size;
        //missedFraction = 1 - sum(privateMatchedVolume)/sum(publicMatchedVolume).
        return 0.0;
    }

    private static class TestClock extends Clock {

        private final ZoneId zone;
        private long currentMillis;

        private TestClock(ZoneId zone) {
            this.zone = zone;
        }

        @Override
        public ZoneId getZone() {
            return zone;
        }

        @Override
        public Clock withZone(ZoneId zone) {
            if (Objects.equals(this.zone, zone)) {
                return this;
            }
            return new TestClock(zone);
        }

        @Override
        public Instant instant() {
            return Instant.ofEpochMilli(millis());
        }

        @Override
        public long millis() {
            return currentMillis;
        }

    }

    public class Trade {
        int price;
        int size;
        long timestamp;
        boolean isPublic;

        public Trade(int price, int size, long timestamp, boolean isPublic) {
            this.price = price;
            this.size = size;
            this.timestamp = timestamp;
            this.isPublic = isPublic;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public boolean isPublic() {
            return isPublic;
        }

        public void setPublic(boolean aPublic) {
            isPublic = aPublic;
        }
    }
}
