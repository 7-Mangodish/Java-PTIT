/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class MonThi implements Comparable<MonThi>{
    private String id, name, form;

    public MonThi(String id, String name, String form) {
        this.id = id;
        this.name = name;
        this.form = form;
    }
    
    @Override 
    public int compareTo(MonThi o){
        return this.id.compareTo(o.id);
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.form;
    }
}
public class J07058_DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        MonThi a[] = new MonThi[t];
        for(int i=0; i<t; i++){
            a[i] = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(MonThi x: a)
            System.out.println(x);
    }
}
