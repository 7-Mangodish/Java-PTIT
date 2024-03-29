/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class sp implements Comparable<sp>{
    public String id, name;
    public int price, time;
    
    public sp(String id, String name, int price, int time){
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = time;
    }
    
    @Override
    public int compareTo(sp o){
        if(this.price > o.price)
            return -1;
        if(this.price == o.price){
            return this.id.compareTo(o.id);
        }
        return 1;
    }
    @Override
    public String toString(){
        return id + " " + name +" "+price+" "+time;
    }
}
public class J07048_DanhSachSanPham2 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc =  new Scanner(new File("SANPHAM.in"));
        
        int n= Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        sp a[] = new sp[n];        
        for(int i=0; i<n; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int time = Integer.parseInt(sc.nextLine());
            a[i]= new sp(id, name, price, time);
            
        }
        
        Arrays.sort(a);
        for(sp x:a)
            System.out.println(x);
    }
    
}
