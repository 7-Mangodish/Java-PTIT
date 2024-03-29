/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J03009 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            String w1[]= s.trim().split(" +");
            String s2= sc.nextLine();
            String w2[]= s2.trim().split(" +");
            ArrayList <String> ans = new ArrayList<String>();
            for(String x : w1){
                boolean ok= true;
                for(String y : w2){
                    if (x.compareTo(y)==0){
                        ok= false;
                        break;
                    }
                }
                if( ok== true && ans.contains(x)==false){
                    ans.add(x);
                }
            }
            Collections.sort(ans);
            for(String x: ans){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    /*
2
abc ab ab ab abcd
ab abc
aaa xyz ab zzz abc dd dd abc
xyz dd ttt sas cdc
        */
    }
}
