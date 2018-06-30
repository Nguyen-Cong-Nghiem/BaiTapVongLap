import java.util.Scanner;

public class LietKe20songuyentodau {
    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int numbers = sc.nextInt();
        int dem = 0;
        int i = 2;
        while (dem < numbers) {
            if (soNguyenTo(i)) {
                System.out.println(i + " ");
                dem++;
            }
            i++;
        }
    }
}








