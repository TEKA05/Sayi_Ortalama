import java.util.Scanner;

//Kullanıcıdan alınan bir limit değere kadar (limit tekse limit de dahil) olan pozitif
// tek tam sayıların toplamının ortalamasını hesaplayan bir fonksiyon yazınız.

public class Limit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Limit Değeri Giriniz : ");
        int limitDeger = scan.nextInt();

        if (limitDeger <= 2 || limitDeger >=999)
        {
            System.out.println("Limit Değerin 1000'den Büyük ve 1'den Küçük Olmamalıdır ");
        } else {
            tekSayilarinOrtalamasiniBul(limitDeger);
        }

    }


    private static int tekSayilarinOrtalamasiniBul(int limit) {
        int toplam = 0;

        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                toplam += i;
            }
        }
        System.out.println("Limit Değeri Olarak Girdiğiniz Tek Sayıların Toplamı = " + toplam);
        return toplam;
    }
}
