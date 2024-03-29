/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class J07015_SoNguyenToTrongFileNhiPhan {
    public static boolean isPrime(int n){
        if(n<2)
            return false;
        for(int i =2; i<= (int)Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Data.in"));
        ArrayList <Integer> a = (ArrayList)in.readObject();
        int ts[] = new int[10005];
        for(Integer x:a){
            ts[x]++;
        }
        for(int i=0; i<=10000; i++){
            if(ts[i] != 0 && isPrime(i))
                System.out.println(i +" " + ts[i]);
        }
    }
}
