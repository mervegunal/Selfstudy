package javaquestionbank;

public class Loops18 {

    public static void main(String[] args) {

        //Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //Örneğin; Hello ==> Heo
        //1. Yol:

        String s = "Hello";
        for(int i=0; i<s.length();i++){
            String c = s.substring(i,i+1);
            if(s.indexOf(c) == s.lastIndexOf(c)){

                System.out.print(c);
            }

        }



        //2.Yol:

//        String s = "Hello";
//        int i = 0;
//        while(i<s.length()){
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c) == s.lastIndexOf(c)){
//                System.out.print(c);
//            }
//            i++;
//        }


       //3.Yol:
//
//        String s = "Hello";
//        int i = 0;
//        do{
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c) == s.lastIndexOf(c)){
//                System.out.print(c);
//            }
//            i++;
//        }while(i<s.length());
//
    }
}
