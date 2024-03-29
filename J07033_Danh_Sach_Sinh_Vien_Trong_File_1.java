/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class SV implements Comparable<SV> {
    public String id, name, cl, email;
    
    public SV(String id, String name, String cl, String email){
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.email = email;
    }
    public String ch(){
        String s[] = this.name.trim().split(" +");
        String ans = new String();
        for(int i=0; i<s.length; i++){
            ans += s[i].substring(0,1).toUpperCase() + s[i].substring(1).toLowerCase() +" ";
        }
        return ans;
    }
    
    @Override
    public int compareTo(SV o){
        if(this.id.compareTo(o.id) <0)
            return -1;
        return 1;
    }
    @Override 
    public String toString(){
        return this.id + " " + ch()  + this.cl + " " + this.email;
    }
}
public class J07033_Danh_Sach_Sinh_Vien_Trong_File_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList <String> a = new ArrayList<String>();
        while(sc.hasNext()){
            a.add(sc.nextLine());
        }

        int t = Integer.parseInt(a.get(0));
        
        ArrayList <SV> s= new ArrayList<SV>();
        for(int i=1; i<4*t; i+=4){
            SV tmp = new SV(a.get(i), a.get(i+1), a.get(i+2), a.get(i+3));
            s.add(tmp);
        }
        Collections.sort(s);
        for(SV x: s){
            System.out.println(x);
        }
    }
}
