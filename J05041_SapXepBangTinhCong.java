/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Salary{
    private String id, name, pos;
    private long sPerDay, cnt;

    public Salary(String id, String name, String pos, long sPerDay, long cnt) {
        this.id = id;
        this.name = name;
        this.pos = pos;
        this.sPerDay = sPerDay;
        this.cnt = cnt;
    }
    
    public long sPerMonth(){
        return this.cnt * this.sPerDay;
    }
    public long bonus(){
        long s = this.sPerMonth();
        if(cnt >= 25)
            return s*20/100;
        if(cnt >=22)
            return s*10/100;
        return 0;
    }
    
    public long bonusByPos(){
        if(this.pos.compareTo("GD")==0)
            return 250000;
        if(this.pos.compareTo("PGD")==0)
            return 200000;        
        if(this.pos.compareTo("TP")==0)
            return 180000;  
        return 150000;
    }
    public Long total(){
        return (this.sPerMonth() + this.bonus() + this.bonusByPos());        
    }
    @Override
    public String toString(){
        return id + " " + name + 
               " " + sPerMonth() + 
               " " +  bonus() + 
               " " + bonusByPos()+ 
               " " + total();
    }
}
public class J05041_SapXepBangTinhCong {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Salary> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = String.format("NV%02d", i+1),
                   name = sc.nextLine();
            long s = Long.parseLong(sc.nextLine()),
                 cnt = Long.parseLong(sc.nextLine());
            String pos = sc.nextLine();
            ar.add(new Salary(id, name, pos,s, cnt));                  
        }
        
        Collections.sort(ar, new Comparator<Salary>(){
            @Override
            public int compare(Salary o1, Salary o2) {
                return -Long.compare(o1.total(), o2.total());
            }
        
        });
        for(Salary x : ar){
            System.out.println(x);
        }
    }      
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
*/