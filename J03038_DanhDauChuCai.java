/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePtit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        TreeSet <Character> st= new TreeSet<Character>();
        for(int i=0; i<s.length(); i++){
            st.add(s.charAt(i));
        }
        System.out.println(st.size());
    }
}
