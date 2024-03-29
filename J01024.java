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
public class J01024 {
    static boolean check( String s){
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c !='0' && c!='1' && c!='2')
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s= sc.nextLine();            
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
