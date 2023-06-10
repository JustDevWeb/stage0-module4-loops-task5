package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if( length != 0 && height != 0) {
            for(int i = 1; i <= height; i++){
                String line = "";
                for (int j = 1; j <= length; j++) {
                    if(i != 1 && i != height) {
                        if(j == 1 || j == length) {
                            line += "8";
                        }else {
                            line += " ";
                        }
                    }else {
                       line += "8";
                    }
                }
                System.out.println(line);
            }
        }
    }
}
