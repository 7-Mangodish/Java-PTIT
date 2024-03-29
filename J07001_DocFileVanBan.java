/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:\\CODE\\Java\\Project1\\src\\CodePtit\\DATA.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}
