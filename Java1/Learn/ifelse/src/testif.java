
import java.util.Scanner;

public class testif {

    public static void main(String[] args) {
        System.out.print("\nNhap di: ");
        Scanner data = new Scanner(System.in);
        int d = data.nextInt();

        switch (d) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Nhap so tu 1 den 2");
        }
    }

}
