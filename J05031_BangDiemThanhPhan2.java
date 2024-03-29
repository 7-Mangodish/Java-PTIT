/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;

class J05031 implements Comparable<J05031>{
    private String id, name, cl;
    private float p1, p2, p3;

    public J05031(String id, String name, String cl, float p1, float p2, float p3) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public int compareTo(J05031 o){
        return this.name.compareTo(o.getName());
    }
    @Override
    public String toString(){
        return id + " " + name + " " + cl + " " + String.format("%.1f %.1f %.1f",p1, p2, p3);
    }    
}
public class J05031_BangDiemThanhPhan2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<J05031> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine(),
                   cl = sc.nextLine();
            float p1 = sc.nextFloat(),
                  p2 = sc.nextFloat(),
                  p3 = sc.nextFloat();
            sc.nextLine();
            ar.add(new J05031(id, name, cl, p1, p2, p3));
            
        }
        Collections.sort(ar);
        int ind =1;
        for(J05031 x:ar){
            System.out.println(ind++ + " " + x);
        }
    }
}
/*
3
B20DCCN999
Nguyen Van Nam
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van am
D20CQAT02-B
6.0
6.0
4.0
B20DCCN111
Tran Hoa Binh
D20CQCN04-B
9.0
5.0
6.0
*/