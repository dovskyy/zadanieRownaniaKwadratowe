package zadanieRownanieKwadratowe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skanik = new Scanner(System.in);
        
        System.out.println("Dana jest funkcja kwadratowa. Wprowadź poniżej jej wspólczynniki: a, b oraz c.");
        System.out.println("Podaj wartość dla 'a': ");
        double a = skanik.nextDouble();
        System.out.println("Podaj wartość dla 'b': ");
        double b = skanik.nextDouble();
        System.out.println("Podaj wartość dla 'c': ");
        double c = skanik.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        try {
            qe.obliczenie();                                                                //Przykłady:
        } catch (DeltaEqualsZeroException de0) {                                            //a = 1; b = -4; c = 4  miejsce zerowe to 1
            double x1 = qe.getX1();                                                         //a = 1; b = 3; c = 8   nie ma rozwiązań
            System.out.println("To równanie ma jedno rozwiązanie, a jest nim: " + x1);      //a = 8; b = -6; c = 1  ma dwa rozwiązania 0.5 oraz 0.25
        } catch (DeltaLessThanZeroException dlt0)   {
            System.out.println(dlt0.getMessage());
        } finally {
            double x1 = qe.getX1();
            double x2 = qe.getX2();
            double delta = qe.getDelta();
            if (delta > 0)
                System.out.println("To równanie ma dwa rozwiązania, a są nimi:\nx1 = " + x1 + "\nx2 = " + x2);
        }

    }

}
