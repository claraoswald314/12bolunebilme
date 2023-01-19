import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        int toplam = 0;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        k = scan.nextInt();
        for (i = 0; i <= k; i++) {
            if (i % 12 == 0) {
                toplam += i;


            }
        }
        System.out.println(toplam);


    }
}