package javaquestionbank;

public class Loops16 {

    public static void main(String[] args) {

        //.Yol:

//        String s = "Christmas";
//        String result = "";
//
//        for(int i=0; i<s.length(); i++){
//            String c = s.substring(i, i+1);
//            if(c.equals("m")){
//                break;
//            }
//            result = result + c;
//        }
//        System.out.println(result);
//    }
//
        //2.Yol:

//        String s = "Christmas";
//        String result = "";
//        int i = 0;
//        while (i<s.length()){
//            String c = s.substring(i,i+1);
//            if(c.equals("m")){
//                break;
//            }
//            result = result + c;
//            i++;
//        }
//        System.out.println(result);

        //3.Yol:

        String s = "Christmas";
        String result = "";
        int i=0;
        do{
            String c = s.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;;
            i++;
        }while( i<s.length());
        System.out.println(result);





    }
}
