import java.util.Scanner;

public class HCF {
        public static int findHCF(int a, int b) {
                while (b != 0) {
                        int temp = b;
                        b = a % b;
                        a = temp;
                }
                return a;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int hcf = findHCF(num1, num2);
                System.out.println(hcf);
                sc.close();
        }

}
