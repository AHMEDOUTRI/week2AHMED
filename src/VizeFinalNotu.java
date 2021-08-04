import java.util.Scanner;
public class VizeFinalNotu {

    public static void main( String[] args){
        float vizeScore,finalScore, average;
        System.out.println("Lütfen vize puanı giriniz:");
        Scanner input = new Scanner(System.in);
        vizeScore = input.nextFloat();
        System.out.println("Lütfen final puanı giriniz:");
        finalScore = input.nextFloat();
        average = (vizeScore*0.5f) +(finalScore*0.7f);
        calculateScoreLetters(average,vizeScore,finalScore);
    }
    public static void calculateScoreLetters(float average,float vizeScore,float finalScore){
        String symbolLetter = "";
        if (average>=0 && average<=20){
            symbolLetter = "FF";
        }else if (average>20 && average<=50){
            symbolLetter = "CB";
        }else if (average>50 && average<=70){
            symbolLetter = "BB";
        }else if (average>70 && average<=100){
            symbolLetter = "AA";
        }
        System.out.println("Girdiniz vize puanı:"+vizeScore+" ,final puanı:"+finalScore+", Ortalamanız:"+average );
        System.out.println("Harf notunuz: "+symbolLetter);

    }
}
