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

/**
 *
 * @author DELL
 */
class DN implements Comparable<DN>{
    private String id, name, cnt;
    public DN(String id, String name, String cnt){
        this.id = id;
        this.name = name;
        this.cnt = cnt;
    }
    public String getName(){
        return this.name;
    }
    public String getID(){
        return id;
    }
    @Override
    public int compareTo(DN o){
        return this.id.compareTo(o.getID());
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.cnt;
    }
}
public class J07037_DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in" ));
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<DN> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            a.add(new DN(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for(DN x:a){
            System.out.println(x);
        }
    }
}
