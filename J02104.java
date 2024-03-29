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
public class J02104 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int ind=0;
        String s[]= new String[1000005];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int tmp= sc.nextInt();
                if(tmp==1 && j>i){
                    String res="("+String.valueOf(i)+","+String.valueOf(j)+")";
                    s[ind++]=res;
                }
            }
        }
        for(int i=0; i<ind; i++)
            System.out.println(s[i]);
    }
}
