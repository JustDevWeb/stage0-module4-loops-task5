package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
    if(sideLength > 0){
        int middle = Math.round((float) sideLength /2);
        for (int i = 1; i <= sideLength; i++){
        String side = "";
        for (int j = 1; j <= sideLength; j++){
            if(i != middle){
                if( j == middle){
                    side += "8";
                }else {
                    side += " ";
                }
            } else {
                side += "8";
            }
        }
        System.out.println(side);
        }
    }
    }
}
