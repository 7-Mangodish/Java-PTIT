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
public class J01025 {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        int xmin= 1005, xmax = -1500, ymin=1005, ymax=-1500;
        for( int i=1; i<=4; i++){
            int a, b;
            a= sc.nextInt();
            b= sc.nextInt();
            xmin= Math.min(xmin, a);
            xmax= Math.max(a, xmax);
            ymin= Math.min(b, ymin);
            ymax= Math.max(b, ymax);
        }
        int ans= Math.max(Math.abs(xmax-xmin),Math.abs(ymax-ymin) );
        System.out.println(ans *ans);
    }
}
