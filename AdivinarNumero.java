import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner ingreseDatos = new Scanner(System.in);
        double numeroRandom = Math.random()*10;
        System.out.println("ingrese un numero: ");
        double numeroUsuario = ingreseDatos.nextDouble();
        if(numeroRandom==numeroUsuario){
            System.out.println("TE FELICITO ADIVINASTE EL NUMERO");
        }else{
            System.out.println("SEGUI PARTICIPANDO , NO ADIVINASTE EL NUMERO :( ");
        }
    }
}
