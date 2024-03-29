/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CodePtit;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>{
    private String id;
    private long cnt_in, cnt_out, priceOne, priceAll, vat ;

    public Product(String id, long cnt_in) {
        this.id = id;
        this.cnt_in = cnt_in;
        this.setCnt_out();
        this.setPriceOne();
        this.setPriceAll();
        this.setVat();
    }
    
    public void setCnt_out(){
        if(id.startsWith("A")){
            this.cnt_out = (long)Math.round(cnt_in * 60.0 /100.0);
        }
        else
            this.cnt_out = (long)Math.round(cnt_in * 70.0 /100.0);            
    }
    
    public void setPriceOne(){
        if(this.id.endsWith("Y"))
            this.priceOne = 110000;
        else 
            this.priceOne = 135000;
    }
    
    public void setPriceAll(){
        this.priceAll = this.priceOne * this.cnt_out;
    }
    
    public void setVat(){
        if(this.id.startsWith("A")){
            if(this.id.endsWith("Y")){
                this.vat = this.priceAll * 8/100;
            }
            else
                this.vat = this.priceAll * 11/100;
        }
        else{
            if(this.id.endsWith("Y")){
                this.vat = this.priceAll * 17/100;
            }
            else
                this.vat = this.priceAll * 22/100;            
        }
    }

    public long getVat() {
        return vat;
    }

    public String getId() {
        return id;
    }
    
    
    @Override
    public int compareTo(Product o){
        return -Long.compare(this.vat, o.getVat());
    }
    @Override
    public String toString(){
        return this.id +  " " + this.cnt_in + " " + this.cnt_out 
                + " " + this.priceOne + " " + this.priceAll + " " + this.vat;
    }
}
public class J05049_LietKeNhapXuatHangTheoNhom {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = sc.nextLine();
            long cnt = sc.nextLong();
            sc.nextLine();
            ar.add(new Product(id, cnt));
        }
        Collections.sort(ar);
        String gr = sc.nextLine();
        for(Product x: ar){
            if(x.getId().startsWith(gr) )
                System.out.println(x);
        }
        
    }
}
/*
3
A001Y
1000
B012N
2500
B003Y
4582
B
*/