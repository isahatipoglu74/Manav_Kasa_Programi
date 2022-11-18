import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner meyv=new Scanner(System.in);

      double armut,elma,domates,muz,patlican;

        System.out.print("Armut Kaç Kilo=");
        armut=meyv.nextDouble();
        System.out.print("Elma Kaç Kilo=");
        elma=meyv.nextDouble();
        System.out.print("Domates Kaç Kilo=");
        domates=meyv.nextDouble();
        System.out.print("Muz Kaç Kilo=");
        muz=meyv.nextDouble();
        System.out.print("Patlican Kaç Kilo=");
        patlican=meyv.nextDouble();
        System.out.print("Toplam Tutar="+((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0)));
    }
}