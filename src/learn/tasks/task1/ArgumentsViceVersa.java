package learn.tasks.task1;

public class ArgumentsViceVersa {
    public static void main(String[] args) {
        new ArgumentsViceVersa().printArguments();
    }
    public static String askArguments(){
        return Utils.ask("enter nums separated by space:");
    }

    public void printArguments(){
        char[] argumentsArr = askArguments().toCharArray();
        for (int i = argumentsArr.length - 1; i >= 0; i--){
            System.out.print(argumentsArr[i]);
        }
    }
}
