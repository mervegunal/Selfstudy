package javaquestionbank;

public class Loops19 {
    public static void main(String[] args) {

        //19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.

//        String s = "Java is a strongly typed, object-oriented programming language.";
//        s = s.replaceAll("\\s","").replaceAll("\\p{Punct}", "");
//
//        System.out.println(s.length());

        //20)Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        int sayi=6;
        String s = "";
        for(int i=1; i<=sayi; i++){
        for(int k= sayi; k>=i; k--){
         s = s + "* ";
        }
        System.out.println(s);
        s = "";
        }
    }
}
