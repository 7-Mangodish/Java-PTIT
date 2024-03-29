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
public class J03028_MaHoaDRM {
    public static String rotate(String s){
        int cnt =0;
        for(int i=0; i<s.length(); i++){
           cnt += s.charAt(i) - 'A';
        }
        // +26 = quay 1 vong
        cnt %= 26;
        String res="";
        for(int i=0; i<s.length(); i++){
            int tmp = (s.charAt(i) - 'A' +cnt)%26;
            char c = (char)(tmp+'A');
            res += c;
        }
        return res;
    }
    
    public static String merge(String s1, String s2){
        String res="";
        for(int i=0; i<s1.length(); i++){
            int cnt = s2.charAt(i) -'A';
            int tmp = (s1.charAt(i)-'A'+cnt)%26;
            res+=(char)(tmp+'A');
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2);
            System.out.println(merge(rotate(s1), rotate(s2)));
        }
    }
}
/*
3
EWPGAJRB
BB
TPQJDRJWSQXGRRIPXFMINTELHBJA
*/