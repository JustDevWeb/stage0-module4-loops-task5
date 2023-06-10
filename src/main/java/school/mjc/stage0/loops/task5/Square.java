package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if( sideLength != 0 ) {
            for(int i = 1; i <= sideLength; i++){
                String line = "";
                for (int j = 1; j <= sideLength; j++) {
                    if(i != 1 && i != sideLength) {
                        if(j == 1 || j == sideLength) {
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
