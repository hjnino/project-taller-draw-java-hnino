import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un primer numero:");
        int a = scanner.nextInt();
        System.out.println("Ingrese un segundo numero:");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Los números son iguales");
            return;
        } else {
            System.out.println("Ingrese un tercer numero:");
        }
        int c = scanner.nextInt();

        if (c == a) {
            System.out.println("Los números son iguales");
            return;
        } else if (c == b) {
            System.out.println("Los números son iguales");
            return;
        }

        if (a > b) {
            if (a > c) {
                System.out.println("El numero mayor es:" + a);
                if (b>c){
                    System.out.println("El numero menor es:" + c);
                }else {
                    System.out.println("El numero menor es:" + b);
                }

            } else {
                System.out.println("El numero mayor es:" + c);
                if(a>b) {
                    System.out.println("El numero menor es:" + b);
                }else{
                    System.out.println("El numero menor es:" + a);
                }
            }

        } else {
            if (b>c) {
                System.out.println("El numero mayor es:" + b);
                if(a>c){
                    System.out.println("El numero menor es:" + c);
                }else{
                    System.out.println("El numero menor es:" + a);
                }

            } else {
                System.out.println("El numero mayor es:" + c);
                if(a>b){
                    System.out.println("El numero menor es:" + b);
                }else{
                    System.out.println("El numero menor es:" + a);
                }
            }
        }
    }
}

