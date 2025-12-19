/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;
import java.util.Scanner;
public class sc {
    public static void main(String[] args) {
        int a;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("nhap so a:");
        a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("One"); 
		break; 
                case 2:
                System.out.println("two"); 
		break; 
                case 3:
                System.out.println("Three"); 
		break; 
                default: 
		System.out.println("I don't know."); 

        }
    }
}
