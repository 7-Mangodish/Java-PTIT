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
public class J08021_DauNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){
            Stack <Integer> st = new Stack<>();
            st.push(-1);
            int ans =0;
            
            String s= sc.nextLine();
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);              
                if(c =='(')
                    st.push(i);
                else{
                    
                    if(st.size()>1 && s.charAt(st.peek())=='('){
                        st.pop();
                        ans = Math.max(ans, i-st.peek());
                    }
                    else
                        st.push(i);
                }
            }
            System.out.println(ans);   
        }

    }
}
/*
3
((()
)()())
()(()))))
*/