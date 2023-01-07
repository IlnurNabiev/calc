import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static String calc(String input) throws ArrayIndexOutOfBoundsException{

        String[] symvoly = array(input);
        if (symvoly.length != 3) {
            throw new ArrayIndexOutOfBoundsException("формат математической операции не удовлетворяет заданию");
        }

        String number1 = symvoly[0];
        char operation = symvoly[1].charAt(0);
        String number2 = symvoly[2];

        int a = convert(number1);
        int b = convert(number2);
        int result = 0;

        if (a < 0 || b < 0) {
            try {
                a = parseInt(number1);
                b = parseInt(number2);
                result = Calc(a, b, operation);
                System.out.println(result + " ");
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
            }
        } else {
            result = Calc(a, b, operation);
            String resultRoman = convertNumToRoman(result);
            System.out.println(resultRoman);
        }
        return String.valueOf(result);
    }



    public static String[] array(String strings) {
        String[] symvoly = strings.split(" ");
        String[] array = new String[symvoly.length];
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (symvoly[i].equals(" ")) {
                continue;
            } else {
                array[a] = symvoly[i];
                a++;
            }

        }
        return array;
    }

    public static int convert(String value) {
        int number = -1;
        if (value.equals("I")) {
            return number = 1;
        } else if (value.equals("II")) {
            return number = 2;
        } else if (value.equals("III")) {
            return number = 3;
        } else if (value.equals("IV")) {
            return number = 4;
        } else if (value.equals("V")) {
            return number = 5;
        } else if (value.equals("VI")) {
            return number = 6;
        } else if (value.equals("VII")) {
            return number = 7;
        } else if (value.equals("VIII")) {
            return number = 8;
        } else if (value.equals("IX")) {
            return number = 9;
        } else if (value.equals("X")) {
            return number = 10;
        }

        return number;
    }

    private static String convertNumToRoman(int nomer) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        try {
            String s = roman[nomer];
            return s;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В римской системе нет отрицательных чисел");
        }
        return null;
    }

    public static int Calc(int a, int b, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                return result = a + b;
            case '-':
                return result = a - b;
            case '*':
                return result = a * b;
            case '/':
                return result = a / b;
        }

        return result;
    }


    public static void main(String[] args)  {
        String input = sc.nextLine();
        calc(input);
    }
}







