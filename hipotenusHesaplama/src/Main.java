import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1,kenar2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.kenarı giriniz");
        kenar1= scanner.nextInt();
        System.out.println("2.kenarı giriniz");
        kenar2= scanner.nextInt();

        double hipotenus=(Math.sqrt((kenar1*kenar1)+ (kenar2*kenar2)));
        System.out.println("hipotenus:" + hipotenus);
    }
}