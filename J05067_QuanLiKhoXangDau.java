/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

class Fuel{
    private String id, name;
    private long cnt, price, VAT, total;

    public Fuel(String id, long cnt) {
        this.id = id;
        this.cnt = cnt;
        this.setName();
        this.setPrice();
        this.setVAT();
        this.total = this.price * this.cnt + this.VAT;
    }
    
    public void setName(){
        if(this.id.endsWith("BP"))
            this.name = "British Petro";
        if(this.id.endsWith("ES"))
            this.name = "Esso";   
        if(this.id.endsWith("SH"))
            this.name = "Shell";   
        if(this.id.endsWith("CA"))
            this.name = "Castrol";    
        if(this.id.endsWith("MO"))
            this.name = "Mobil";
        if(this.id.endsWith("TN"))
            this.name = "Trong Nuoc";      
    }
    
    public void setPrice(){
        if(id.startsWith("X"))
            this.price = 128000;
        if(id.startsWith("D"))
            this.price = 11200;        
        if(id.startsWith("N"))
            this.price = 9700;          
    }
    public void setVAT(){
        if(id.endsWith("TN")){
            this.VAT = 0;
            return ;
        }

        
        if(id.startsWith("X"))
            this.VAT = this.price * this.cnt * 3 / 100;
        else if(id.startsWith("D"))
            this.VAT = this.price * this.cnt * 35 / 1000;     
        else
            this.VAT = this.price * this.cnt * 2 / 100;               
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.price + " " + this.VAT + " " + this.total;
    }
}
public class J05067_QuanLiKhoXangDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Fuel> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String w[] = sc.nextLine().split(" +");
            String id = w[0];
            long cnt = Long.parseLong(w[1]);
            ar.add(new Fuel(id, cnt));
        }
        
        for(Fuel x : ar){
            System.out.println(x);
        }
    }
}
/*
3
N89BP 4500
D00BP 3500
X92SH 2600
*/