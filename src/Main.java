import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        int x = 5;

        switch (x) {
            case 2:
            case 4:
            case 6:
                out.println("We are in class");
                break;
            case 1:
            case 3:
            case 5:
                out.println("We are free");
                break;
            case 7:
                out.println("Sunday");
                break;
            default:
                out.println("There is no such day of the week");
        }

        // 1
        int [] myArrayFirst = new int[10];

        for (int i = 0; i < myArrayFirst.length; i ++) {
            myArrayFirst[i] = 2;
        }
        out.println(Arrays.toString(myArrayFirst));

        // 2
        int [] myArraySecond = new int[101];

        for (int i = 1; i < myArraySecond.length; i ++) {
            myArraySecond[i] = i;
            out.print(myArraySecond[i] + ",");
        }
        out.println();
    }
}