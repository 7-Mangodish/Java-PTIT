/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Trans{
    private String id, name, status;
    private float p1, p2, p3, total, bonus;

    public Trans(String id,String name, float p1, float p2, float p3) {
        this.id = id;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.setBonus();
        this.total = p1*2 + p2 + p3 + this.bonus;
        this.setStatus();
    }
    
    
    public void setBonus(){
        if(this.id.startsWith("KV1"))
            this.bonus = 0.5f;
        else if (this.id.startsWith("KV2"))
            this.bonus = 1.0f;
        else
            this.bonus = 2.5f;       
    }
    
    public void  setStatus(){
        if(this.total >= 24)
            this.status = "TRUNG TUYEN";
        else
            this.status = "TRUOT";
    }

    public float getTotal() {
        return total;
    }
    
    public String Convert(float n){
        if((int)n != n)
            return String.valueOf(n);
        return String.valueOf((int)n);
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.Convert(this.bonus) + " "
               + this.Convert(this.total) + " " + this.status;
    }
}
public class J05058_SapXepKetQuaTuyenSinh {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<Trans> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine();
            float p1 = sc.nextFloat(),
                  p2 = sc.nextFloat(),
                  p3 = sc.nextFloat();
            sc.nextLine();
            ar.add(new Trans(id, name, p1, p2, p3));
        }
        
        Collections.sort(ar, new Comparator<Trans> (){
            @Override
            public int compare(Trans o1, Trans o2) {
                return -Float.compare(o1.getTotal(), o2.getTotal());
            }
        
        });
        for(Trans x : ar){
            System.out.println(x);
        }
    }
}
/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
*/