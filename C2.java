/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C1;
import java.util.Scanner; 
/**
 *
 * @author bant6
 */
public class C2 {
    public static void main(String[] args) { 
        Scanner scanner  = new Scanner(System.in);
                int Tong;
        System.out.println("Nhap 3 so: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Tong = a + b +c;
        System.out.println("Tong 3 so;" +Tong);
    }
}
