/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;

class Bill{
    private String id, name, stt;
    private long price, cnt, discount, total;

    public Bill(String id, String name, long price, long cnt) {
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
    
    @Override
    public String toString(){
        return this.name + " " + this.id +" "
               + this.stt + " " + this.discount +" "
               + this.total;
    }
}
public class J05052_TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bill> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String name = sc.nextLine(),
                   id = sc.nextLine();
            long price = sc.nextLong(),
                 cnt = sc.nextLong();
            sc.nextLine();
            ar.add(new Bill(id, name, price, cnt));
        }
        for(Bill x :ar){
            System.out.println(x);
        }
    }
}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/