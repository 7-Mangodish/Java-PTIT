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
public class J02011 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int t= sc.nextInt();
//        while(t-->0){
            int n= sc.nextInt();
            int ar[]= new int[n];
            for(int i=0; i<n; i++)
                ar[i]= sc.nextInt();
            
            for(int i=0; i<n-1; i++){
                System.out.print("Buoc " + (i+1) +":");
                int minPos=i;
                for(int j=i+1; j<n; j++){
                    if(ar[minPos] > ar[j])
                        minPos=j;
                }
                int tmp=ar[i];
                ar[i]= ar[minPos];
                ar[minPos]=tmp;
                for(int x:ar){
                    System.out.print(" "+x);
                }
                System.out.println("");
            }
//        }
    }
}
