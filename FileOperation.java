package ua.i.sonne.homework5;

import java.io.*;

public class FileOperation {

    public static void fileCopy(File in, File out, String extension) throws IOException {

        File[] list = in.listFiles(pathname -> {
            int pointerIndex = pathname.getName().lastIndexOf(".");
            if (pointerIndex == -1) {
                return false;
            }
            return pathname.getName().substring(pointerIndex + 1).equals(extension);
        });

        byte[] buffer = new byte[1024 * 1024];

        for (File file : list) {
            int readByte = 0;
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(out + "\\" + file.getName())) {
                while ((readByte = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, readByte);
                }
            } catch (IOException e) {
                throw e;
            }
        }
    }

}