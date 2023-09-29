import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra :");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Số " + number + " chia hết cho cả 3 và 5");
        } else {
            if (number % 3 == 0) {
                System.out.println("Số " + number + " chỉ chia hết cho 3 mà không chia hết cho 5");
            } else if (number % 5 == 0) {
                System.out.println("Số " + number + " chỉ chia hết cho 5 mà không chia hết cho 3");
            } else {
                System.out.println("Số " + number + " không chia hết cho 3 và 5");
            }
        }
    }
}
