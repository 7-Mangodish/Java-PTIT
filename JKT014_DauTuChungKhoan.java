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
public class JKT014_DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            
            Stack <Integer> st = new Stack<>();
            int ans[] = new int[n];
            for(int i=0; i<n; i++){
                
                if(st.empty()){                        
                    ans[i] =1;  
                    st.push(i);
                }
                else{
                    while(!st.empty() &&  a[st.peek()] <= a[i]){
                        int top = st.pop();
                        ans[i] += ans[top];
                    }
                    ans[i]+=1;
                    st.push(i);
                }
            }
            for(int x:ans){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
/*
1
7
100 80 60 70 60 75 85
*/