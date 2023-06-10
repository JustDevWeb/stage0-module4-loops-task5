package school.mjc.stage0.loops.task5;

import java.lang.reflect.Array;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height > 0) {
            for (int i = 1; i <= height; i++) {
                String side = "";
                int spaces = i % 2 == 0 ? 1 : 2;
                if (height % 2 == 0) {
                    if(i > height / 2){
                        spaces = i % 2 == 0 ? 2 : 1;
                    }
                }
                for (int j = 1; j <= height; j++) {
                    if ((j <= spaces || j > height - spaces) && i != 1 && i != height) {
                        side += " ";
                    } else {
                        side += "8";
                    }
                }
                System.out.println(side);
            }
        }
    }
}

