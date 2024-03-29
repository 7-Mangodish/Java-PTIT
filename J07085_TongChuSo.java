/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class J07085_TongChuSo {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>)in.readObject();
        
        for(String x:arr){
            String s="";
            int sum =0;
            for(int i=0; i<x.length(); i++){
                if(x.charAt(i) >='0' && x.charAt(i) <='9'){
                    s+=x.charAt(i);
                    sum += x.charAt(i)-'0';
                }
            }
            while(s.startsWith("0")){
                s = s.substring(1);
            }
            if(s.compareTo("")!=0)
                System.out.println(s + " " + sum);
        }

    }
}
