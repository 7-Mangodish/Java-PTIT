/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class J07057 implements Comparable<J07057>{
    private String id, name, nation, status;
    private int area;
    private float point;

    public J07057(String id, String name, String nation,float point, int area) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.area = area;
        this.point = point + this.bonusByArea() + this.bonusByNation();
    }
     
    private float bonusByNation(){
        if(this.nation.compareTo("Kinh")==0)
            return 0f;
        return 1.5f;
    }
     
    private float bonusByArea(){
        if(this.area == 1)
            return 1.5f;
        if(this.area == 2)
            return 1f;
        return 0f;
    }
    
    private void setStatus(){
        if(this.point >= 20.5f)
            this.status ="Do";
        else this.status = "Truot";
    }
    
    @Override
    public int compareTo(J07057 o){
        if(this.point > o.point)
            return -1;
        else if (this.point == o.point)
            return this.id.compareTo(o.id);
        return 1;
    }
    
    @Override 
    public String toString(){
        this.setStatus();
        return this.id + " " + this.name + " " + String.format("%.1f", this.point)+ " " + this.status;
    }    
}
public class J07057_DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        
        int t= Integer.parseInt(sc.nextLine());
        J07057 a[] = new J07057[t];
        for(int i=0; i<t; i++){
            String tmp = sc.nextLine().trim();
            String w[] = tmp.split(" +");
            String name = "";
            for(String x: w){
                name += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";              
            }
            name = name.substring(0, name.length()-1);
            
            float point = Float.parseFloat(sc.nextLine());
            String nation = sc.nextLine();
            
            int area = Integer.parseInt(sc.nextLine());
            
            a[i] = new J07057(String.format("TS%02d", i+1), name, nation, point, area);
        }
        Arrays.sort(a);
        for(J07057 x:a){
            System.out.println(x);
        }
    }
}
