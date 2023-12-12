import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // vergi öncesindeki ürün fiyatını soruyoruz
        System.out.println("Enter the product's price before tax");
        // productsPrice isimli değişkene kullanıcıdan aldığımız veriyi giriyoruz
        double productPrice = input.nextDouble();
        // vergi çarpanı 1.18 olarak belirlendi
        double taxConstant = 0.18;
        System.out.println("KDV'siz fiyat = " + productPrice);
        System.out.println("KDV'li fiyat = " + productPrice * (1+taxConstant) );
        System.out.println("KDV tutarı = " + productPrice * taxConstant );
    }
}
