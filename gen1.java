public class gen1 {
    public static void main(String[] args) {
        System.out.println("hola mundo");
    }
}

//Realmente esto es un placeholder, no tengo ni idea de como se haría esto de verdad...

import java.util.Scanner;

public class LeerTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe cosas");
        String nombre = scanner.nextLine();