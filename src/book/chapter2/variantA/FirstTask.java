package book.chapter2.variantA;

/**
 * @author Eugen Demyanobivh
 * Created 11/28/2021
 *
 *  Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
 * */

public class FirstTask {
    public static void main(String[] args) {
        System.out.println(new FirstTask().FindShortLongValues());
    }

    public String FindShortLongValues(){
        String min;
        String max;
        int minLength;
        int maxLength;

        String[] userNums = Utils.askStringArr("Enter nums separated by space: ");
        minLength = maxLength = userNums[0].length();
        min = max = userNums[0];

        for (int i = 1; i < userNums.length; i++){
            if (userNums[i].length() < minLength){
                minLength = userNums[i].length();
                min = userNums[i];
            }
            else if (userNums[i].length() > maxLength){
                maxLength = userNums[i].length();
                max = userNums[i];
            }
        }
        return String.format("Max value: %s. Length: %d \nMin value: %s. Length: %d", max, maxLength, min, minLength);
    }
}
