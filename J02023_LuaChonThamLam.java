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
public class J02023_LuaChonThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, s;
        n = sc.nextInt();
        s = sc.nextInt();
        if(9*n <s || s==0){
            System.out.println(-1 + " " + -1);
        }
        else{
            int max[] = new int[n];
            int q1 = s/9,
                r1 = s%9;
            for(int i=0; i<q1; i++)
                max[i] =9;
            max[q1] = r1;
            
            int min[] = new int[n];
            min[0] =1;
            int s2 = s-1;
            int q2 = s2/9,
                r2 = s2%9;
            int ind = n-1;
            while(q2 >0 ){
                min[ind--]=9;
                q2--;
            }

            min[ind]+=r2;
            for(int x:min)
                System.out.print(x);
            System.out.print(" ");
            for(int x:max)
                System.out.print(x);
            
        }    
    }
}
