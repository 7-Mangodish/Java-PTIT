/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        List <String> l = new ArrayList<String>();
        while(sc.hasNext()){
            l.add(sc.next());
        }
        int cnt[] = new int[1005];
        for(String x: l){
            int tmp = Integer.parseInt(x);
            cnt[tmp]++;
        }
        for(int i=0; i<=1000; i++){
            if(cnt[i]!=0){
                System.out.println(i+" "+cnt[i]);
            }
        }
    }
}
