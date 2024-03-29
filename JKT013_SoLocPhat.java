/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<String>();
            ArrayList <String> ans = new ArrayList<>();
            q.add("6");
            q.add("8");
            while(q.size()!=0){
                String top =q.poll();
                ans.add(top);
                if(top.length() < n){
                    q.add(top + "6");
                    q.add(top + "8");
                }
            }   
            Collections.sort(ans, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    if(Long.parseLong(o1) > Long.parseLong(o2))
                        return -1;
                    return 1;
                }
                
            });
            System.out.println(ans.size());
            for(String x:ans){
                System.out.print( x + " ");
            }
            System.out.println("");
        }
    }
}
