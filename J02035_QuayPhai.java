/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            LinkedList<Integer> l1 = new LinkedList<>();
            LinkedList<Integer> l2 = new LinkedList<>();
            for(int i=0; i<n ;i++){
                int tmp = sc.nextInt();
                l1.addLast(tmp);
            }
            l2.addAll(l1);
            Collections.sort(l2);
            int ind = l1.indexOf(l2.getFirst());
            System.out.println(ind);
        }
    }
}
/*
2
5
5 1 2 3 4
5
1 2 3 4 5
*/