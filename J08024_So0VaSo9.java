/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J08024_So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Queue <String> q = new LinkedList<> ();
            q.add("9");
            String ans="";
            while(q.size()!=0){
                String top = q.poll();
                if(Integer.parseInt(top) %n==0){
                    ans = top;
                    break;
                }
                q.add(top + "0");
                q.add(top + "9");                
            }
            System.out.println(ans);
        }
    }
}
/*
2
5
7
*/