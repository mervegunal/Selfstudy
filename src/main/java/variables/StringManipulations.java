package variables;

public class StringManipulations {
    public static void main(String[] args) {

        //1- Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
       // ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
       //yazdırınız.

        //orn Örnek: mIAMI - Miami
        // miami - Miami
        // MIAMI - Miami
        // mIaMi - Miami vb.

        String sehirIsim= "mIAMI";
        String konsolSehirIsim = sehirIsim.trim().toLowerCase();
        konsolSehirIsim = konsolSehirIsim.substring(0,1).toUpperCase() + konsolSehirIsim.substring(1);












    }
}
