/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Student implements Comparable<Student>{
    private String id, name, cl;
    private float p1, p2, p3;

    public Student(String id, String name, String cl, float p1, float p2, float p3) {
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
    
    @Override
    public int compareTo(Student o){
        return this.id.compareTo(o.getId());
    }
    @Override
    public String toString(){
        return id + " " + name + " " + cl + " " + String.format("%.1f %.1f %.1f",p1, p2, p3);
    }
}
public class J05030_BangDiemThanhPhan { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine(),
                   cl = sc.nextLine();
            float p1 = sc.nextFloat(),
                  p2 = sc.nextFloat(),
                  p3 = sc.nextFloat();
            sc.nextLine();
            ar.add(new Student(id, name, cl, p1, p2, p3));
            
        }
        Collections.sort(ar);
        int ind =1;
        for(Student x:ar){
            System.out.println(ind++ + " " + x);
        }
    }
}
/*
3
B20DCCN999
Nguyen Van An
D20CQCN04-B
10.0
9.0
8.0
B20DCAT001
Le Van Nam
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