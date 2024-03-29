/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author DELL
 */
public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<Integer, Integer> m = new TreeMap<>();
        
        int t = sc.nextInt();
        for(int i=0;i<t-1; i++){
            int a =sc.nextInt(),
                b = sc.nextInt();
            if(m.containsKey(a)){
                m.replace(a, m.get(a)+1);
            }
            else
                m.put(a, 1);
            
            if(m.containsKey(b)){
                m.replace(b, m.get(b)+1);
            }
            else
                m.put(b, 1);
            
        }
        
        boolean ok=false;
        for(int x:m.keySet()){
            if(m.get(x) == t-1){
                ok=true;
                break;                    
            }          
        }
        if(ok)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
