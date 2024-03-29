/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;

class Bill implements Comparable<Bill>{
    private String id,  type;
    private long before, after, cnt, fee , total, more;

    public Bill( String id, String type, long before, long after) {
        this.id = id;
        this.type = type;
        this.before = before;
        this.after = after;
        this.setCnt();
        this.setFee();
        this.setMore();
        this.setTotal(total);
    }

    public void setCnt() {
        if(type.startsWith("KD"))
            this.cnt = 3;
        if(type.startsWith("NN"))
            this.cnt = 5;
        if(type.startsWith("TT"))
            this.cnt = 4;  
        if(type.startsWith("CN"))
            this.cnt = 2;
    }

    public void setFee() {
        this.fee = (this.after - this.before) * this.cnt * 550;
    }


    public void setMore() {
        long k = this.after - this.before;
        if(k < 50)
            this.more = 0;
        else if(k <= 100)
            this.more = (long) Math.round(this.fee * 35.0 / 100.0);
        else 
            this.more = this.fee;
    }

    public void setTotal(long total) {
        this.total = this.more + this.fee;
    }    

    public long getTotal() {
        return total;
    }
    
    @Override
    public int compareTo(Bill o){
        return -Long.compare(this.total, o.getTotal());
    }
    @Override
    public String toString(){
        return this.id + " " +
               + this.cnt + " "
               + this.fee + " "
               + this.more + " "
               + this.total;
    }
}
public class J05051_SapXepBangTinhTienDien {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList <Bill> ar = new ArrayList<>();
        
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String id = String.format("KH%02d", i+1);
            String type = sc.nextLine();
            long before = sc.nextLong(),
                 after = sc.nextLong();
            sc.nextLine();
            ar.add(new Bill(id, type, before, after));
        }
        Collections.sort(ar);
        for(Bill x: ar){
            System.out.println(x);
        }        
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
*/