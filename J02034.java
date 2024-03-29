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
public class J02034 {
    static SortedSet s = new TreeSet();
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int a[]= new int[n];
       for(int i=0; i<n; i++){
           a[i]= sc.nextInt();
           s.add(a[i]);
       }
       if(s.size()==a[n-1])
            System.out.println("Excellent!");
       else{
           for(int i=1; i<a[n-1]; i++){
               if(!s.contains(i))
                   System.out.println(i);                   
           }
       }
    }
}
