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

class product implements Comparable<product>{
        private String id, name;
        private long vat,  cnt, price;

        public product(String id, String name, long cnt, long price) {
            this.id = id;
            this.name = name;
            this.cnt = cnt;
            this.price = price;
            this.vat = this.getVat();
        }

        public long getVat(){
            long s = this.cnt * this.price;
            if(this.cnt > 10)
                s = s * 5 /100;
            else if(this.cnt >=8)
                s = s * 2 /100;
            else if(this.cnt >=5)
                s = s * 1 /100;
            else if(this.cnt < 5)
                s = 0;
            return s;
        }

        public long getTotal(){
            return this.cnt * this.price - this.getVat();
        }

        @Override
        public String toString(){
            return this.id + " " + this.name + " " + vat + " " + this.getTotal();
        }

    @Override
    public int compareTo(product o) {
        if(this.vat > o.getVat())
            return -1;
        return 1;
    }
} 
public class J05047_BangKeNhapKhoTheoChietKhau {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <CodePtit.product> ar = new ArrayList<>();
        Map <String, Integer> mp = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String name = sc.nextLine();
            
            String w[] = name.split(" +");
            String prefix = "";
            for(int j=0; j<=1; j++){
                String tmp = w[j].toUpperCase();
                prefix += tmp.charAt(0);
            }           
            if(mp.containsKey(prefix))
                mp.replace(prefix, mp.get(prefix) +1);
            else
                mp.put(prefix, 1);
            String id = String.format("%s%02d", prefix, mp.get(prefix));
            
            long cnt = sc.nextLong(),
                 price = sc.nextLong();
            sc.nextLine();
            ar.add(new CodePtit.product(id, name , cnt, price));
        }
        
        Collections.sort(ar);
        for(CodePtit.product x : ar){
            System.out.println(x);
        }
    }
}
/*
6
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
*/