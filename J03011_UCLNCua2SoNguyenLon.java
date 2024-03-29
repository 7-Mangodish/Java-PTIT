package CodePtit;


import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class J03011_UCLNCua2SoNguyenLon {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            BigInteger x= sc.nextBigInteger();
            BigInteger y= sc.nextBigInteger();
            BigInteger ans= x.gcd(y);
            System.out.println(ans);
        }
    }
}
/*
1
1221
1234567891011121314151617181920212223242526272829
*/
