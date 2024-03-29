/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03013_Hieu2SoNguyenLon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            BigInteger a= sc.nextBigInteger();
            BigInteger b= sc.nextBigInteger();
            String maxVal= String.valueOf(a.max(b));
            String res= String.valueOf(a.subtract(b).abs());
            while(res.length() < maxVal.length()){
                res= "0"+res;
            }
            System.out.println(res);
        }
    }
}
/*
2
978
12977
100
1000000
*/