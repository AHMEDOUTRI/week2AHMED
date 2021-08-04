
import java.util.Scanner;

    public class Stationery {
        public static void main(String[] args)
        {
            int kalem = 0;
            int silgi = 0;
            while(true)
            {
                System.out.println("Lütfen çıkmak için 0'a, ürün eklemek için 1'e basın.");
                Scanner input = new Scanner(System.in);
                int cıkıs = input.nextInt();
                if(cıkıs==0)
                {
                    break;
                }
                else{
                    System.out.println("Ürün adını girin:");
                    Scanner urun = new Scanner(System.in);
                    String product = urun.nextLine();

                    System.out.println("Ürün sayısını girin:");
                    Scanner adet = new Scanner(System.in);
                    int number = adet.nextInt();

                    if (product.equals("Kalem"))
                    {
                        kalem += number;
                    }
                    else if(product.equals("Silgi"))
                    {
                        silgi += number;
                    }
                    else
                    {
                        System.out.println("Geçerli bir ürün seçiniz!");
                    }
                }
                System.out.println("Toplam" + kalem + " kalem satın aldı.");
                System.out.println("Toplam" + silgi + " silgi satın aldı." );
                System.out.println("Satın alınan toplam ürün sayısı: "+ (kalem + silgi));
            }
        }
    }

