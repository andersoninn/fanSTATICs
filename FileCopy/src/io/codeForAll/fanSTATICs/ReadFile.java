package io.codeForAll.fanSTATICs;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public void readFromFile(String filePath) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(filePath);

        int byteRead = fileInputStream.read();

        if (byteRead == -1) {
            System.out.println("Nenhum byte lido (-1)");
        }

        byte[] buffer = new byte[1024];
        int num = fileInputStream.read(buffer);

        if (num != -1) {
            System.out.println("I have read this many bytes: " + num);
        }
        fileInputStream.close();

    }
}
