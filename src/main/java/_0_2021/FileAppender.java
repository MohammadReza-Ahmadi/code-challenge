package _0_2021;

import java.io.*;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;


public class FileAppender {
    private volatile String fileName;
    private Set<Integer> DataSizes = ConcurrentHashMap.newKeySet();
    private volatile Long lcd;

    public void setFileName(String fileName) {
        if (fileName != null) {
            fileName = fileName + System.currentTimeMillis() + ".output";
        }
        this.fileName = fileName;
    }

    public int getLastAppendedLength() {
        return (int) DataSizes.toArray()[DataSizes.size() - 1];
    }

    public long getLcd() {
        return lcd;
    }

    public Set<Integer> getDataSizes() {
        return DataSizes;
    }

    // Returns true if data was written succesfully
    public boolean writeDataToFile(String filePath, byte[] data) {
        AtomicBoolean success = new AtomicBoolean(false);
        new Thread(() -> {
            if (fileName != null) {
                try {
                    doWrite(data, fileName);
                    success.set(true);
                } catch (Throwable e) {

                }
            }
        }).start();
//        return success.get() != true;
        return success.get();
    }

    synchronized void doWrite(byte[] data, String fileName) throws Exception {
        long started = System.currentTimeMillis();
        OutputStream outputStream = new FileOutputStream(new File(fileName));
        outputStream.write(data);
        //
        outputStream.close();
        DataSizes.add(data.length);
        lcd = System.currentTimeMillis() - started;
    }
}
