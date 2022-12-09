package javaquestionbank;

public class Loops21 {
    public static void main(String[] args) {
       // 21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
       // Orn:12133455 ´ 2+4=6

        int p = 12133455;
        String r = String.valueOf(p);
        int sumOfUniqueDigits = 0;
        for(int i=0; i<r.length(); i++){
            String c = r.substring(i,i+1);
            if(r.indexOf(c)==r.lastIndexOf(c)){
                sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(c);
            }
        }
        System.out.println(sumOfUniqueDigits);



        //22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.

        for(int i=3; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.print(i + " ");





        }
    }
}
