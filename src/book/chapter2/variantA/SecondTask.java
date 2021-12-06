package book.chapter2.variantA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
 *
 */
public class SecondTask {
    public static void main(String[] args) {
        System.out.println(new SecondTask().sortArr());
    }

    public ArrayList<String> sortArr(){
        String[] userNums = Utils.askStringArr("Enter nums separated by space: ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(userNums));
        LengthComparator lengthComparator = new LengthComparator();
        list.sort(lengthComparator);
        return list;
    }
}

class LengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
