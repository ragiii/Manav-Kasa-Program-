import java.util.Scanner;
public class main {
    public static void main(String[] args){
    
        double armutKg=2.14, elmaKg=3.67, domatesKg=1.11, muzKg=0.95, patlicanKg=5.00;
        double armutK,elmaK,domatesK,muzK,patlıcanK;
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Armut Kaç Kilo :");
        armutK= input.nextDouble();
        
        System.out.print("Elma Kaç Kilo :");
        elmaK = input.nextDouble();
        
        System.out.print("Domates Kaç Kilo :");
        domatesK = imput.nextDouble();
        
        System.out.print("Muz Kaç Kilo :");
        muzK =input.nextDouble();
        
        System.out.print("Patlıcan Kaç Kilo :");
        patlıcanK = input.nextDouble();
        
        double toplama=((armutF*armutK)+(elamK*elmaF)+(domatesF*domatesK)+(muzF*muzK)+(patlıcanF*patlıcanK));
        System.out.print("Toplama Tutar :"+toplama);

    }
}
