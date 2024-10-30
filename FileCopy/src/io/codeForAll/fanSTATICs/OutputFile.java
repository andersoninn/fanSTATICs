package io.codeForAll.fanSTATICs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFile {
    public void writeFile(String filePath) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        byte b = 0x37;
        fileOutputStream.write(b);

        byte[] buffer = filePath.getBytes();
        fileOutputStream.write(buffer);

        fileOutputStream.close();
    }
}
