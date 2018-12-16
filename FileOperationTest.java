package ua.i.sonne.homework5;

import java.io.File;
import java.io.IOException;

public class FileOperationTest {

    public static void main(String[] args) {
        File dirIn = new File("C:\\Users\\m-g20\\Downloads\\");
        File dirOut = new File("C:\\Users\\m-g20\\Downloads\\pdf\\");
        try {
            FileOperation.fileCopy(dirIn, dirOut, "pdf");
        } catch (IOException e) {
            System.out.println("Error copy file!");
        }



    }

}
