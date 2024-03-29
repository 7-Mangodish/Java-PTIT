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
public class J01002 {
    public static void main(String arc[]){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            long n= sc.nextInt();
            long sum= n*(n+1)/2;
            System.out.println(sum);
        }
    }
}
