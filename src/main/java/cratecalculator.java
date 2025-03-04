import java.util.Scanner;

public class cratecalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // armutkg = 2,14 TL
        // elmakg = 3,67 TL
        // domateskg = 1,11 TL
        // muzkg = 0,95 TL
        // patlıcankg = 5,00 TL

        System.out.println("Armut kaç Kilo ? ");
            double armutkg = scanner.nextDouble();
            double atl =  (armutkg * 2.14);                    //atl = Armut TL (sonuç)


        System.out.println("Elma kaç Kilo ? ");
        double elmakg = scanner.nextDouble();                  //etl = Elma TL (sonuç)
        double etl =  (elmakg * 3.67);


        System.out.println("Domates kaç Kilo ? ");
        double Domateskg = scanner.nextDouble();               //dtl = Domates TL (sonuç)
        double dtl =  (Domateskg * 1.11);


        System.out.println("Muz kaç Kilo ? ");
        double Muzkg = scanner.nextDouble();                   //mtl = Muz TL (sonuç)
        double mtl =  (Muzkg * 0.95);


        System.out.println("Patlıcan kaç Kilo ? ");
            double patlicantkg = scanner.nextDouble();         //ptl = Patlican TL (sonuç)


        double ptl =  (patlicantkg * 5.00);

        double result = atl + etl + dtl + mtl + ptl ;         //result = Toplam Tutar
        System.out.println("Toplam Tutar : " + result + "TL.");
    }
}
