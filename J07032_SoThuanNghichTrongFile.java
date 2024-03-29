/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author DELL
 */
public class J07032_SoThuanNghichTrongFile {
    
    public static boolean check(int a){
        String s = String.valueOf(a);
        int l=0, r= s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r++;
        }
        return true;
    }
            
    public static boolean checkCH(int a){
        String s = String.valueOf(a);
        if(s.length() %2 ==0 || s.length() == 1)
            return false;
        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i) %2 ==0)
                return false;
        }
        return true;
    }        
    public static void main(String[] args)throws java.io.IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream( new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();     

        TreeMap<Integer, Integer> m1 = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> m2 = new TreeMap<Integer, Integer>();
      

        for(int x:a){
            if(!m1.containsKey(x))
                m1.put(x, 1);
            else{
               
                m1.put(x, m1.get(x)+1);
            }
        }
        for(int x:b){
            if(!m2.containsKey(x))
                m2.put(x, 1);
            else{
                int cnt=m2.get(x);
                m2.remove(x);
                m2.put(x, cnt+1);
            }
        }    
        int ind=10;
        for(int x:m1.keySet()){
            if(ind ==0)break; 
            if(m2.containsKey(x) && check(x) && checkCH(x)){
                int cnt = m1.get(x) + m2.get(x);
                System.out.println(x+" "+cnt);
                ind--;
            }
        }
    }
}
 