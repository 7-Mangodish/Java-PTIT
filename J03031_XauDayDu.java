/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class J03031_XauDayDu {
    public static boolean check(String s, int k){
        Set<Character> st = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            st.add(s.charAt(i));
        }
        int cnt = 26 - st.size();
        if(cnt <=k)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            if(check(s,k))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
