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
import java.util.Collections;
import java.util.TreeMap;

/**
 *
 * @author DELL
 */
public class J07029_SoNguyenLonNhatTrongFile {
    public static boolean isPrime(int a){   
        if(a < 2)
            return false;
        for(int i=2; i<= (int)Math.sqrt(a); i++){
            if(a % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        int ts[]= new int[1000005];
        
        for(int x:a){
            ts[x]++;
        }
        int ind =10;
        for (int i=1000002; i>=2; i--){
            if(isPrime(i) && ind >0 && ts[i] != 0){
                System.out.println(i + " " + ts[i]);
                ind --;
            }
            
        }
        
    }
}
