/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class proj{
    private String id, name, num, gr, name_pro;

    public proj(String id, String name, String num, String gr) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.gr = gr;
    }
    
    public void setName_pro(String s){
        this.name_pro = s;
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
        return this.id + " " + this.name + " " + this.num +" " + this.gr + " "+ this.name_pro;
    }
    
}
public class J06003_QuanLiBaiTapNhom2 {
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
        Collections.sort(ar, new Comparator<proj>(){
            @Override
            public int compare(proj o1, proj o2) {
                return o1.getId().compareTo(o2.getId());
            }
        
        });
        
        Map<Integer, String> mp = new HashMap();
        for(int i=0; i<m; i++){
            mp.put(i+1, sc.nextLine());
        }
        
        for(proj x: ar){
            for(int i : mp.keySet()){
                if(i == Integer.parseInt(x.getGr())){
                    x.setName_pro(mp.get(i));
                    break;
                }
            }
            System.out.println(x);
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
*/