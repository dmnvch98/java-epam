package book.chapter2.variantA;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {
        private static final Scanner scanner = new Scanner(System.in);

    public static String[] askStringArr(String text){
        System.out.println(text);
        return scanner.nextLine().split(" ");
    }

    public static int[] askIntArr(String text){
        System.out.println(text);
        String[] userStringNums = scanner.nextLine().split(" ");
        int[] userNums = new int[userStringNums.length];
        for (int i = 0; i < userStringNums.length; i++){
            userNums[i] = Integer.parseInt(userStringNums[i]);
        }
        return userNums;
    }

    public static ArrayList<Integer> askIntList(){
        System.out.println("Enter num. To exit enter not num");
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            try{
                list.add(scanner.nextInt());
            }
            catch (InputMismatchException e){
                System.out.println("Not num entered. Exit...");
                flag = false;
            }
        }
        return list;
    }
}
