package learn.tasks.task1;

import java.util.Scanner;

public class ArgumentsViceVersa {
    public static void main(String[] args) {
        new ArgumentsViceVersa().printArguments();
    }
    public static String askArguments(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter nums separated by space: ");
        return scanner.nextLine();
    }

    public void printArguments(){
        char[] argumentsArr = askArguments().toCharArray();
        for (int i = argumentsArr.length - 1; i >= 0; i--){
            System.out.print(argumentsArr[i]);
        }
    }
}
