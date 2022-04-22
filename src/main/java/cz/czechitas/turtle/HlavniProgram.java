package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        Turtle leonardo = new Turtle();
        // parametry
        Color oranzova = new Color(200,80,0);
        Color modra = new Color(0,150,250);
        leonardo.setLocation(200, 250);
        zofka.setLocation(400.0, 150.0);
        zofka.setPenWidth(2);
        zofka.setPenColor(modra);
        leonardo.setPenWidth(3);
        leonardo.setPenColor(oranzova);


        // metody
        nakresliZmrzlinu(zofka, 3.5);
        nakresliKornoutek(zofka,  250 );
        nakresliSnehulacka(leonardo, 3.5);
        nakresliMasinku(zofka, leonardo);

    }

    private void nakresliZmrzlinu(Turtle zofka, double polomer)
    {
        for (int i = 0; i < 185; i++)
        {
            polomer = 2;
            zofka.move(polomer);
            zofka.turnLeft(3);
        }


    }
    private void nakresliKornoutek (Turtle zofka, double strany)
    {
        strany = 140;
        zofka.move(strany);
        zofka.turnLeft(150);
        zofka.move(strany);
        zofka.turnLeft(105);
        zofka.move(70);
        zofka.setLocation(720, 250);


    }

    private void nakresliSnehulacka(Turtle leonardo, double polomer) {


        for (int i = 0; i < 150; i++) {
            polomer = 3.5;
            leonardo.move(polomer);


            leonardo.turnLeft(3);
        }
        for (int i = 0; i < 150; i++) {
            polomer = 2;
            leonardo.move(polomer);


            leonardo.turnRight(3);
        }
        for (int i = 0; i < 180; i++) {
            polomer = 0.5;
            leonardo.move(polomer);


            leonardo.turnLeft(2);
        }
        for (int i = 0; i < 60; i++) {
            polomer = 2;
            leonardo.move(polomer);


            leonardo.turnRight(3);
        }
        for (int i = 0; i < 180; i++) {
            polomer = 0.5;
            leonardo.move(polomer);


            leonardo.turnLeft(2);
        }
        for (int i = 0; i < 90; i++) {
            polomer = 2;
            leonardo.move(polomer);


            leonardo.turnRight(3);
        }
        for (int i = 0; i < 120; i++) {
            polomer = 1;
            leonardo.move(polomer);


            leonardo.turnLeft(3);
        }
        leonardo.setLocation(720, 250);
    }






    private void nakresliMasinku(Turtle zofka, Turtle leonardo)
    {

        zofka.setPenWidth(6);
        Color masinkovabarvicka = new Color (100,10,200);
        zofka.setPenColor(masinkovabarvicka);
        leonardo.setPenWidth(6);
        leonardo.setPenColor(masinkovabarvicka);

        zofka.turnRight(180); zofka.move(100) ;
        zofka.turnLeft(90);
        leonardo.move(100); leonardo.turnLeft(90);




        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        // tělo
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(180);
        zofka.turnLeft(90);// začátek trojúhelníku
        zofka.move(110);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(135);
        zofka.move(115);


        for (int i = 0; i < 136; i++)
        {

            leonardo.move(3.5);
            leonardo.turnLeft(4);
        }
        leonardo.turnRight(95);
        leonardo.move(60);
        for (int i = 0; i < 60; i++)
        {

            leonardo.move(2);

            leonardo.turnLeft(6);
        }
        leonardo.move(60);
        for (int i = 0; i < 60; i++)
        {

            leonardo.move(2);

            leonardo.turnLeft(6);
        }
        leonardo.move(60);







    }


}


