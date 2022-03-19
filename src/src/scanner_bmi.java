import java.util.Scanner;

public class scanner_bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入身高(公尺):");
        float h = scanner.nextFloat();

        System.out.print("請輸入體重(公斤):");
        int w = scanner.nextInt();

        System.out.println("BMI為:" + w/(h*h));
    }
}
