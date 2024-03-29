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
import java.io.IOException;

class LoaiPhong implements Comparable<LoaiPhong>{
    public String id, name;
    public String cost, tip;
    
    public LoaiPhong(String s){
        String w[] = s.split(" +");
        this.id =w[0];
        this.name = w[1];
        this.cost = w[2];
        this.tip = w[3];
    }
    @Override
    public int compareTo(LoaiPhong o){
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return this.id +" " + this.name + " " + this.cost +" "+this.tip;
    }
}

public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
            ArrayList<LoaiPhong> ds = new ArrayList<>();
            Scanner in = new Scanner(new File("PHONG.in"));
            int n = Integer.parseInt(in.nextLine());
            while(n-->0){
                ds.add(new LoaiPhong(in.nextLine()));
            }
            Collections.sort(ds);
            for(LoaiPhong tmp : ds){
                System.out.println(tmp);
            }
        }
}
