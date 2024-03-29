/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.Scanner;
public class J01009 {
    static long []ar=new long[21]; 
    static void sol(){
        ar[1]=1;
        for(int i=2; i<=20; i++){
            ar[i]=i*ar[i-1];
        }
    }
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        sol();
        int n=sc.nextInt();
        long sum=0;
        for(int i=1; i<=n; i++){
            sum+= ar[i];
        }
        System.out.println(sum);
    }
}
