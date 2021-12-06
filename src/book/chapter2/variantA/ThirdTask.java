package book.chapter2.variantA;
/**
 *  Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
 * */
public class ThirdTask {
    public static void main(String[] args) {
       new ThirdTask().printNums();
    }

    public int findAvg(String[] arr){
        int avgNumber = arr[0].length();
        for (int i = 1; i < arr.length; i++){
            avgNumber = avgNumber + arr[i].length();
        }
        return avgNumber/ arr.length;
    }

    public void printNums(){
        String[] arr = Utils.askStringArr("Enter nums separated by space: ");
        int avgNum = findAvg(arr);
        System.out.println("Average num is: " + avgNum);

        for (String s : arr) {
            if (s.length() < avgNum) {
                System.out.println(s + "; Length = " + s.length());
            }
        }
    }
}
