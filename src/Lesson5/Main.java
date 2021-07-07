package Lesson5;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File in = new File ("D:\\Course\\Java Start(All cource).pdf");

        File out = new File(in.getName());

        try {
            StreamService.fileCopy(in, out);
            System.out.println("Done!");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
