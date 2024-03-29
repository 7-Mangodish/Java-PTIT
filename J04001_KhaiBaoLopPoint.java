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
public class J04001_KhaiBaoLopPoint {
    static class point{
        public double x, y;
        
        public point(){
            
        }
                
        public double distance(point p2){
            double ans= Math.sqrt((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y));
            return ans;
        }
        
        public double distance(point p1, point p2){
            double ans= Math.sqrt( (p1.x-p2.x) *  (p1.x-p2.x) + (p1.y-p2.y) *  (p1.y-p2.y) );
            return ans;
        }
        
        @Override
        public String toString(){
            return super.toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        point p1= new point();
        point p2= new point();
        
        int  t= sc.nextInt();
        while(t-->0){
            p1.x= sc.nextDouble();
            p1.y= sc.nextDouble();
            p2.x= sc.nextDouble();
            p2.y= sc.nextDouble();
            double ans= p1.distance( p2);
            System.out.printf("%.4f \n", ans);
        }

    }
}
/*
2
0 0 0 5
0 199 5 6
*/