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
public class person {
     public String name;
    public String code;
    public int birthday;
   
//    CONSTRUCTOR
    public person(String Name, String Code, int Birthday) {
        this.name = Name;
        this.code = Code;
        this.birthday = Birthday;
    }

    public void setName(String vName) {
        this.name = vName;
    }

    public void setBirthday(int vBirthday) {
        this.birthday = vBirthday;
    }

    public void setCode(String vCode) {
        this.code = vCode;
    }
   

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getBirthday() {
        return birthday;
    }
    

    public int getAge() {
        int age = 0;
        Calendar now = Calendar.getInstance();
        age = now.get(Calendar.YEAR) - this.getBirthday();
        return age;
    }

    //show infor
    public void showInf() {
        System.out.println("--------------------");
        System.out.println("Person information: ");
        System.out.println("nam sinh " + this.getBirthday());
        System.out.println("ten " + this.getName());
        System.out.println("code " + this.getCode());
        System.out.println("Age " + this.getAge());
    }
}
