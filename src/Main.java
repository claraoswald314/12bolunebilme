import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        int toplam = 0;
        int i;
        int tekrar=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        k = scan.nextInt();
        for (i = 0; i <= k; i++) {
            if (i % 12 == 0) {
                toplam += i;
              


            }
        }
        tekrar = k/12;
        System.out.println(toplam/tekrar);


    }
}
