/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J04003_PhanSo {
    static class ps{
        public BigInteger t, m;
        
        public ps(BigInteger t, BigInteger m){
            this.t = t;
            this.m = m;
        } 
        public BigInteger Gcd(BigInteger a, BigInteger b){
            return a.gcd(b);
        }
        
        public void Basic(){
            BigInteger g= Gcd(t,m);
            this.t = t.divide(g);
            this.m = m.divide(g);
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ps a= new ps(sc.nextBigInteger(), sc.nextBigInteger());
        a.Basic();
        System.out.print(a.t + "/" + a.m);
    }
}
