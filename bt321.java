/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;
import java.util.Scanner;
public class bt321 {
    public static void main(String[] args) { 
        float t, h, l, dtb;
        Scanner sc  = new Scanner(System.in);
        System.out.print("nhap diem toan:");
        t= sc.nextFloat();
        System.out.print("nhap diem li:");
        l= sc.nextFloat();
        System.out.print("nhap diem hoa:");
        h= sc.nextFloat();
        dtb= ((t*3)+(l*2)+h)/6;
        System.out.println("Diem trung binh la:"+dtb%2);        
    }
}