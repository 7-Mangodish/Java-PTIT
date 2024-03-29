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
public class J02005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int a1[]= new int[1002];
        int a2[]= new int[1002];
        for(int i=0; i<n; i++){
            int tmp= sc.nextInt();
            a1[tmp]++;
        }
        for(int i=0; i<m; i++){
            int tmp= sc.nextInt();
            a2[tmp]++;
        }
        for(int i=0; i<1002; i++){
            if(a2[i]!=0 && a1[i]!=0)
                System.out.print(i +" ");
        }
    }
}
