/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Date;
import java.util.Scanner;

class NVien implements Comparable<NVien>{
    private String id, name, sex, date, add, id_tax, date_con;
    private Date d;
    public NVien(String id, String name, String sex, String date, String add, String id_tax, String date_con) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
        this.id_tax = id_tax;
        this.date_con = date_con;
        this.d = sdf.parse(date);
    }

    
    public Date getD(){
        return this.d;
    }
    @Override
    public int compareTo(NVien o){
        if(this.d.compareTo(o.getD()) == -1) 
            return -1;
        return 1;
    }   
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.sex + " "  + this.date + " " + this.add + " " 
                + this.id_tax + " " + this.date_con; 
    }
}
public class J05007_SapXepDoiTuongNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <NVien> a = new ArrayList();
        for (int i=0; i<t; i++){
            a.add( new NVien(String.format("%05d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine(), sc.nextLine()));           
        }
        Collections.sort(a);
        for(NVien x: a){
            System.out.println(x);
        }
    }
}
