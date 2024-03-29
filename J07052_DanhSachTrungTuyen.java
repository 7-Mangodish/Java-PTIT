/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

class ts_J07052 implements Comparable<ts_J07052> {
    private String id, name;
    private float toan, li, hoa, sum;
    private String status;

    public ts_J07052(String id, String name, float toan, float li, float hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
        this.sum = this.toan*2 + this.li + this.hoa + this.bonus();
        this.status = "TRUOT";
    }
    
    public float getSum(){
        return this.sum;
    }
    
    public void setStatus(String s){
        this.status = s;
    }
    private float bonus(){
        char c = this.id.charAt(2);
        if(c == '1')
            return (float)0.5;
        if(c == '2')
            return (float)1.0;
        return (float)2.5;                         
    }
    
    @Override 
    public int compareTo(ts_J07052 o){
        if(this.sum > o.sum)
            return -1;
        if(this.sum == o.sum)
            return this.id.compareTo(o.id);
        return 1;
    }
    @Override
    public String toString() {
        String diemThi="",
        diemCong="";    
        float them = this.bonus();
        
        if(this.sum == (int)this.sum)
            diemThi=String.valueOf((int)this.sum);
        else
            diemThi=String.valueOf(this.sum);
        
        if(them == (int)them)
            diemCong=String.valueOf((int)them);
        else
            diemCong=String.valueOf(them);
        return this.id + " " + this.name + " " + diemCong + " " + diemThi + " " + this.status; 
    }
    
    
}
public class J07052_DanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("E:\\CODE\\Java\\Project1\\src\\File\\DATA.txt"));
        
        int t= Integer.parseInt(sc.nextLine());
        ts_J07052 a[] = new ts_J07052[t];
        for(int i=0; i<t; i++){
            String id = sc.nextLine();
            
            String tmp = sc.nextLine().trim();
            String w[] = tmp.split(" +"),
                   name ="";
            for(String x:w)
                name+= x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() +" ";
            name = name.substring(0, name.length()-1);
            
            float toan = Float.parseFloat(sc.nextLine()),
            li = Float.parseFloat(sc.nextLine()),
            hoa = Float.parseFloat(sc.nextLine());
            a[i] = new ts_J07052(id, name, toan, li, hoa);                                    
        }
        int cnt = Integer.parseInt(sc.nextLine());
        
        Arrays.sort(a);
        int pos =0;
        float diemChuan =0;
        for(int i=0; i<t; i++){
            if(i < cnt){
                a[i].setStatus("TRUNG TUYEN");   
                pos = i;
                diemChuan = a[i].getSum();
            }
            else
                break;
        }
        pos ++;
        while(pos<t && a[pos].getSum() ==diemChuan ){
            a[pos++].setStatus("TRUNG TUYEN");
        }
        System.out.printf("%.1f\n", diemChuan);
        for(ts_J07052 x:a)
            System.out.println(x);
    }
}
