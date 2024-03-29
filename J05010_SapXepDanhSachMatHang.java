/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class MH{
    private String id, name, gr;
    private float inc;

    public MH(String id, String name, String gr, float inc) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.inc = inc;
    }
    
    public float getInc(){
        return this.inc;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.gr + " " + String.format("%.2f", this.inc);
    }
}
public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MH> ar = new ArrayList<>();
        for (int i=0; i<t; i++){
            String name = sc.nextLine();
            String gr = sc.nextLine();
            float in = Float.parseFloat(sc.nextLine()),
                  out = Float.parseFloat(sc.nextLine());
            ar.add(new MH(String.format("%d", i+1), name, gr, out-in));
        }
        Collections.sort(ar, new Comparator<MH>(){
            @Override
            public int compare(MH o1, MH o2) {
                if(o1.getInc() > o2.getInc())
                    return -1;
                return 1;
            }            
        });
        for(MH x:ar){
            System.out.println(x);
        }       
    }
}
/*
3
May tinh SONY VAIO
Dien tu
16400
17699
Tu lanh Side by Side
Dien lanh
18300
25999
Banh Chocopie
Tieu dung
27.5
37
*/