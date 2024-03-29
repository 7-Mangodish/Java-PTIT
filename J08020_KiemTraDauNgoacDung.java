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
public class J08020_KiemTraDauNgoacDung {
    public static boolean check(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{' )
                st.push(c);
            else{
                if(st.isEmpty())
                    return false;
                if(c ==')' && st.peek()!='(')
                    return false;
                if(c ==']' && st.peek()!='[')
                    return false;
                if(c =='}' && st.peek()!='{')
                    return false;   
                st.pop();
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
/*
2
[()]{}{[()()]()}
[(])
*/