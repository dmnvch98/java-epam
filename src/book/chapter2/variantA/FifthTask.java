package book.chapter2.variantA;

import java.util.ArrayList;

/** Найти количество чисел, содержащих только четные цифры, а среди них —
 количество чисел с равным числом четных и нечетных цифр.
 */
public class FifthTask {
    public static void main(String[] args) {
        new FifthTask().findEvenNums();
    }
    public void findEvenNums(){
        ArrayList<Integer> allNums = Utils.askIntList();
        ArrayList<Integer> evenNums = new ArrayList<>();
//        for (Integer num:allNums
//             ) {
//            while (num>0){
//                int x = num % 10;
//                if (isEven(x)) {
//                    num/=10;
//                } else {
//                    num = 0;
//                    allNums.remove(num);
//                }
//
//            }
//
//        }
        for (Integer allNum : allNums) {
            int temp, temp2;
            temp = temp2 = allNum;
            while (temp > 0) {
                temp = temp % 10;
                if (!isEven(temp)) {
                    temp = 0;
                } else {
                    evenNums.add(temp2);
                    
                }

            }
        }

    }

    public static boolean isEven(int num){
        return (num % 2) == 0;
    }
}
