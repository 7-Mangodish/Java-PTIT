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
public class J04005_KhaiBaoLopThiSinh {
    static class sv{
        public String name, date;
        public double point;
        
        public sv(String name, String date, double point){
            this.name = name;
            this.date = date;
            this.point = point;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, date;
        name= sc.nextLine();
        date = sc.nextLine();
        double a,b,c;
        a= sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        sv x = new sv(name, date, (a + b + c));
        System.out.printf("%s %s %.1f", x.name, x.date, x.point);
        
    }
}
/*
Nguyen Hoang Ha
11/10/2001
4.5
10.0
5.5
*/