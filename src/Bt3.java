import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số cần đọc :");
        int value = sc.nextInt();
        if (value >= 1 && value <= 999) {
            String result = "";
            int hundreds = value / 100;
            int tens = (value % 100) / 10;
            int ones = value % 10;
            if (hundreds > 0) {
                result += getDigitInWord(hundreds) + "hundred ";
            }
            if (tens == 1) {
                result += "and " + getTeensInWord(value % 100);
            } else {
                if (tens > 1) {
                    result += getTensInWord(tens) + "-";
                }
                if (ones > 0) {
                    result += "and " + getDigitInWord(ones);
                }
            }
            System.out.println("Số cần đọc là " + result);
        } else {
            System.out.println("Out of Ability");
        }
    }

    public static String getDigitInWord(int digit) {
        switch (digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String getTeensInWord(int teens) {
        switch (teens) {
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String getTensInWord(int tens) {
        switch (tens) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}
