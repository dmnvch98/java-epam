package learn.tasks.task1;

public class ArgumentsViceVersa {
    public static void main(String[] args) {
        new ArgumentsViceVersa().printArguments(args);
    }

    public void printArguments(String[] arr){
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
