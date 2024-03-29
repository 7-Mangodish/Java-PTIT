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
public class J04004_TongPhanSo {
    static class ps{
        public long t, m;
        
        public ps(){
            
        }
        
        public ps(long t, long m){
            this.t= t; this.m = m;
        }
        
        public  long Gcd(long a, long b ){
            if (b==0)
                return a;
            return Gcd(b, a%b); 
        }
        
        public ps add(ps another){
            ps ans = new ps();
            ans.t = this.t * another.m + another.t * this.m;
            ans.m = this.m * another.m;
            long g = Gcd(ans.t, ans.m);
            ans.t /= g; 
            ans.m /= g;
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ps a = new ps(sc.nextLong() , sc.nextLong());
        ps b = new ps(sc.nextLong(), sc.nextLong());
        ps ans = a.add(b);
        System.out.printf("%d/%d", ans.t, ans.m);
    }
}
//123 456 12 34