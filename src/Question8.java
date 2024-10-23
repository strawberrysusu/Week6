import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("값을 입력하세요: ");
        int num1 = scanner.nextInt();

        boolean flag = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == num1) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("존재합니다");
        } else {
            System.out.println("존재하지 않습니다");
        }

        scanner.close();
    }
}
