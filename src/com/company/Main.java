package com.company;

public class Main {

    public static void main(String[] args) {
        Complex blue = new Complex(3, 4);
        Complex red = new Complex(2, 1);
        Complex green = new Complex(7,24);
        Complex yellow = new Complex(2, 7);
        Complex purple = new Complex(2, 0);
        Complex pink = new Complex(0, 1);
        Complex brown = new Complex(-3, -4);
        Complex black = new Complex(0, 0);

        double a = blue.abs();
        Complex a1 = blue.add(red);
        Complex a2 = blue.multiply(red);
        Complex a3 = blue.multiply(5);
        double b = green.abs();
        Complex b1 = green.add(yellow);
        Complex b2 = green.multiply(yellow);
        double c = purple.abs();
        Complex c1 = purple.add(pink);
        Complex c2 = purple.multiply(pink);
        double d = brown.abs();
        Complex d1 = brown.add(black);
        Complex d2 = brown.multiply(black);
        double e = pink.abs();
        Complex e1 = pink.add(brown);
        Complex e2 = pink.multiply(brown);
        double f = black.abs();
        Complex f1 = black.add(purple);
        Complex f2 = black.multiply(purple);
        Complex f3 = black.multiply(-1);


        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(f);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        SoccerTeam t1 = new SoccerTeam();
        SoccerTeam t2 = new SoccerTeam();
        SoccerTeam t3 = new SoccerTeam();
        SoccerTeam t4 = new SoccerTeam();
    }
}

/*Results
5.0
5.0 + 5.0i
25.0
9.0 + 31.0i
2.0
2.0 + 1.0i
0.0
0.0 + 0.0i
1.0
0.0 + 1.0i
0.0
2.0 + 0.0i
*/
