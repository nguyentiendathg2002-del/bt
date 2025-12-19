/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;
import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        float a, b;
        int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("nhập số a:");
        a=sc.nextFloat();
        System.out.print("nhập số b:");
        b=sc.nextFloat();
        
    System.out.println("MENU");
    System.out.println("1. phép cộng");
        System.out.println("2. phép trừ");
        System.out.println("3. phép nhân");
        System.out.println("4. phép chia");
        System.out.print("chọn tính năng:");
        n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("a+b="+(a+b));
		break; 
                case 2:
                System.out.println("a-b="+(a-b));
		break; 
                case 3:
                System.out.println("axb="+(a*b));
		break; 
                case 4:
                System.out.println("a/b="+(a/b));
		break; 
                default: 
		System.out.println("CHỊU"); 
        }
    }
}
