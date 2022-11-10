import javax.swing.*;

public class Ejercicio5While {
    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;

        aleatorio = (int)(Math.random() *100); //El uso de Math.random me genera un número que hemos convertido de tipo double a tipo entero y nos saca un número de 0 a 100

        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número: "));

            if(aleatorio > numero){
                System.out.println("Intenta con un número mayor");
            }else{
                System.out.println("Intenta con un número menor");
            }
            contador++; //Aumentamos en uno el contador cada vez que el usuario haga un intento de adivinar
        }while(numero != aleatorio);
        System.out.println("\nEnhorabuena!!Adivinaste el número en " +contador+ " intentos");
    }
}
