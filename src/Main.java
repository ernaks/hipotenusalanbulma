import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("Birinci kenarı giriniz: ");
        a = sc.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b = sc.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus: " + c);

        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " + alan);

    }
}