/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Clb{
    private String id, name;
    private long price;

    public Clb(String id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public long getPrice(){
        return this.price;
    }
    
    public String getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }
   
}
public class J05069_CauLacBoBongDa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Clb> mp = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String id = sc.nextLine(),
                   name = sc.nextLine();
            long price = sc.nextLong();
            sc.nextLine();
            mp.put(id, new Clb(id, name, price));
        }
        
        int q =  Integer.parseInt(sc.nextLine());
        while(q-->0){
            String id = sc.next();
            int cnt = sc.nextInt();
            Clb tmp = mp.get(id.substring(1, 3));
            long sum = cnt * tmp.getPrice();
            System.out.println(id + " " + tmp.getName() + " " + sum);
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/