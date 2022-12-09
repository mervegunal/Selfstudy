package variables;

import java.util.Scanner;

public class Variables01 {

    //1- Herhangi bir 3 ögenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
    //toplamını konsola yazdırınız.

    public static void main(String[] args) {
        double gomlekFiyat= 12.99;
        double sapkaFiyat=23.99;
        double ayakkabiFiyat= 15.99;

        System.out.println("Toplam Fiyat" +" "+ (gomlekFiyat + sapkaFiyat + ayakkabiFiyat));


        //2- Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        //değişkenlerin değerlerinin çarpımını konsolda yazdırınız.

        float x = 15.99F;
        long y = 13L;
        int z = 12;
        System.out.println("Degiskenlerin carpimi:" + x*y*z);

        //3- Basit faizi bulmak için bir kod yazınız.
        //Not: Basit faiz formülü = anapara * oran * yılDegeri /100

        int anapara= 10000, oran=6, yilDegeri=3;
        int basitFaiz = anapara*oran*yilDegeri/100;
        System.out.println("Basit faiz degeri:"+ basitFaiz);

        //4- Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        //toplamını ve çarpımını String ile yazdırınız

        String s = "Sonuc";
        Long a = 123L;
        Long b = 9123456782L;
        System.out.println(s+(a+b));
        System.out.println(s+a*b);

        //5- Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
        //ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.

        boolean m = true;
        boolean n = false;
        System.out.println(m + " " +n);

        //6- 3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        //Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız

        float kitap = 12.99F, defter= 23.45F, laptop=34.12F;
        float toplamFiyat= 2*kitap+4*defter+3*laptop;
        System.out.println("Toplam fiyat:" + toplamFiyat);


        //7- İki tamsayiyi degistirmek icin bir kod yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayi giriniz:");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Degistirmeden once:" + n1 + "-" + n2);

        //1.Yol: 3. degisken kullanarak
        double temp = n1;
        n1=n2;
        n2=temp;
        System.out.println("Degistirdikten sonra: "+ n1 + "-" + n2);

        //2.Yol:
        n1= n1+ n2;
        n2=n1-n2;
        n1=n1 - n2;
        System.out.println("Degistirdikten sonra:" + n1 + "-" + n2);










    }





}
