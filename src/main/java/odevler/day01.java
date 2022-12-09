package odevler;

public class day01 {

    public static void main(String[] args) {

     //Example 1:
//        String a ="Hello";
//        String b = "World";
//        System.out.println(a+b); //HelloWorld
//        System.out.println(a+" "+b); //Hello World

        //Example 2:
        String a ="Hello";
       int b = 2;
       int c = 3;
        System.out.println(a+b+c); //Hello23
        System.out.println(c+b+a); //5Hello
        System.out.println(a+(b+c)); //Hello5
        System.out.println(a+b*c); //Hello6


        //Example 3:
        String str1= "Java";
        String str2= "Guzel";
        int sayi1= 5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1 + sayi2); //Java Guzel 54
        System.out.println(str1+" "+sayi1+" "+str2); //Java 5 Guzel
        System.out.println(str1+" "+ sayi1*sayi2); //Java 20
        System.out.println(str1+" "+(sayi1+sayi2)+sayi2); //Java 94
        System.out.println(sayi1 + sayi2+" "+str2); //9 Guzel

        //Example 3 :
        boolean sonuc1= 5+2>=7;
        System.out.println(sonuc1);
        System.out.println(5*2>15);

         //&&:
        boolean sonuc2=(5+2==7) && (4+3!=5); //True
        System.out.println(sonuc2);
        System.out.println((5*2!=15) && (5>7)); //False

        // ||:
        boolean sonuc3=(5+2 ==7) || (4+3!=5); //True
        System.out.println(sonuc3);
        System.out.println((5*2 == 15) || (5>7)); //False








    }
}
