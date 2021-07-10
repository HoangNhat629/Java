/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP3;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Fraction fractionA = new Fraction(1, 3);
        Fraction fractionB = new Fraction(1, 1);
        Fraction fractionC = new Fraction(fractionA, fractionB, " + ");
        System.out.println(fractionA.print());
        System.out.println(fractionB.print());
        
        System.out.println(fractionB.print() + " + " + fractionA.print() + " = " + fractionC.print());

    }
}
