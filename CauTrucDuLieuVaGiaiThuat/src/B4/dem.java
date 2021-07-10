/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B4;

/**
 *
 * @author admin
 */
public class dem {
    static void DemKyTu(String str)
    {
        int counter[] = new int[100000];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
    public static void main(String[] args)
    {
        String str = "Đọc vào 1 văn bản tiếng anh, thống kê các từ xuất hiện trong văn bản và in ra các từ theo thứ tự ABC ";
        System.out.println("Chuỗi là: "+ str);
        DemKyTu(str);
    }
}
