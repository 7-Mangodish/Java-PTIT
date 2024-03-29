/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class JKT015_GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int p =0;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c=='<' ){
                if(p>0)
                    p -= 1;
            }
            else if(c == '>' ){
                if(p<ans.length())
                    p+=1;
            }
            else if(c == '-'){
                if(p>0){
                    p-=1;
                    ans.deleteCharAt(p);                    
                }
            }
            else{
                ans.insert(p, c);
                p+=1;
            }
//            System.out.println(p);
        }
        System.out.println(ans);
    }
}
