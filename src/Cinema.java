import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Cinema {


    public static void main(String[] args) {
        System.out.println("Bilet indiriminiz : " + DiscountValue() + "%\nİyi günler ");
    }


    public static int DiscountValue() {

        List<String> moviesTypes = new ArrayList<>();
        moviesTypes.add("Korku");
        moviesTypes.add("Romantik");
        moviesTypes.add("Komedi");
        moviesTypes.add("Aksiyon");

        int age = 0;
        int ticketDiscount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sinemaya Hoş Geldiniz! " + "\nLütfen yaşını gir: ");
        age = scanner.nextInt();
        if (age > 18 && age < 25)
            ticketDiscount += 5;
        if (age <= 18)
            ticketDiscount += 10;

        System.out.println("Lütfen izlemek istediğiniz film türünü giriniz: " +
                "\nBunlar elimizdeki film türleri : \n Korku, Romantik, Komedi, Aksiyon");
        String movieType = scanner.next();
        if (moviesTypes.get(0).equals(movieType))
            ticketDiscount += 10;

        return ticketDiscount;
    }
}
