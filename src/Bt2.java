import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tỉ giá hiện tại là 23000 VNĐ/USD");
        System.out.println("Nhập giá trị cần quy đổi (USD): ");
        int value = scanner.nextInt();
        final int exchange = 23000;
        int result = value * exchange;
        System.out.println("Giá trị VND sau khi quy đổi là : " + result);
    }
}
