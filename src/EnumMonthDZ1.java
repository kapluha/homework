import java.util.Scanner;

/**
 * Created by Anry on 21.04.2015.
 */

/*
* пользователь может ввести в консоли - и January, Jan, JANUARY, JAN, 1, 01
* а вернуть ты должен с помощью enam JANUARY
* */

// перечесление месяцов
enum myMonth {
    January, February, March, April, May, June, July, August, September, October, November, December;
}

public class EnumMonthDZ1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input month: ");
        int intMonth = -1, myError = 1;
        String stringMonth = "";
        if (sc.hasNextInt()){
            intMonth = sc.nextInt();
        }
        else {
            stringMonth = sc.nextLine();
        }

        for (myMonth month: myMonth.values()) {
            if (stringMonth != "") {
                if (stringMonth.toUpperCase().equals(month.toString().toUpperCase()) ||
                        stringMonth.toUpperCase().regionMatches(true, 0, month.toString().toUpperCase(), 0, stringMonth.length())
                        ) {
                    System.out.println("Injected month: " + month);
                    myError = 0;
                    break;
                }
            } else {
                if (intMonth != -1){
                    if (intMonth - 1 == month.ordinal()){
                        System.out.println("Injected month: " + month);
                        myError = 0;
                        break;
                    }
                } else {
                    System.out.println("ERROR!");
                    myError = 0;
                    break;
                }
            }
        }
        if (myError != 0)
            System.out.println("ERROR!");
    }
}