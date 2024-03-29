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
public class J08022_PhanTuDauTienLonHon {
    public static Stack<Integer> st = new Stack<>();
    public static int sol(int n){
        while(!st.empty() && st.peek() <= n){
            st.pop();
        }
        if(st.empty())
            return -1;
        return st.peek();
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int ans[] = new int[n];
            for(int i=n-1; i>=0; i--){
                ans[i] = sol(a[i]);   
                st.push(a[i]);                
            }   
            for(int x:ans)
                System.out.print(x + " ");
            System.out.println("");
            st.clear();
        }
    }
}
/*
3
4
4 5 2 25
3
2 2 2
4
4 4 5 5
*/