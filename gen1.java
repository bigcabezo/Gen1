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
        String texto = scanner.nextLine();

        //cambiado string "nombre" por "texto"

        System.out.println("Has escrito: " + texto);
        scanner.close();
    }
}

//Yo añado cosas pero sigue siendo placeholder todo esto jej.