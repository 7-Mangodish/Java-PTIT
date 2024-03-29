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

class J07081 implements Comparable<J07081>{
    private String id, name, num, email;

    public J07081(String id, String name, String num, String email) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.email = email;
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public int compareTo(J07081 o) {
        String w1[] = this.name.split(" +"),
               w2[] = o.getName().split(" +");
        String name1=w1[w1.length-1], name2 = w2[w2.length-1];
        String middleName1 ="", middleName2="";
        for(int i=1; i<w1.length-1; i++){
            middleName1 += w1[i]+" ";
        }
        for(int i=1; i<w2.length-1; i++){
            middleName2 += w2[i] + " ";
        }
        String surname1 = w1[0], surname2 = w2[0];
        if(name1.compareTo(name2)==0){
            if(surname1.compareTo(surname2)==0){
                if(middleName1.compareTo(middleName2)==0)    
                    return this.id.compareTo(o.getId());
                else
                    return middleName1.compareTo(middleName2);
            }
            else
                return surname1.compareTo(surname2);
        }
        return name1.compareTo(name2);        
        }
    @Override
    public String toString(){
        return this.id + " " + this.name +" " +this.num + " " + this.email;
    }
    
}
public class J07081_SapXepDanhSachSInhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<J07081> arr= new ArrayList<>();
        for(int i=0; i<t; i++){
            arr.add(new J07081(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr);
        for(J07081 x: arr){
            System.out.println(x);
        }
    }
}
