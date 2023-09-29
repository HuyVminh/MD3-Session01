import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width;
        double height;
        System.out.println("Enter width (m) : ");
        width = sc.nextDouble();
        System.out.println("Enter height (m) : ");
        height = sc.nextDouble();
        double area = width * height;
        double perimeter = width * height;
        System.out.println("Diện tích hình chữ nhật là " + area + " m");
        System.out.println("Chu vi hình chữ nhật là " + perimeter + " m");
    }
}
