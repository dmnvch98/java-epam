package learn.tasks.task1;

public class NumToMonth {
    public static void main(String[] args) {
        new NumToMonth().getMonth();
    }
    public int askNumber(){
        int number;
        do {
            number = Integer.parseInt(Utils.ask("Enter number in range 1-12"));
        } while(number > 13 || number < 1);
        return number;
    }

    public void getMonth(){
        System.out.println(Month.values()[askNumber() - 1]);
    }
}
enum Month{
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}