/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;

class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long gcd(long a, long b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
    public void Simp(){
        long tmp = this.gcd(this.tu, this.mau);
        this.tu /=tmp;
        this.mau /=tmp;
    }
    
    public PhanSo add(PhanSo o){
        long t = this.tu*o.mau + o.tu*this.mau;
        long m = this.mau * o.mau;
        PhanSo ans = new PhanSo(t, m);
        ans.Simp();
        return ans;
    }
    
    public PhanSo Mutiply(PhanSo o){
        long t = this.tu * o.tu;
        long m = this.mau * o.mau;
        PhanSo ans = new PhanSo(t, m);
        ans.Simp();
        return ans;
    }
    
    @Override
    public String toString(){
//        if(this.tu == 0)
//            return "0";
        return this.tu + "/" + this.mau ;
    }
}

public class J04014_TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());

            PhanSo sum = a.add(b),
                   c = sum.Mutiply(sum);            
            PhanSo tmp = a.Mutiply(b),
                   d = tmp.Mutiply(c);
            
            System.out.println(c +" " + d);
                
        }
    }
}
/*
2
1 2 3 4
0 3 4 5
*/