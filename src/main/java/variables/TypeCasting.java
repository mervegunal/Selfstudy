package variables;

public class TypeCasting {
    public static void main(String[] args) {

     //1)   Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
         short yas =12;
         int yeniYas=yas;

     //2) Long data tipinde bir degisken olusturunuz ve onu int degiskenine donusturunuz
        long sayi =12L;
        int yeniSayi= (int)sayi;

     //3) Double data tipinde bir degisken olusturunuz ve onu bir float degiskenine donusturunuz
        double fiyat=2.34;
        float yeniFiyat=(float)fiyat;


     //4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        //Sonrasında bu short değişkenin değerini konsolda yazdırınız.

        //Not: Cıktıya dikkat ediniz ondalik bir deger olmayacaktir.

        double num= 1.2;
        short yeniNum=(short)num;
        System.out.println(yeniNum);

        //5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        //Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

     byte age= 26;
     double newAge= age;
        System.out.println(newAge);




















    }


}
