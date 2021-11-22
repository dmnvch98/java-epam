package learn.tasks.task1;

import java.util.Scanner;

public final class Utils {
    public static String ask(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextLine();
    }
}
