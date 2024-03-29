
package CodePtit;

import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author DELL
 */
public class J03004 {
    static void sol(String str){
        str= str.trim().toLowerCase();
        String w[]= str.split("\\s+");
        for(String x: w){
            System.out.print(x.substring(0, 1).toUpperCase()
            + x.substring(1, x.length())+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str= sc.nextLine();
            sol(str);
            System.out.println("");
        }
    }
}
;