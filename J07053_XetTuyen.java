/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

//class UngVien implements Comparable<UngBien>{

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class UngVien{
    private String id, name, status;
    private int point;
    int age;
    public UngVien(String id, String name, int age, int point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.point = point;
    }
    
    private void setStatus(){
        if(point<5)
            status ="Truot";
        else if(point >=5 && point<=6)
            status = "Trung binh";
        else if(point == 7)
            status = "Kha";
        else if(point == 8)
            status = "Gioi";
        else
            status = "Xuat sac";
    }
    @Override
    public String toString(){
        setStatus();
        return this.id + " " + this.name + " "+ this.age+" "+this.point+" " +  this.status;
    }
}
public class J07053_XetTuyen {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        
        int t = Integer.parseInt(sc.nextLine());
        UngVien a[] = new UngVien[t];
        for(int i=0; i<t; i++){
            //ID
            String id = String.format("PH%02d", i+1);
            
            //Name
            String tmp = sc.nextLine().trim();
            String w[] = tmp.split(" +");           
            String name = "";
            for(String x: w)
                name += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase()+" ";
            name = name.substring(0,name.length()-1);
            // Date
            Date d1 = sdf.parse(sc.nextLine());
            String d2 = sdf.format(d1);
            int year = 2021 - Integer.parseInt(d2.substring(6));
            //Point
            float liThuyet = Float.parseFloat(sc.nextLine()),
                    thucHanh = Float.parseFloat(sc.nextLine());
            float bonus=0;
            if(liThuyet >= 8 && thucHanh >=8)
                bonus = 1f;
            else if (liThuyet >= 7.5 && thucHanh >=7.5)
                bonus = 0.5f;
            else 
                bonus =0f;                        
            float point = Math.round(( liThuyet + thucHanh)/2 + bonus);
            if(point >10)
                point =10;
            // Add Arrays
            a[i] = new UngVien(id, name, year, (int)point);           
        }
        
        for(UngVien x: a)
            System.out.println(x);
    }
}
