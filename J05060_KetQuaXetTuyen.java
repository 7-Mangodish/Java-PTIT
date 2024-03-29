/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.text.SimpleDateFormat;

class PH{
    String id, name;
    float p1, p2;
    int age;

    public PH(String id, String name, float p1, float p2, int age) {
        this.id = id;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.age = age;
    }
    
    public float bonus(){
        if(p1 >= 8 && p2 >= 8)
            return 1;
        else if(p1 >=7.5 && p2 >=7.5)
            return 0.5f;
        return 0;
    }
    
    public float total(){
        float ave = (p1+p2)/2f;
        ave += this.bonus();
        if(ave >=10)
            ave =10;
        return Math.round(ave);
    }
    
    public String status(){
        float a = total();
        if(a<5)
            return "Truot";
        else if(a <=6)
            return "Trung binh";
        else if( a == 7)
            return "Kha";
        else if(a==8)
            return "Gioi";
        return "Xuat sac";
           
                    
    }
    @Override
    public String toString(){
        return id + " " + name + " " + age + " " + (int)total() +" "+ status();
    }
}
public class J05060_KetQuaXetTuyen {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        PH a[] = new PH[t];
        for(int i=0; i<t; i++){
            String name = sc.nextLine();
            String b = sc.nextLine();
            int date = 2021-Integer.parseInt(b.substring(6));
            float p1 = Float.parseFloat(sc.nextLine()),
                p2 = Float.parseFloat(sc.nextLine());
            a[i] = new PH(String.format("PH%02d", i+1), name,p1, p2, date );            
        }
        for(PH x : a)
            System.out.println(x);
    }    
}
