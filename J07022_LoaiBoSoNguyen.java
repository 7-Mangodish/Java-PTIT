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
public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList <String>();
        while(sc.hasNext()){
            String s =  sc.next();
            try{
                int num = Integer.parseInt(s);
            }
            catch(NumberFormatException e){
                a.add(s);
            }
        }
        Collections.sort(a);
        for(String x: a){
            System.out.print(x + " ");
        }
    }
}
