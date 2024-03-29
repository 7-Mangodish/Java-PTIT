/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class J07030_CapSoNguyenToTrongFile1 {
    public static boolean isPrime(int a){
        if( a< 2)
            return false;
        for(int i=2; i<=(int)Math.sqrt(a); i++){
            if (a%i ==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream( new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        in = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) in.readObject();     
        
        TreeSet <Integer> s1 = new TreeSet<Integer>(a);
        TreeSet <Integer> s2 = new TreeSet<Integer>(b);
        TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for(int x: s1){
            if(isPrime(x) && !m.containsKey(x)){
                int y = 1000000 - x;
                if(s2.contains(y) && isPrime(1000000-x) && y>x){
                    m.put(x, y);
                }
            }
        }
        
        for(int x:m.keySet()){
            System.out.println(x + " " + m.get(x));
        }
    }
}
