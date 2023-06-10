package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {
            String side = "";
            for(int j = 1; j <= i; j++) {
                side += "8";
            }
            System.out.println(side);
        }
    }
}
