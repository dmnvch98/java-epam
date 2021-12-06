package book.chapter2.variantA;

import java.util.*;

/** Найти число, в котором число различных цифр минимально. Если таких
 чисел несколько, найти первое из них.
 */
public class FourthTask {
    public static void main(String[] args) {
        new FourthTask().findShortest();
    }

    private static int diffNum(long x){
        HashSet<Integer> nums = new HashSet<>();
        while (x>0){
            nums.add((int) (x%10));
            x/=10;
        }
        return nums.size();
    }

    private void findShortest(){
        Map<Integer, Integer> nums = new TreeMap<>();
        ArrayList<Integer> list = Utils.askIntList();
        int firstNumSize = diffNum(list.get(0));
        nums.put(firstNumSize, list.get(0));

        for (int i = 1; i < list.size(); i++){
            int numSize = diffNum(list.get(i));
            if (numSize < firstNumSize){
                nums.clear();
                nums.put(numSize, list.get(i));
            }
        }
        for (Map.Entry<Integer, Integer> pair : nums.entrySet()) {
            System.out.printf("%d: Different numbers QTY = %d", pair.getValue(), pair.getKey());
        }
    }
}
