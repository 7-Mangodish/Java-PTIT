/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Clb{
    private String id, name;
    private long price;

    public Clb(String id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public long getPrice(){
        return this.price;
    }
    
    public String getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }   
}

class Match implements Comparable<Match>{
    private Clb c;
    private String id;
    private long revenue;

    public Match(Clb c, String id, long revenue) {
        this.c = c;
        this.id = id;
        this.revenue = revenue;
    }

    public Clb getC() {
        return c;
    }

    public String getId() {
        return id;
    }

    public long getRevenue() {
        return revenue;
    }
    
    public String getClbName(){
        return this.c.getName();
    }
    @Override
    public int compareTo(Match o){
        if(this.revenue == o.getRevenue())
            return this.getClbName().compareTo(o.getClbName());
        return -Long.compare(this.revenue, o.getRevenue());
    }
    @Override
    public String toString(){
        return this.id + " " + this.getClbName() + " " + this.revenue;
    }
}
public class J05070_CauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Clb> mp = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine();
            long price = sc.nextLong();
            sc.nextLine();
            mp.put(id, new Clb(id, name, price));
        }
        
        ArrayList<Match> ar = new ArrayList<>();
        int q =  Integer.parseInt(sc.nextLine());
        while(q-->0){
            String id = sc.next();
            int cnt = sc.nextInt();
            Clb tmp = mp.get(id.substring(1, 3));
            long sum = cnt * tmp.getPrice();
            ar.add(new Match(tmp, id, sum));
        }        
        Collections.sort(ar);
        for(Match x: ar)
        {    
            System.out.println(x);
        }
    }
}
/*
3
AC
AC Milan
12
MU
Manchester United
MM
MMAMA
12
3
IAC1 80000
EMU2 60000
1MM3 80000
*/