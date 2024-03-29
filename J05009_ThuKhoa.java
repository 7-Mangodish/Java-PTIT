/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.Arrays;
import java.util.Scanner;
class TK implements Comparable<TK>{
    private String id, name, date;
    private float p;

    public TK(String id, String name,String date, float p) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.p = p;
    }

    public float getP() {
        return p;
    }

    public String getId() {
        return id;
    }
    
    
    @Override
    public int compareTo(TK o) {
       if(this.p < o.getP())
           return -1;
       if(this.p == o.getP())
           return this.id.compareTo(o.getId());
       return 1;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.date + " "+ this.p;
    }
}
public class J05009_ThuKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine());
        TK a[] = new TK[t];
        float ans =0;
        for(int i=0; i<t; i++){
            String name = sc.nextLine();
            String date = sc.nextLine();
            float p1 = Float.parseFloat(sc.nextLine()),
                  p2 = Float.parseFloat(sc.nextLine()),
                  p3 = Float.parseFloat(sc.nextLine());
            float p = p1+p2+p3;
            ans = Math.max(ans, p);
            a[i] = new TK(String.format("%d", i+1), name, date, p);
        }
        Arrays.sort(a);
        for(TK x:a){
            if(x.getP()==ans)
                System.out.println(x);
        }
    }
}
/*
3
Nguyen Van A
12/12/1994
3.5
7.0
5.5
Nguyen Van B
1/9/1994
7.5
9.5
9.5
Nguyen Van C
6/7/1994
8.5
9.5
8.5
*/