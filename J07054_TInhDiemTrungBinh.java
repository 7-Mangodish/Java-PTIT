/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */

class DTB implements Comparable<DTB>{
    private String id, name;
    private float point;

    public DTB(String id, String name, float point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }
    
    public float getPoint(){
        return this.point;
    }
    
    @Override 
    public int compareTo(DTB o){
        if(this.getPoint() > o.getPoint())
            return -1;
        return 1;
    }
    
    @Override 
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.2f",this.point);
    }
    
}
public class J07054_TInhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:\\CODE\\Java\\Project1\\src\\File\\DATA.txt"));
        
        int t = Integer.parseInt(sc.nextLine());
        DTB a[] = new DTB[t];
        for(int i=0; i<t; i++){
            // Id
            String id = String.format("SV%02d", i+1);
            // Name
            String name="";
            String tmp = sc.nextLine().trim();
            String w[] = tmp.split(" +");
            for(String x:w){
                name += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase()+" ";
            }
            name = name.substring(0, name.length()-1);
            // Point
            float p1 = Float.parseFloat(sc.nextLine()),
                   p2 = Float.parseFloat(sc.nextLine()), 
                   p3 = Float.parseFloat(sc.nextLine());
            float point =(p1*3 + p2*3 + p3*2)/8;
            point = (float)Math.round(point*100)/100; 
            a[i] = new DTB(id, name, point);
        }
        Arrays.sort(a);
        int rank [] = new int [t];
        for(int i=0 ;i<t; i++)
            rank[i] = i+1;
        for(int i=2; i<t; i++){
            if(a[i].getPoint() == a[i-1].getPoint())
                rank[i] = rank[i-1];
        }
        for(int i=0; i<t; i++)
            System.out.println(a[i] + " "+ rank[i]);
    }
}
