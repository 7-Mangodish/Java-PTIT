/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class J01003 {
    public static void main(String arc[]){
        Scanner sc= new Scanner(System.in);
        float a, b;
        a =sc.nextInt();
        b= sc.nextInt();
        if(a==0 && b!=0)
            System.out.print("VN");
        else if(b==0 && a==0)
            System.out.print("VSN");
        else
            System.out.printf(" %.2f", -b/a);
    }
}
