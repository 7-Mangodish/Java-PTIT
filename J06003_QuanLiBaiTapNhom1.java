/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class proj{
    private String id, name, num, gr;

    public proj(String id, String name, String num, String gr) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.gr = gr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.num;
    }
    
}
public class J06003_QuanLiBaiTapNhom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt(),
            m = sc.nextInt();
        sc.nextLine();
        ArrayList<proj> ar = new ArrayList<>();
        for(int i=0; i<n ;i++){
            String id = sc.nextLine(),
                   name = sc.nextLine(),
                   num = sc.nextLine(),
                   gr = sc.nextLine();
            ar.add(new proj(id, name, num, gr));
        }
        Map<Integer, String> mp = new HashMap();
        for(int i=0; i<m; i++){
            mp.put(i+1, sc.nextLine());
        }
        
        int q= Integer.parseInt(sc.nextLine());
        while(q-->0){
            int k = Integer.parseInt(sc.nextLine());
            System.out.printf("DANH SACH NHOM %d:\n", k);
            for(proj x: ar){
                if(Integer.parseInt(x.getGr()) == k){
                    System.out.println(x);
                }
            }
            System.out.println("Bai tap dang ky: " + mp.get(k));
        }
    }
}

/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1
*/