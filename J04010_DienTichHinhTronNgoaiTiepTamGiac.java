/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

class  Point{
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(Point o){
        return Math.sqrt(Math.pow(this.x - o.getX(), 2) + Math.pow(this.y - o.getY(), 2));
    }
} 
public class J04010_DienTichHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            Point a = new Point(sc.nextDouble(),sc.nextDouble());
            Point b = new Point(sc.nextDouble(),sc.nextDouble());
            Point c = new Point(sc.nextDouble(),sc.nextDouble());  
            
            double d1 = a.distance(b),
                   d2 = b.distance(c),
                   d3 = c.distance(a);
            
            if(d1 >= d2+d3 || d2 >= d1+d3 || d3 >= d1+d2)
                System.out.println("INVALID");
            else{
                double s = Math.sqrt((d1+d2+d3) * (d1+d2-d3) * (-d1+d2+d3) * (d1+d3-d2))/4f;
                double ans = Math.PI * Math.pow((d1*d2*d3)/(4f*s), 2);
                System.out.printf("%.3f\n", ans);               
            }
        }
    }
}
