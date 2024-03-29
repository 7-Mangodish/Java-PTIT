/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class GiangDay implements Comparable<GiangDay>{
    private String id, name, num, theory, prac;

    public GiangDay(String id, String name, String num, String theory, String prac) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.theory = theory;
        this.prac = prac;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTheory() {
        return theory;
    }

    public void setTheory(String theory) {
        this.theory = theory;
    }

    public String getPrac() {
        return prac;
    }

    public void setPrac(String prac) {
        this.prac = prac;
    }
    
    @Override
    public int compareTo(GiangDay o) {
        return this.id.compareTo(o.getId());
    }
    @Override
    public String toString(){
        return this.id + " "  + this.name +" " + this.num + " " + this.theory + " " + this.prac;
    }
    
}
public class J07073_DangKiHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <GiangDay> a = new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String num = sc.nextLine();
            String theory = sc.nextLine();
            String prac = sc.nextLine();
            if(prac.endsWith(".ptit.edu.vn") || prac.compareTo("Truc tuyen")==0)
                a.add(new GiangDay(id, name, num, theory, prac));
        }
        Collections.sort(a);
        for(GiangDay x: a){
            System.out.println(x);
        }
    }
}
