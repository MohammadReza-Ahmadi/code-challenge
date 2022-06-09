package _0_2021;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

class SolutionTest {

    @Test
    public void test_0() throws IOException {
        set_input_and_call_main("trades.txt");
    }

    private void set_input_and_call_main(String scenarioFileName) throws IOException {
        final InputStream original = System.in;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(scenarioFileName);
        System.setIn(is);
        FlowTradeCodeChallenge.main(null);
        System.setIn(original);
    }



}