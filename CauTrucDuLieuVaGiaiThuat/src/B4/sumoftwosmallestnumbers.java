/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Java
package B4;

import java.util.Scanner;

public class sumoftwosmallestnumbers { 
    
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
             System.out.print("\t" + arr[i]);
        }
        System.out.println("");
    }
    public static int  Tong2sonhonhat(int[] a){
        sortASC(a);
        return a[1]+a[0];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử: ");
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("Nhập vào phần tử thứ " + i + ": ");
        a[i] = input.nextInt(); 
        }
        System.out.println("Nội dung mảng: ");
        show(a);
        System.out.println("mangr sau khi sap xep");
        sortASC(a);
        show(a);
        System.out.println("tong 2 so nho nhat" + Tong2sonhonhat(a));
        
        
        
    }
   
}
//C++
//#include <conio.h>
//#include <iostream>
//using namespace std;
//
//int sapxep(int arr[],int n ){
// for (int i = 0; i < n; i++) {
//        for (int j = i + 1; j < n; j++) {
//            if (arr[i] > arr[j]) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
//	}
//	
//	
//int find(int* a, int count){
//		int tmp=0;
//	for(int i=0; i<=count; i++){
//	
//		tmp+=*a;
//		a++;
//		
//}
//cout << tmp;
//return tmp;
//}
//int main() {
//    int n=5;
//    int arr[5]={1,0,3,2,5};
//    sapxep(arr, n);
//    int *a = arr;
//    find(arr, 1);
//	
//    getch();
//    return 0;
//}
//
