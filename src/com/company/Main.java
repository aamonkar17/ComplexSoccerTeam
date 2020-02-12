//Ankit Amonkar
//3B AP Computer Science
//Main Class
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
        SoccerTeam.startTournament();

        t1.played(t2, 1, 5);
        t1.played(t2, 3, 3);
        t1.played(t2, 9, 1);

        t2.played(t3, 2, 6);
        t2.played(t3, 4, 4);
        t2.played(t3, 5, 3);

        t3.played(t4, 3, 4);
        t3.played(t4, 2, 2);
        t3.played(t4, 6, 4);

        t1.played(t3, 7, 9);
        t1.played(t3, 1, 1);
        t1.played(t3, 7, 0);

        t1.played(t4, 0, 1);
        t1.played(t4, 0, 0);
        t1.played(t4, 2, 1);

        t2.played(t4, 1, 5);
        t2.played(t4, 3, 3);
        t2.played(t4, 9, 1);


        System.out.println("\n" + t1.numberPts());
        System.out.println(t2.numberPts());
        System.out.println(t3.numberPts());
        System.out.println(t4.numberPts());
        System.out.println(t1.getScoreOfTeam());
        System.out.println(t1.getNumGames());

        t1.reset();
        t2.reset();
        t3.reset();
        t4.reset();
        SoccerTeam.startTournament();

        t1.played(t2, 4, 5);
        t1.played(t2, 4, 4);
        t1.played(t2, 4, 2);

        t2.played(t3, 1, 5);
        t2.played(t3, 3, 3);
        t2.played(t3, 3, 2);

        t3.played(t4, 3, 5);
        t3.played(t4, 1, 1);
        t3.played(t4, 7, 4);

        t1.played(t3, 4, 9);
        t1.played(t3, 1, 1);
        t1.played(t3, 2, 0);

        t1.played(t4, 0, 1);
        t1.played(t4, 0, 0);
        t1.played(t4, 2, 1);

        t2.played(t4, 0, 4);
        t2.played(t4, 9, 9);
        t2.played(t4, 2, 1);

        System.out.println("\n" + t1.numberPts());
        System.out.println(t2.numberPts());
        System.out.println(t3.numberPts());
        System.out.println(t4.numberPts());
        System.out.println(SoccerTeam.getScoreOfTeam());
        System.out.println(SoccerTeam.getNumGames());

        t1.reset();
        t2.reset();
        t3.reset();
        t4.reset();

    }
}

/*Results
Complex:
5.0
5.0 + 5.0i
2.0 + 11.0i
15.0 + 20.0i
25.0
9.0 + 31.0i
-154.0 + 97.0i
2.0
2.0 + 1.0i
0.0 + 2.0i
5.0
-3.0 + -4.0i
0.0 + -0.0i
1.0
-3.0 + -3.0i
4.0 + -3.0i
0.0
2.0 + 0.0i
0.0 + 0.0i
-0.0 + -0.0i

SoccerTeam:
12
12
12
12
48
18

12
12
12
12
48
18
*/
