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
public class J03033_LcmCua2SoNguyenLon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            BigInteger a= sc.nextBigInteger();
            BigInteger b= sc.nextBigInteger();
            BigInteger g= a.gcd(b);
            BigInteger mul= a.multiply(b);
            BigInteger ans= mul.divide(g);
            System.out.println(ans);
        }
    }
}
/*
3
12
100
1212
8888
121212121212121212
45678978
*/
