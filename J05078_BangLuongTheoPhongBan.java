/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class staff{
    private String id, name, room;
    private int salPerDays, cnt, total, index;

    public staff(String id, String name, int salPerDays, int cnt) {
        this.id = id;
        this.name = name;
        this.salPerDays = salPerDays;
        this.cnt = cnt;
        this.setIndex();
        this.setTotal();
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
    public void setIndex(){
        int tmp = Integer.parseInt(this.id.substring(1, 3));
        if(this.id.startsWith("A")){
            if(tmp >= 16)
                this.index = 20;
            else if(tmp >= 9)
                this.index = 14;
            else if(tmp >= 4)
                this.index = 12;  
            else if(tmp >= 1)
                this.index = 10;            
        }
        else if(this.id.startsWith("B")){
            if(tmp >= 16)
                this.index = 16;
            else if(tmp >= 9)
                this.index = 13;
            else if(tmp >= 4)
                this.index = 11;  
            else if(tmp >= 1)
                this.index = 10;        
        }  
        else if(this.id.startsWith("C")){
            if(tmp >= 16)
                this.index = 14;
            else if(tmp >= 9)
                this.index = 12;
            else if(tmp >= 4)
                this.index = 10;  
            else if(tmp >= 1)
                this.index = 9;            
        }     
        else if(this.id.startsWith("D")){
            if(tmp >= 16)
                this.index = 13;
            else if(tmp >= 9)
                this.index = 11;
            else if(tmp >= 4)
                this.index = 9;  
            else if(tmp >= 1)
                this.index = 8;            
        }           
    }
    
    public void setTotal(){
        this.total = this.index * this.cnt * this.salPerDays;
    }

    public String getRoom() {
        return room;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name+ " " + this.total*1000;
    }
}
public class J05078_BangLuongTheoPhongBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> mp = new HashMap<>();
        while(n-->0){
            String w[] = sc.nextLine().split(" ");
            String room = "";
            for(int i=1; i<w.length; i++)
                room += w[i] + " ";
            room = room.trim();
            mp.put(w[0], room);
        }
        
        ArrayList<staff> ar = new ArrayList<>();
        int m= Integer.parseInt(sc.nextLine());
        while(m-->0){
            String id = sc.nextLine(),
                   name = sc.nextLine();
            int sal = Integer.parseInt(sc.nextLine()),
                cnt = Integer.parseInt(sc.nextLine());
            
            staff a = new staff(id, name, sal, cnt);
            String tmp = id.substring(3, 5);
            String room = mp.get(tmp);
            a.setRoom(room);
            ar.add(a);
        }
        String id = sc.nextLine();
        System.out.printf("Bang luong phong %s:\n", mp.get(id));
        for(staff x: ar){
            if(x.getRoom().compareTo(mp.get(id)) == 0)
                System.out.println(x);
        }
        
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24 
HC
*/