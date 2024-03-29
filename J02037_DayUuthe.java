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
public class J02037_DayUuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String w[] = sc.nextLine().split(" +");
            int cnt=0;
            for(String x:w){
                if(Integer.parseInt(x)%2 == 0)
                    cnt++;
                else
                    cnt--;
            }
            if((w.length % 2 ==0 && cnt>0) || (w.length %2==1 && cnt<0))
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
/*
2
11 22 33 44 55 66 77
23 34 45 56 67 78 89 90 121 131 141 151 161 171
*/