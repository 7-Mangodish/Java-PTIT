/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


class hotel implements Comparable<hotel>{
    private String id,name, room; 
    private int  time, bonus;
    private int sum_fee;
    
    public hotel(int id, String name, String room, int time, int bonus){
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.room = room;
        this.time = time;
        this.bonus = bonus;
        this.sum_fee = this.Fee()* time + this.bonus;
    }
    
    private int Fee(){
        char c = room.charAt(0);
        if(c=='1')
            return 25;
        else if(c=='2')
            return  34;
        else if(c=='3')
            return  50;
        return 80;
    }
    
    @Override
    public int compareTo(hotel o){
        if(this.sum_fee > o.sum_fee)
            return -1;
        return 1;
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name +" "+ this.room +" " + this.time + " " + this.sum_fee;
    }
}
public class J07051_TinhTienPhong {
    public static void main(String[] args)throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("E:\\CODE\\Java\\Project1\\src\\File\\DATA.txt"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        int n = Integer.parseInt(sc.nextLine());
        hotel arr[] = new hotel[n];
        for(int i=0; i<n; i++){
            String tmp = sc.nextLine().trim();
            String w[] = tmp.split(" +");
            String name="";
            for(String x:w)
                name += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase()+" ";
            name = name.substring(0, name.length()-1);
            
            String room = sc.nextLine().trim();
            
            Date d1 = sdf.parse(sc.nextLine()),
                 d2 = sdf.parse(sc.nextLine());
            long time = (d2.getTime() - d1.getTime())/(long)(1000*60*60*24)+1;
            
            int bonus = Integer.parseInt(sc.nextLine());
            arr[i] = new hotel(i+1, name, room, (int)time, bonus);
        }
        Arrays.sort(arr);
        for(hotel a:arr)
            System.out.println(a);
    }
    
}
