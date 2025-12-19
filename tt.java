package C1;
import java.util.Scanner;

public class tt {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số người: ");
        int n = sc.nextInt();
        sc.nextLine();

        person[] nguoi = new person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Người thứ " + (i+1) + ": ");
            System.out.print("Tên: ");
            String name = sc.nextLine();

            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Lớp: ");
            String lop = sc.nextLine();

            System.out.print("Điểm: ");
            float diem = sc.nextFloat();
            sc.nextLine();

            nguoi[i] = new person(name, age, lop, diem);
        }

        System.out.println("\n===== THÔNG TIN =====");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Tên", "Tuổi", "Lớp", "Điểm");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            nguoi[i].displayInfo();
        }
    }
}

class person {
    String name;
    int age;
    String lop;
    float diem;

    public person(String name, int age, String lop, float diem){
        this.name = name;
        this.age = age;
        this.lop = lop;
        this.diem = diem;
    }

    public void displayInfo(){
        System.out.printf("%-20s %-10d %-10s %-10.2f\n", name, age, lop, diem);
    }
}