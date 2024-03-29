/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;


class Point{
    private float x, y;
    private Scanner sc;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    
    public static Point nextPoint(Scanner sc){
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        return new Point(x1, y1);
    }
    
    public float distance(Point o){
        return (float)Math.sqrt((this.x - o.x) * (this.x - o.x) + (this.y - o.y)*(this.y-o.y));
    }
}

class Triangle{
    Point p1, p2, p3;
    float sum;
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public boolean valid(){
        float d1 = p1.distance(p2),
              d2 = p2.distance(p3),
              d3 = p3.distance(p1);
        if(d1 >= d2 + d3 || d2 >= d1 + d3 || d3 >= d1+d2)
            return false;
        this.sum = d1 + d2 + d3;
        return true;
    }
    
    public String getPerimeter(){
        return String.format("%.3f", this.sum);
    }
}
public class J04019_LopTriangle1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- >0){
                Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
                if(!a.valid()){
                    System.out.println("INVALID");
                } else{
                    System.out.println(a.getPerimeter());
                }
            }
        }
}

/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
*/