/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huongdoituong;

import java.util.Calendar;

/**
 *
 * @author admin
 */
public class Student {

    //Properties
    public String name;
    public String code;
    public int birthday;
    public double score;
//        //CONSTRUCTOR
//    public Student() {
//        this.name = "Yami";
//        this.code = "129184";
//        this.birthday = 1999;
//    }
//    // c2
//    public Student(String Name, String Code, int Birthday) {
//        this.name = Name;
//        this.code = Code;
//        this.birthday = Birthday;
//    }
//SETTER

    public void setName(String vName) {
        this.name = vName;
    }

    public void setBirthday(int vBirthday) {
        this.birthday = vBirthday;
    }

    public void setScore(double vScore) {
        this.score = vScore;
    }

    //Overloading method( phương thức nạp chồng )là những phương thức nằm trong cùng một class có cùng tên nhưng khác tham số
    public void setCode(String vCode) {
        this.code = vCode;
    }

    public void setCode() {
        this.code = "20199999";
    }

    public void setCode(String str, int number) {
        this.code = str + number;
    }

    public void setCode(int number) {
        this.code = "SV" + number;
    }

//GETTER
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getBirthday() {
        return birthday;
    }
    public double getScore() {
        return score;
    }

    public int getAge() {
        int age = 0;
        Calendar now = Calendar.getInstance();
        age = now.get(Calendar.YEAR) - this.getBirthday();
        return age;
    }

    //show infor
    public void showInf() {
        System.out.println("nam sinh " + this.getBirthday());
        System.out.println("ten " + this.getName());
        System.out.println("code " + this.getCode());
        System.out.println("Age " + this.getAge());
    }
}
