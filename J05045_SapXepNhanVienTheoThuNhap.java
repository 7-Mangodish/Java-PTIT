/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Staff implements Comparable<Staff>{
    private String id, name, pos;
    private long sPerDay, cnt;

    public Staff(String id, String name, String pos, long sPerDay, long cnt) {
        this.id = id;
        this.name = name;
        this.pos = pos;
        this.sPerDay = sPerDay;
        this.cnt = cnt;
    }
    
    public long Uc(){
        long total = sPerMonth(),
             bonus = this.bonusByPos();
        double tmp = (total + bonus)*2 /3;
        if(tmp < 25000)
            return (long)Math.round(tmp/1000)*1000;
        return 25000;
    }
    
    public long sPerMonth(){
        return this.cnt * this.sPerDay;
    }
    
    public long bonusByPos(){
        if(this.pos.compareTo("GD")==0)
            return 500;
        if(this.pos.compareTo("PGD")==0)
            return 400;        
        if(this.pos.compareTo("TP")==0)
            return 300;  
        if(this.pos.compareTo("KT")==0)
            return 250; 
        return 100;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
    
    public long getSalary(){
        return this.sPerMonth() + this.bonusByPos();
    }

    public String getId() {
        return id;
    }
    
    @Override
    public int compareTo(Staff o){
        if(this.getSalary() > o.getSalary())
            return -1;
        if(this.getSalary() == o.getSalary())
            return this.id.compareTo(o.getId());
        return 1;
    }
    @Override
    public String toString(){
        long s = this.sPerMonth() + this.bonusByPos() - this.Uc();
        return this.id + " " + this.name +
               " "+ this.bonusByPos() + 
               " " + this.sPerMonth() +
               " " + this.Uc() + 
               " " + s;
    }
}
public class J05045_SapXepNhanVienTheoThuNhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Staff> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String id = String.format("NV%02d", i+1),
                   name = sc.nextLine(),
                   pos = sc.nextLine();
            long s = sc.nextLong(),
                 cnt = sc.nextLong();
            sc.nextLine();
            ar.add(new Staff(id, name, pos, s, cnt));
        }
        Collections.sort(ar);
        for(Staff x: ar){
            System.out.println(x);
        }
    }
}
/*
5
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
Tran Thi Yen
NV
1000
24
*/