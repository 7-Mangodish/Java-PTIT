/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class name implements Comparable<name>{
    private String surname, middleName, name;

    public name(String surname, String middleName, String Name) {
        this.surname = surname;
        this.middleName = middleName;
        this.name = Name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
    
    @Override
    public int compareTo(name o){
        if(this.name.compareTo(o.getName())==0)
            if(this.surname.compareTo(o.getSurname())==0)
                return this.middleName.compareTo(o.getMiddleName());
            else
                return this.surname.compareTo(o.getSurname());
        return this.name.compareTo(o.getName());

    }
    
    @Override
    public String toString(){
        return this.surname + " " + this.middleName + " " + this.name;
    }
}
public class J07072_ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:\\CODE\\Java\\Project1\\src\\File\\DATA.txt"));
        ArrayList<name> a = new ArrayList();
        while(sc.hasNext()){
            String tmp = sc.nextLine().trim();
            String w[] = tmp.split(" +");
            for(int i=0; i<w.length; i++){
                w[i] = w[i].substring(0,1).toUpperCase() +w[i].substring(1).toLowerCase();
            }
            String s1 =w[0], s3 = w[w.length-1], s2="";
            for(int i =1; i<w.length-1; i++)
                s2 += w[i]+" ";
            s2 = s2.substring(0, s2.length()-1);
            a.add(new name(s1, s2, s3));
        }
        Collections.sort(a);
        for(name x:a)
            System.out.println(x);
    }
}
