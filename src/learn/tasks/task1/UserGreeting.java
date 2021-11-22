package learn.tasks.task1;

public class UserGreeting {

    public static void main(String[] args) {
	    new UserGreeting().greetings();
    }

    public void greetings(){
        System.out.println("Hello " + askName());
    }

    public static String askName(){
        return Utils.ask("what is your name? ");
    }
}
