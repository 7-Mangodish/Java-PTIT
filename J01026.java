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
public class J01026 {
    static boolean check(int n){
        if(Math.sqrt(n) == (int)Math.sqrt(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            if(check(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
