package learn.tasks.task1;

import java.util.Scanner;

public class UserGreeting {

    public static void main(String[] args) {
	    new UserGreeting().greetings();
    }

    public void greetings(){
        System.out.println("Hello " + askName());
    }

    public static String askName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        return scanner.next();
    }
}
