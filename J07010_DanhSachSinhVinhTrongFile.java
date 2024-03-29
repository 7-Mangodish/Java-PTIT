/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sv {
    private String id, name,  cl, date;
    private float gpa;
    
    private String ch(String s){
        StringBuilder ans= new StringBuilder(s);       
        if(ans.charAt(2) != '/')
            ans.insert(0, "0");
        if(ans.charAt(5) != '/')
            ans.insert(3, "0");
        return String.valueOf(ans);        
    }
    public Sv(int id, String name, String cl,  String date, float gpa){
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.cl = cl;
        this.date = ch(date);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f",id, name, cl, date, gpa );
    }
}
public class J07010_DanhSachSinhVinhTrongFile  {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\CODE\\Java\\Project1\\src\\File\\SV.txt" );
        Scanner sc = new Scanner(file);
        List <String> l = new ArrayList<String>();
        while(sc.hasNextLine()){
            l.add(sc.nextLine());
        }
        int n= Integer.parseInt(l.get(0));
        int ind=1;
        for(int i=1; i<=n*4; i+=4){
            Sv a = new Sv(ind++, l.get(i), l.get(i+1), l.get(i+2), Float.parseFloat(l.get(i+3)) );
            System.out.println(a);
        }
    }
}
