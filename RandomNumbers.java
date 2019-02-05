
package randomnumbers;

import java.util.Random;
public class RandomNumbers {

    
    public static void main(String[] args) {
        Random num = new Random();
        int number;
        for(int counter=1;counter<=5;counter++){
            number = num.nextInt(11);
            System.out.println(number);
        }
    }
    
}
