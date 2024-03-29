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
public class J03039_ChiaHet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            BigInteger a= sc.nextBigInteger();
            BigInteger b= sc.nextBigInteger();
            BigInteger c= new BigInteger("0");   
//            System.out.println(a.mod(b));
//            System.out.print(a+" "+ b);

            if(a.mod(b).intValue() == 0 || b.mod(a).intValue()==0 )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}
/*
2
18 7
3 123
*/
