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
public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
             char c=s.charAt(i);
             if(c=='4' || c=='7')
                 ++cnt;
        }
        if(cnt ==4 || cnt==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
