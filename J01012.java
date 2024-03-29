/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.Scanner;
public class J01012 {
    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextInt();
            int ans=0;
            for(int i=1; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    if(i%2==0)
                        ++ans;
                    if((n/i)%2==0 && (n/i)!=i)
                        ++ans;
                }
            }
            System.out.println(ans);
        }
    }
}
