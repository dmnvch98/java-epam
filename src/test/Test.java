package test;

public class Test {
    public static void main(String[] args) {
        String arg = "71e";
        try{
            int value1 = Integer.parseInt(arg);
            Integer value2 = Integer.valueOf(arg);
            Integer value3 = Integer.decode(arg);

        } catch (NumberFormatException e) {
            System.err.println(e);
        }

    }
}
