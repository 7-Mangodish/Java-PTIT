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
public class J02102_MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        LinkedList<Integer> l = new LinkedList<>();
        for(int i=0; i<t; i++){
            for(int j=0; j<t; j++){
                int tmp = sc.nextInt();
                l.add(tmp);
            }
        }
        Collections.sort(l);
        int ind =0;
        int a[][] = new int[t][t];
        int r1= 0, r2 = t-1, c1 = 0, c2 = t-1;
        while(r1 <= r2 && c1 <=c2){
            for(int i=c1 ; i<=c2; i++)
                a[r1][i] = l.get(ind++);
            r1++;
            
            for(int i=r1; i<=r2; i++)
                a[i][c2] = l.get(ind++);
            c2--;
            
            if(r1 <= r2){
                for(int i=c2; i>=c1 ;i--)
                    a[r2][i] = l.get(ind++);
                r2--;
            }
            
            if(c1 <= c2){
                for(int i = r2; i>=r1; i--){
                    a[i][c1] = l.get(ind++);
                }
                c1++;
            }
        }
                    
        for(int i=0 ;i<t; i++){
            for(int j = 0; j<t; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
/*
3
3 6 1
8 7 9
4 12 5
*/