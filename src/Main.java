//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println("Sum from 1 to 10 is: " + sum(1, 10));
        System.out.println("Sum from 1 to 10 is: " + sum(20, 37));
        System.out.println("Sum from 1 to 10 is: " + sum(35, 49));
        System.out.println("Sum from 1 to 10 is: " + sum(36, 59));
        double[] mylist = {1.3, 2.5, 1.3, 9.2, 1.3, 4.5, 1.2, 7.5, 8.9, 5.4};
    }

}