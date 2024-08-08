package Utility;

public class MyFunction {
    public static void OptionalWait(int sec){
        try {
            Thread.sleep(sec*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int RandomNumberGenerator(int border){
        return (int)(Math.random()*border);
    }
}