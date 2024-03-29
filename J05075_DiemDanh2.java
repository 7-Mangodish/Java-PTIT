/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Scanner;


class Student{
    private String id, name, cl, note;
    private int point;

    public Student(String id, String name, String cl) {
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.point = 10;
    }
    
   public void setPoint(int p){
        this.point += p;       
   } 
   
   public void setNote(){
       if(this.point <= 0){
           this.note = "KDDK";  
           this.point = 0;          
       }
       else
           this.note = "";
   }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCl() {
        return cl;
    }

    public String getNote() {
        return note;
    }

    public int getPoint() {
        return point;
    }
   
   
   @Override
   public String toString(){
       return this.id + " " + this.name + " " + this.cl + " " + this.point + " " + this.note; 
   }
}
public class J05075_DiemDanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList< Student> ar = new ArrayList<>();
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine(),
                   cl = sc.nextLine();
            ar.add( new Student(id, name, cl));
        }
        
        for(int i =0; i<t; i++){
            String id = sc.next(),
                   s = sc.next();
//            System.out.println(id + " " + s);
            for(Student x : ar){
                if(x.getId().compareTo(id) ==0){
                    for(int j =0; j<s.length(); j++){
                        char c = s.charAt(j);
                        if(c == 'm')
                            x.setPoint(-1);
                        if(c == 'v')
                            x.setPoint(-2);
                    }
                    break;
                }
            }
        }
        sc.nextLine();
        String cl = sc.nextLine();
        for(Student x: ar){
            x.setNote();
            if(x.getCl().compareTo(cl) ==0)
                    System.out.println(x); 
        }   
    }
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvv
D19CQAT02-B
*/