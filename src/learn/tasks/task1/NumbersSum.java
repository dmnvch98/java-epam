package learn.tasks.task1;

import java.util.Arrays;

public class NumbersSum {
    public static void main(String[] args) {
        new NumbersSum().numsSum();
    }


    public void numsSum(){
        String[] arr = Utils.ask("enter nums separated by space").split(" ");
        int sum = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .sum();
        int prd = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Sum = " + sum + "\nProduct = " + prd);
    }
}
