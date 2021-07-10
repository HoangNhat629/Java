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
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction(Fraction fractionA, Fraction fractionB, String operation) {
        fractionA.normalize();
        fractionB.normalize();
        switch (operation) {
            case " + ":
                this.add(fractionA, fractionB);
                break;
            case " - ":
                this.sub(fractionA, fractionB);
                break;
            case " * ":
                this.mutiply(fractionA, fractionB);
                break;
            case " / ":
                this.devide(fractionA, fractionB);
                break;
        }

    }

    //tạo phần hiển thị cho phân số
    public String print() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    //rút gọn phân sô
    public void normalize() {
        int ucln = this.UCLN(this.getDenominator(), this.getNumerator());
        if (ucln > 1) {

            this.numerator = this.numerator / ucln;
            this.denominator = this.denominator / ucln;
            System.out.println("normalize");
        }
    }

    //tổng 2 phân số
    private void add(Fraction fractionA, Fraction fractionB) {
        this.setNumerator(fractionA.getNumerator() * fractionB.getDenominator() + fractionA.getDenominator() * fractionB.getNumerator());
        this.setDeonominator( fractionA.getDenominator() * fractionB.getDenominator());

    }

    //hiệu 2 phân số
    private void sub(Fraction fractionA, Fraction fractionB) {
    }

    //tích 2 phân số
    private void mutiply(Fraction fractionA, Fraction fractionB) {
    }

    //thương 2 phân sô
   private void devide(Fraction fractionA, Fraction fractionB) {
    }

    //tìm UCLN
    private int UCLN(int x, int y) {
        int result = Math.min(x, y);
        while (result >= 1) {
            if (x % result == 0 && y % result == 0) {
                return result;
            }
            result--;
        }
        return result;
    }

    public boolean checkNormalize() {
        boolean flag = false;
        int ucln = this.UCLN(this.getDenominator(), this.getNumerator());
        if (ucln == 1) {
            flag = true;
        }
        return false;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDeonominator(int denominator) {
        this.denominator = denominator;
    }
}
