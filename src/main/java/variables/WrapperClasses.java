package variables;

public class WrapperClasses {

    //1:  Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
    //bulmak için bir kod yazınız.
    public static void main(String[] args) {
        byte min= Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println(min+max); //32639

      //2: Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız

        byte sayi1= Byte.valueOf("113");
        short sayi2= Short.valueOf("2351");
        System.out.println(sayi2-sayi1);



        //3) valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?

       /* parseByte() ilkel tamsayı (primitive integer) tipini (int) döndürürken; valueOf(), ilkel tamsayının
        nesne temsilcisi olan Java.lang.Integer'ı döndürür. Primitive türler yerine, bir tamasyı nesnesini
        isteyebileceğimiz durumlar da vardır.
        Bariz olan bir diğer fark ise; valueOf() bir örnek metod(instance method) iken parseByte() statik
        bir metoddur

        */












    }











}
