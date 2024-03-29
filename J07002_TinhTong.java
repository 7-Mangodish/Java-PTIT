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

/**
 *
 * @author DELL
 */
public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {       
        File file = new File("E:\\CODE\\Java\\Project1\\src\\File\\DATA.txt");
        Scanner sc = new Scanner(file); 
        List <String> l = new ArrayList<String>();
        while(sc.hasNext()){
            l.add(sc.next());
        }
        
        long ans=0;
        for(String x: l){
            try{
                ans += Integer.parseInt(x);
            }
            catch(NumberFormatException a){
                continue;
            }
            
        }
            System.out.println(ans);
    }
}
