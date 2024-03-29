/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Point{
    private String id, name, status;
    private float p;

    public Point(String id, String name, float p) {
        this.id = id;
        this.name = name;
        this.p = p;
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

    public String getStatus() {
        return status;
    }


    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }
    
    public String setStatus(){
        if(p >=9)
            return "XUAT SAC";
        else if(p >=8)
            return "GIOI";
        else if(p >=7)
            return "KHA";     
        else if(p >=5)
            return "TB"; 
        return "YEU";
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + String.format("%.1f", this.p) + " " + this.setStatus();
    }
}
public class J05018_BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Point> ar = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String id = String.format("HS%02d", i+1);
            String name = sc.nextLine();
            
            float p =0;
            ArrayList<Float> a = new ArrayList<>();
            for(int j=0; j<10; j++)
                a.add(sc.nextFloat());
            sc.nextLine();
            for(int j=0; j<10; j++){
                if(j==0 || j == 1)
                    p += (a.get(j)*2);
                else
                    p+= a.get(j);
            }
            float point = Math.round(p/12 * 10);
            point /=10;
            ar.add(new Point(id, name, point));
        }
        Collections.sort(ar, new Comparator<Point>(){
            @Override
            public int compare(Point o1, Point o2) {
                if(o1.getP() > o2.getP())
                    return -1;
                else if(o1.getP() == o2.getP())
                    return o1.getId().compareTo(o2.getId());
                return 1;
            }            
       });
       for(Point x:ar){
           System.out.println(x);
       }
    }
}
/*
3
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
*/