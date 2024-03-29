/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;
class Price{
    private String id, name, unit;
    private long ship, total, cost;

    public Price(String id, String name, String unit, long ship, long total, long cost) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.ship = ship;
        this.total = total;
        this.cost = cost;
    }


    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.unit + " " + this.ship + " " + this.total + " " + this.cost;
    }
}
public class J05036_TinhGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Price> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String id = String.format("MH%02d", i+1),
                   name = sc.nextLine(),
                   unit = sc.nextLine();
            long in = Long.parseLong(sc.nextLine()),
                cnt = Long.parseLong(sc.nextLine());
            long ship = (long)Math.round(5 * in * cnt /100),
                total = (long)Math.round(in * cnt + ship),
                cost = (long)Math.round(1.02 * total);
            ar.add(new Price(id, name, unit, ship, total, cost));        
        }
        for(Price x: ar){
            System.out.println(x);
        }
    }
}
/*
4
DUONG
KG
7500
150
TRUNG
CHUC
10000
225
GAO
KG
14000
118
SUA
HOP
48000
430
*/