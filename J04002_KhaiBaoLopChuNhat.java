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
public class J04002_KhaiBaoLopChuNhat {
    public static class rec{
        private double w, h;
        private String color;
        
        
        public rec(){  
            w=1; h= 1; color="";
        }
        
        public rec(double w, double h, String color){      
            this.w = w;
            this.h = h;
            this.color = color;
        }
        
        public void setColor(String x){
            color = x;
        }
        
        public String getColor(){
            return color;
        }
        
        public double findArea(){
            return w * h;
        }
        
        public double findPer()
        {
            return (w+h)*2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w,h;
        w= sc.nextDouble();
        h = sc.nextDouble();
        String c= sc.next();
            
        if(w <0 || h <0)
            System.out.println("INVALID");
        else{
            c = c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase();
            rec a = new rec(w, h, c);
            System.out.printf("%d %d %s \n", (int)a.findPer(),(int)a.findArea(), a.getColor() );
        }
    }
}
