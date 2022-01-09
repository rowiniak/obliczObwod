package programy;

import java.util.Scanner;

class Prostokat {
    private float bokA;
    private float bokB;

    public Prostokat(float bokA, float bokB) {
        this.setBokA(bokA);
        this.setBokB(bokB);
    }

    public float getBokA() {
        return this.bokA;
    }

    public void setBokA(float bokA) {
        if (bokA > 0) {
            this.bokA = bokA;
        } else if (bokA == 0) {
            System.out.println("Prostokąt nie mże mieć boku A o długosci 0");
        } else {
            this.bokA = -bokA;
        }
    }

    public float getBokB() {
        return this.bokB;
    }

    public void setBokB(float bokB) {
        if (bokB > 0) {
            this.bokB = bokB;
        } else if (bokB == 0) {
            System.out.println("Prostokąt nie może mieć boku B o długosci 0");
        } else {
            this.bokB = -bokB;
        }
    }

    public float obliczObwod() {
        if (bokA == 0 || bokB == 0)
            throw new IllegalArgumentException("Nie można zbudować takiego kwadratu.");

        return (this.bokA + this.bokB) * 2;
    }
}

public class ObliczObwod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            Prostokat prostokat1 = new Prostokat(5, 6);
            System.out.println("Prostokąt o bokach " + prostokat1.getBokA() + " i " + prostokat1.getBokB() + " ma obwod o dlugości " + prostokat1.obliczObwod());

            Prostokat prostokat2 = new Prostokat(-5, 0);
            System.out.println("Prostokąt o bokach " + prostokat2.getBokA() + " i " + prostokat2.getBokB() + " ma obwod o dlugości " + prostokat2.obliczObwod());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Wprowadz bok A dla prostokąta 3");
        float wprowadzBokA = input.nextFloat();

        System.out.println("Wprowadz bok B dla prostokąta 3");
        float wprowadzBokB = input.nextFloat();

        Prostokat prostokat3 = new Prostokat(wprowadzBokA,wprowadzBokB);


        System.out.println("Prostokąt 3 o bokach " + prostokat3.getBokA() + " i " + prostokat3.getBokB() + " ma obwod o dlugości " + prostokat3.obliczObwod());

    }
}
