/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07003_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.next();
        while(s.length() >1){
            int m =s.length()/2;
            String s1 = s.substring(0, m),
                    s2 = s.substring(m);
            BigInteger num1 = new BigInteger(s1),
            num2 = new BigInteger(s2);
            
            num1 = num1.add(num2);
            s = String.valueOf(num1);
            System.out.println(num1);                       
        }
    }
}
