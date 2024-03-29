/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;

class bill implements Comparable<bill>{
    private String id, name, stt;
    private long price, cnt, discount, total;

    public bill(String id, String name, long price, long cnt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cnt = cnt;
        this.setStt();
        this.setDiscount();
        this.setTotal();
    }
    
    public void setStt(){
        this.stt = this.id.substring(1, id.length()-1);
    }
    public void setDiscount(){
        if(this.id.endsWith("1")){
            this.discount = (long) Math.round(cnt * this.price * 50.0 / 100.0);
        }
        else
            this.discount = (long) Math.round(cnt * this.price * 30.0 / 100.0);
    }
    
    public void setTotal(){
        this.total = this.cnt * this.price - this.discount;
    }
    
    public String getStt(){
        return this.stt;
    }
    @Override
    public int compareTo(bill o){
        return this.stt.compareTo(o.getStt());
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.id +" "
               + this.stt + " " + this.discount +" "
               + this.total;
    }
}
public class J05053_SapXepDonHang {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        ArrayList<bill> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String name = sc.nextLine(),
                   id = sc.nextLine();
            long price = sc.nextLong(),
                 cnt = sc.nextLong();
            sc.nextLine();
            ar.add(new bill(id, name, price, cnt));
        }
        
        Collections.sort(ar);
        for(bill x :ar){
            System.out.println(x);
        }
    }    
}
/*

*/