package programy;

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
        }else if (bokA == 0){
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
        }else if (bokB == 0){
            System.out.println("Prostokąt nie mże mieć boku B o długosci 0");
        } else {
            this.bokB = -bokB;
        }
    }

    public float obliczObwod() {
        if (bokA == 0 || bokB == 0) {

            System.out.println("Nie mozęna zbudować takiego kwadratu");

        }return (this.bokA + this.bokB) * 2;
    }
}

public class ObliczObwod {

    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(5, 6);
        System.out.println("Prostokąt o bokach " + prostokat1.getBokA() + " i " + prostokat1.getBokB() + " ma obwod o dlugości " + prostokat1.obliczObwod());

        Prostokat prostokat2 = new Prostokat(-5, 0);
        System.out.println("Prostokąt o bokach " + prostokat2.getBokA() + " i " + prostokat2.getBokB() + " ma obwod o dlugości " + prostokat2.obliczObwod());
    }
}
