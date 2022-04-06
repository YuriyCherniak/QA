package youtubeCourse;

import org.testng.annotations.Test;

import java.io.IOException;

public class lesson7 {

    public static void main (String[] args) throws IOException {
        int box = 0;
        while (box < 20) {
            box = box+2;
            if (box%2 != 0) continue;
            System.out.println(box);
        }

    }
}
