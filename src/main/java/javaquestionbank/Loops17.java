package javaquestionbank;

public class Loops17 {

    public static void main(String[] args) {

        //Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
       // 1. Yol:

//        int n = 753;
//        int sumOfDigits = 0;
//        for(int i = n; i>0; i=i/10){
//            sumOfDigits = sumOfDigits + i%10;
//        }
//        System.out.println(sumOfDigits);


        //2. Yol:
//        int num = 753;
//        int sumOfDigits = 0;
//        while(num>0){
//            sumOfDigits = sumOfDigits + num%10;
//            num = num/10;
//        }
//        System.out.println(sumOfDigits);


        //3. Yol:
        int num = 753;
        int sumOfDigits = 0;
        do{
            sumOfDigits = sumOfDigits + num%10;
            num = num/10;
        }while(num>0);
        System.out.println(sumOfDigits);
    }


}
