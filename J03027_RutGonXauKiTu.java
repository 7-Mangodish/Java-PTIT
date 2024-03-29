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
public class J03027_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack <Character> st= new Stack<Character>();
        String s= sc.nextLine();
        for(int i=0 ; i<s.length(); i++){
            if(st.empty())
                st.push(s.charAt(i));
            else{
                char t= st.peek();
                if(t== s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        if(st.empty())
            System.out.println("Empty String");
        else{
            String ans="";
            while(!st.empty()){
                ans+=st.pop();
            }
            StringBuilder res= new StringBuilder(ans);
            res.reverse();
            System.out.println(res);
        }

            
    }
}
