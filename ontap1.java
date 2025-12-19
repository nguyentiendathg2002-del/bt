/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;
import java.util.Scanner;
public class ontap1 {
    public static void main(String[] args) {
        float a, b, c;
          Scanner sc = new Scanner(System.in);
          System.out.print("nhap a:");
        a= sc.nextFloat();
        System.out.print("nhap b:");
        b= sc.nextFloat();
        System.out.print("nhap c:");
        c= sc.nextFloat();
        System.out.println("a+b*c="+(a+b*c));
        System.out.println("(a+b)*c="+((a+b)*c));
        System.out.println("a/b-c="+(a/b-c));
        System.out.println("a/(b-c)="+(a/(b-c)));
    }
}
