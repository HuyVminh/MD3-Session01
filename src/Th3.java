import java.util.Scanner;

public class Th3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width;
        double height;
        System.out.println("Enter width (m) : ");
        width = sc.nextDouble();
        System.out.println("Enter height (m) : ");
        height = sc.nextDouble();
        double result = width * height;
        System.out.println("Area is " + result + " m");
    }
}
