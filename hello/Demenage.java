package hello;

public class Demenage {

    public static void main(String[] args) {
        int nbCar = 250;
        int capaCam1 = 5;
        int capaCam2 = 7;
        int capaCam3 = 9;
        int nbMove = 0;
        int a = 0;
        int c = 0;

        while (nbCar > 0) {
            a = nbCar;
            {
                nbCar = movCar(nbCar, capaCam1);
            }
            if (nbCar > 0) {
                nbCar = movCar(nbCar, capaCam2);
            }
            if (nbCar > 0) {
                nbCar = movCar(nbCar, capaCam3);
            }
            c = nbCar;

            System.out.println("voyage " + nbMove + " de " + (a - c) + " cartons");
            nbMove++;
        }
        System.out.println("nombre de voyage " + nbMove);
    }

  public static int movCar(int nbCar, int capaCam) {
        if (nbCar >= capaCam) {
            return nbCar - capaCam;
        } else {
            return nbCar - nbCar;
        }
    }
}

