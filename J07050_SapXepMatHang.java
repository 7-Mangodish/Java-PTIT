/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class mat_hang implements Comparable<mat_hang>{
    private String id, name, group;
    private float in, out;
    
    public mat_hang(int id, String name, String group, float in, float out){
        this.id = String.format("MH%02d", id);
        this.name = name;
        this.group = group;
        this.in = in;
        this.out = out;
    }
    
    public float profit(){
        return this.out - this.in;
    }
    
    @Override
    public int compareTo(mat_hang o){
        if(this.profit() > o.profit())
            return -1;
        return 1;
    }
    
    @Override
    public String toString(){
        return this.id + " "+ this.name +" " + this.group +" "+String.format("%.2f", this.profit());
    }
}
public class J07050_SapXepMatHang {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:\\CODE\\Java\\Project1\\src\\File\\DATA.txt"));
        
        int n = sc.nextInt();
        sc.nextLine();
        mat_hang a[] = new mat_hang[n];
        for(int i=0; i<n; i++){
            String name = sc.nextLine(),
                   group = sc.nextLine();
            float in = Float.parseFloat(sc.nextLine()),
                  out = Float.parseFloat(sc.nextLine());
            a[i] = new mat_hang(i+1, name, group, in, out);
                    
        }
        
        Arrays.sort(a);
        for(mat_hang x: a)
            System.out.println(x);
    }
}
