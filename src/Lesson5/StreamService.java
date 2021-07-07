package Lesson5;

import java.io.*;

import static sun.java2d.cmm.ColorTransform.Out;

public class StreamService {

    private StreamService () {
    }
    public static void  fileCopy(File in, File out) throws  IOException{
        try (InputStream is = new FileInputStream(in);
                 OutputStream os = new FileOutputStream(out)){
            copy(is, os);
        }catch (IOException e) {
            throw e;
        }

    }

    public static void copy(InputStream is, OutputStream os) throws IOException {
        byte [] bufeer = new byte[10_000_000];
        int readByte = 0;
        for (;(readByte = is.read(bufeer)) >0;) {
            os.write(bufeer, 0, readByte);
        }
    }

}
