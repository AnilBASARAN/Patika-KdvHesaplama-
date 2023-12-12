import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // vergi öncesindeki ürün fiyatını soruyoruz
        System.out.println("Enter the product's price before tax");
        // productsPrice isimli değişkene kullanıcıdan aldığımız veriyi giriyoruz
        double productPrice = input.nextDouble();
        // vergi çarpanı 1.18 olarak belirlendi
        double taxConstant = (productPrice <= 1000 && productPrice >=0 )? 0.18 : 0.08 ;
        System.out.println("KDV'siz fiyat = " + productPrice);
        System.out.println("KDV'li fiyat = " + productPrice * (1+taxConstant) );
        System.out.println("KDV tutarı = " + productPrice * taxConstant );

        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
    }
}
