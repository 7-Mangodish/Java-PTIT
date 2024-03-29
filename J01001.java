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
public class J01001 {
    public static void main(String arc[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
         if(a <=0 || b <=0)
            System.out.print(0);
         else
            System.out.print((a+b)*2 +" " + a*b +'\n');
    }
}
