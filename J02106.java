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
public class J02106 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;
        for(int i=0; i<n; i++){
            int cnt=0;
            for(int j=0; j<3; j++){
                int tmp= sc.nextInt();
                if(tmp==1)
                    cnt++;
            }
            if(cnt > 1)
                ans++;
        }
        System.out.println(ans);
    }
}
