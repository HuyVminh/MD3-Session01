import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println("Nhập vào 1 số từ 0-9 :");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                result = "Số một";
                break;
            case 2:
                result = "Số hai";
                break;
            case 3:
                result = "Số ba";
                break;
            case 4:
                result = "Số bốn";
                break;
            case 5:
                result = "Số năm";
                break;
            case 6:
                result = "Số sáu";
                break;
            case 7:
                result = "Số bảy";
                break;
            case 8:
                result = "Số tám";
                break;
            case 9:
                result = "Số chín";
                break;
        }
        System.out.println("Số " + number + " sẽ đọc là " + result);
    }
}
