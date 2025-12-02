package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class CopyBinaryFile {
    public static void main(String[] args) {
        String path = "C:/Users/stefa/Downloads";
        String userInputFile;
        String inputFile;
        String outFile;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert input file name");
        userInputFile = in.nextLine();


        inputFile = path + userInputFile;
        String extension = "";
        int extensionIndex = inputFile.lastIndexOf('.');
        if (extensionIndex > 0 && extensionIndex < inputFile.length() - 1) {
            extension = inputFile.substring(extensionIndex);
        }
        outFile = path + UUID.randomUUID().toString().replace("-", "") + extension;

        File inNewFile = new File(inputFile);
        File outNewFile = new File(outFile);
        byte[] buf = new byte[4096];
        int byteCounter;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inNewFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outNewFile))) {
            while ((byteCounter = bis.read(buf)) != -1) {
                bos.write(buf, 0, byteCounter);
            }
            System.out.println(inNewFile.getAbsolutePath());
            System.out.println(outNewFile.getAbsolutePath());
            System.out.println("Extension alone: " + extension);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

