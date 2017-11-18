
package model;
import java.util.Random;

public class HeadsOrTails {
    
    public static int getHeadResult(int maxValue){
        Random random = new Random();
        int heads = 0, tails = 0;
        int result = 0;
        for (int i = 0; i < maxValue; i++) {
            result = random.nextInt(2);
            if (result == 0) {
                tails++;
            }
        }
        
        
        return tails;
    }
    
    private static int heads(int maxValue,int tails){
        return maxValue - tails;
    }
}