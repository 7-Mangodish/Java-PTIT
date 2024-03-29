/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

class point{
    public double x, y;
    
    public point(double x, double y){
        this.x = x;
        this.y = y;        
    }
    
    public double dis(point another){
        return Math.sqrt( (x-another.x)*(x-another.x) + (y - another.y)*(y - another.y));
    }
}
public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            point a = new point(sc.nextDouble(), sc.nextDouble()),
                  b = new point(sc.nextDouble(), sc.nextDouble()),
                  c = new point(sc.nextDouble(), sc.nextDouble());
            double x = a.dis(b),
                    y = b.dis(c),
                    z = c.dis(a);
            //System.out.printf("%f %f %f\n", x, y, z);
            if( (x+y)<= z || (x+z) <= y || (y+z) <= x)
                System.out.println("INVALID");
            else
                System.out.printf("%.3f\n", x+y+z); 
        }
    }
}
