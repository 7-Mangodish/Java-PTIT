/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author DELL
 */
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[] = new int[1005];
        for(int i=0; i<100000; i++){
            a[in.readInt()] ++;
        }
        for(int i=0; i<1005; i++){
            if(a[i] != 0){
                System.out.println(i + " " +a[i]);
            }
        }
    }
}
