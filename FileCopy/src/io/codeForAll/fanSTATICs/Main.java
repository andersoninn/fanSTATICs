package io.codeForAll.fanSTATICs;

import java.io.FileInputStream;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {
        ReadFile reader = new ReadFile();
        String filePath = "/Users/codecadet/Documents/teste.rtf";

        OutputFile outputFile = new OutputFile();

        // try, catch from reader
        try{
            reader.readFromFile(filePath);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        // try, cath from writer
        try{
            System.out.println("file copy");
            outputFile.writeFile("/Users/codecadet/Documents/teste-copy.rtf");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}