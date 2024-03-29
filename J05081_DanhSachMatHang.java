/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class mh implements Comparable<mh>{
    public String id, name, unit;
    public int in, out;
    
    public mh(int id, String name, String unit, int in, int out){
        this.id = "MH"+String.format("%03d", id);
        this.name = name;
        this.unit = unit;
        this.in = in;
        this.out = out;
    }
    
    public int interest(){
        return out-in;
    }
    
    @Override
    public int compareTo(mh o){
        if(this.interest() > o.interest() )
            return -1;
        if (this.interest() == o.interest()){
            return this.id.compareTo(o.id);
        }
        return 1;
    }
    
    @Override
    public String toString(){
        return id + " "+ name + " " + unit + " " + in + " " + out + " " + (out -in); 
    }
}
public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List <mh> l = new ArrayList<mh>();
        int t = sc.nextInt();
        
        sc.nextLine();
        int cnt=1;
        while(t-->0){
            mh x= new mh(cnt, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt() );
            l.add(x);
            sc.nextLine();
            cnt++;
        }
        
        Collections.sort(l);
        for(mh x: l)
            System.out.println(x);
        
    }
}
/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
25000
41000


Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
*/
