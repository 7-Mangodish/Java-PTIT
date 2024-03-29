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
public class J02017 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++)
            a[i]= sc.nextInt();
        
        Stack st =new Stack();
        for(int i=0; i<n ;i++){
            if(st.empty())
                st.push(a[i]);
            else{
                int tmp= (int)st.peek();
                if((tmp+a[i])%2==0)
                    st.pop();
                else
                    st.push(a[i]);
            }
        }
        if(st.size()!=0)
            System.out.println(st.size());
        else
            System.out.println(-1);
    }
}
