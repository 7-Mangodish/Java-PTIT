/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class SinhVien implements Comparable<SinhVien>{
    private String id, name, status;
    private float point;
    
    public SinhVien(String id, String name, float point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    private void setStatus(){
        if(this.point > 8f)
            this.status = "GIOI";
        else if(this.point >= 6.5f && this.point <8f)
            this.status = "KHA";
        else if(this.point >=5f && this.point <6.5f)
            this.status = "TRUNG BINH";
        else
            this.status = "KEM";
    }
    
    @Override
    public int compareTo(SinhVien o){
        if(this.point > o.point)
            return -1;
        return 1;       
    }
    
    @Override
    public String toString(){
        this.setStatus();
        return this.id + " " + this.name + " " + String.format("%.2f", this.point) + " " + this.status;
    }
}

public class J07055_XepLoai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEW.in"));
        
        int t= Integer.parseInt(sc.nextLine());
        SinhVien a[] = new SinhVien[t];
        for(int i=0; i<t; i++){
            String tmp = sc.nextLine().trim();
            String w[] = tmp.split(" +");
            String name = "";
            for(String x: w){
                name += x.substring(0, 1).toUpperCase() + x.substring(1 ).toLowerCase() + " ";           
            }
            name = name.substring(0, name.length()-1);
            
            float p1 = Float.parseFloat(sc.nextLine()),
            p2 = Float.parseFloat(sc.nextLine()),
            p3 = Float.parseFloat(sc.nextLine());
            float point = p1*0.25f + p2*0.35f + p3 * 0.4f;
            
            a[i] = new SinhVien(String.format("SV%02d", i+1), name, point);
        }
        Arrays.sort(a);
        for(SinhVien x:a)
            System.out.println(x);
    }
}
