
package CodePtit;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03010_DiaChiEmail {
    public static String sol(String s){
        String str[] = s.toLowerCase().trim().split(" +");
        String res="";
        for(int i=0; i<str.length-1; i++){
            String tmp= str[i];
            res += tmp.charAt(0);
        }
        res=str[str.length -1]+res;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        HashMap <String, Integer> m= new HashMap<String, Integer>();
        while(t-->0){
            String s= sc.nextLine();
            s=sol(s);
            if(m.containsKey(s)== false){
                m.put(s, 1);     
                System.out.println(s+"@ptit.edu.vn");
            }
            else{
                m.put(s, m.get(s)+1);
                String tmp= s+String.valueOf(m.get(s));
                System.out.println(tmp+"@ptit.edu.vn");            
            }
                
        }
    }
}
/*
4
    nGUYEn    quaNG   vInH  
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
*/
