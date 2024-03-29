/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id, name, status;
    private float point;
    private int rank;

    public Student(String id, String name, float point) {
        this.id = id;
        this.name = name;
        this.point = point;
        this.setStatus();
    }

    public void setStatus() {
        if(this.point >= 9)
            this.status = "Gioi";
        else if(this.point >= 7)
            this.status = "Kha";
        else if(this.point >= 5)
            this.status = "Trung Binh"; 
        else 
            this.status = "Yeu";
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }
    
    public float getPoint() {
        return point;
    }
    
    @Override
    public int compareTo(Student o){
        return -Float.compare(this.point, o.getPoint());
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.point + " " + this.status + " " + this.rank;
    }
}
public class J05054_XepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Student ar[] = new Student[t];
        for(int i=0; i<t; i++){
            String id = String.format("HS%02d", i+1);
            String name = sc.nextLine();
            float p = sc.nextFloat();
            sc.nextLine();
            ar[i]=new Student(id, name, p);
        }
        
        int ind =0;
        Arrays.sort(ar);
        for(Student x: ar){
            x.setRank(++ind);
        }
        for(int i=1; i<t ;i++){
            if(ar[i].getPoint() == ar[i-1].getPoint()){
                int k = ar[i-1].getRank();
                ar[i].setRank(k);
            }
        }
        
        Arrays.sort(ar, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for(Student x: ar){
            System.out.println(x);
        }
    }
}
/*
5
Tran Minh Hieu
5.9
Nguyen Bao Tru
8.6
Le Hong Hao
9.2
Nguyen Bao Trung
8.6
Le Hong Cac
9.2
*/