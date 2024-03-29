/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03020_TuThuanNghichDaiNhat {
    public static boolean check(String s){
        int l =0, r=s.length()-1;
        while(l<r){
            if(s.charAt(r) != s.charAt(l))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new LinkedHashMap<>();
        int ans =0;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.isEmpty())
                break;
            String w[] = s.split(" +");
            for(String x:w){
                if(check(x)){
                    if(mp.containsKey(x))
                        mp.replace(x, mp.get(x)+1);
                    else
                        mp.put(x, 1);
                    ans = Math.max(x.length(), ans);
                }                
            }
        }
        for(String s:mp.keySet()){
            if(s.length()==ans){
                System.out.println(s + " " + mp.get(s));
            }
        }
    }
    
}
/*
AAA BABAB HDHDH ACBSD SRGTDH DDDDS
DUAHD AAA AD DA HDHDH AAAAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD
*/