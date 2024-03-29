/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

class SoPhuc{
    private int re, im;

    public SoPhuc(int re, int im) {
        this.re = re;
        this.im = im;
    }
    
    public SoPhuc Add(SoPhuc o){
        int x = this.re + o.re;
        int y = this.im + o.im;
        return new SoPhuc(x, y);
    }
    
    public SoPhuc Multiply(SoPhuc o){
        int x = this.re * o.re;
        int y = this.re * o.im + this.im * o.re;
        int z = this.im * o.im;
        x-=z;
        return new SoPhuc(x, y);
    }
    
    @Override
    public String toString(){
        return String.format("%d + %di", this.re, this.im);
    }
}

public class J04018_SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            
            SoPhuc tmp = a.Add(b),
                   c = tmp.Multiply(a),
                   d = tmp.Multiply(tmp);
            
            System.out.println(c +", " + d);
                              
        }
    }
}
/*
3
1 2 3 4
2 3 4 5
1 -2 5 -6
*/