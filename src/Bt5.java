import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm môn Toán :");
        int math = sc.nextInt();
        System.out.println("Nhập vào điểm môn Vật lý :");
        int physical = sc.nextInt();
        System.out.println("Nhập vào điểm môn Hóa học :");
        int chemistry = sc.nextInt();
        System.out.println("Nhập vào điểm môn Tiếng anh :");
        int english = sc.nextInt();
        System.out.println("Nhập vào điểm môn Văn :");
        int literature = sc.nextInt();
        double average = (math + physical + chemistry + english + literature) / 5;
        if (average >= 0 && average < 5) {
            System.out.println("Xếp loại Yếu");
        } else if (average >= 5 && average < 6.5) {
            System.out.println("Xếp loại Trung bình");
        }else if (average >= 6.5 && average < 8) {
            System.out.println("Xếp loại Khá");
        }else if (average >= 8 && average < 9) {
            System.out.println("Xếp loại Giỏi");
        }else if (average >= 9 && average < 10) {
            System.out.println("Xếp loại Xuất sắc");
        }
    }
}
