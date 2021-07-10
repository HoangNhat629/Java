

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class xoanoc {

    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int tongAB = tong(A, B);
        hienthiSONGUYEN(tongAB);
        String output = getClassname();
        System.out.println(output);
        //input N
        //output arrayN[] = {1,2,3,4,5.....,N]
        int N = 7;
        int[] arrayN;
        arrayN = autoGenerator(N);
        int n = 5;
        int m = 7;

    }

    // outputType nameOfFunction ( listOfParameters ){ //process // return...)
    //input --> process--> output   
    static int tong(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //return: dừng hàm
    //input --> process
    static void hienthiSONGUYEN(int input) {
        System.out.println("So nguyen " + input);
        return;
    }

    //process---> output
    static String getClassname() {
        String classname = "basic";
        int thuTu = 2;
        return classname + thuTu;
    }
    //only process

    static void dungChuongTronh() {
        System.exit(1);
        return;
    }

    static int[] autoGenerator(int N) {
        int[] returnArray = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            returnArray[i] = i;
        }
        return returnArray;
    }
}
