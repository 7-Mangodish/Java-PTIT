/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

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
public class J05038_BangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        long sum =0;
        for(Salary x : ar){
            System.out.println(x);
            sum+= x.total();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}

/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV

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