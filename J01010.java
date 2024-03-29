/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author DELL
 */
public class J01010 {
    static void sol(String str){
        String ans="";
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(c=='1' || c=='0'){
                ans += c;
            }
            else if(c=='8' || c=='9'){
                ans+='0';
            }
            else {
                System.out.println("INVALID");
                return; 
            }
        }
        int ind=0;
        boolean ok=false;
        for(int i=0; i<ans.length();i++){
            if(ans.charAt(i)!='0'){
                ind=i;
                ok=true;
                break;
            }
        }
        if(!ok){
            System.out.print("INVALID");
        }
        else{
            for(int i=0; i<ans.length(); i++){
                if(i<ind)
                   continue;
                else{
                    System.out.print(ans.charAt(i));
                }
            }
        }
        System.out.println("");
    }
    
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        
        while(t-- >0){
            String s= sc.nextLine();
            sol(s);            
        }
    }
}
