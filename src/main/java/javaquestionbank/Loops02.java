package javaquestionbank;

public class Loops02 {

    public static void main(String[] args) {

    // 2) Bir Stringde tekrarlanan karakterleri yazdirmak icin kod yaziniz.
        //orn; accessories => ces

        //1.Yol:
        String s= "accessories";
        String d="";

        for(int i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);

            if(s.indexOf(c)!= s.lastIndexOf(c)){
                if(!d.contains(c)){
                    d = d + c;
        }

            }
        }
        System.out.println(d);

        //2.Yol:

//        String s = "accessories";
//        String d = "";
//        Integer i=0;
//        while(i<s.length()){
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c)!=s.lastIndexOf(c)){
//                if(!d.contains(c)){
//                    d = d + c;
//                }
//            }
//            i++;
//        }
//        System.out.println(d);
//
//        //3.Yol:
//
//        String s = "accessories";
//        String d = "";
//        Integer i=0;
//        do{
//            String c = s.substring(i,i+1);
//            if(s.indexOf(c)!=s.lastIndexOf(c)){
//                if(!d.contains(c)){
//                    d = d + c;
//                }
//            }
//            i++;
//        }while(i<s.length());
//        System.out.println(d);


















    }


}
