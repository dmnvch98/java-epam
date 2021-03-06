package learn.tasks.task1;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        new RandomValues().print();
    }

    public int getRandomQtyUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int askQty(){
        int value;
        do {
            value = Integer.parseInt(Utils.ask("Enter quantity of random values in range 2-100:"));
        } while(value > 100 || value < 2);
        return value;
    }
    
    public int[] getRandomValues(){
        int qty = askQty();
        int[] randomValues = new int[qty]; 
        for  (int i = 0; i < qty; i++){
            randomValues[i] = getRandomQtyUsingNextInt(0, 100);
        }
        return randomValues;
    }

    public void print(){
        int[] arr = getRandomValues();
        for (int randomValue: arr
             ) {
            System.out.println(randomValue);
        }

        for (int randomValue: arr
        ) {
            System.out.print(randomValue + " ");
        }
    }
}
