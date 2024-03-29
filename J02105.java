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
public class J02105 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String s[][] =new String[1005][];
        for(int i=1; i<=n; i++){
            List<Integer> l= new ArrayList<Integer>();
            for(int j=1; j<=n; j++){
                int tmp;
                tmp= sc.nextInt();
                if(tmp!=0)
                    l.add(j);
            }
            System.out.print("List("+i+") =");
            for(int x:l){
                System.out.print(" "+(int)x);
            }
            System.out.println("");
        }
    }
}
