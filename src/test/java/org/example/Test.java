package org.example;

import com.google.common.io.Files;

public class Test {
    public static void main (String[] arg) {

        System.out.println("TEST");

    }

    public String getExtensionByGuava(String filename) {
        return Files.getFileExtension(filename);
    }

}
