
package laboratorioclase1;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        String linea = "---------------------------------";
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println(linea);
        System.out.println("       Laboratorio 1");
        System.out.println(linea);
        System.out.println("");
        
        do{
            System.out.println(linea);
            System.out.println("Seleccione El Ejercicio a Ejecutar:");
            System.out.println(linea);
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("21 - Bonus 1.");
            System.out.println("22 - Bonus 2.");
            System.out.println("23 - Bonus 3.");
            System.out.println("24 - Bonus 4.");
            System.out.println("25 - Bonus 5.");
            System.out.println("99 - Salir.");
            System.out.println("");
            System.out.print("Ingrese Opción:");
            if(teclado.hasNextInt()){
                   opcion = teclado.nextInt();
                   menu(opcion);
            }else{
                teclado.nextLine();
                System.out.println("Ingrese un valor Valido");
            }     
        }while(opcion != 99);                
    }
    
    public static void menu(int opcion){
        switch (opcion){
            case 1:
                Ejercicio1.main();
                break;
            case 2:
                Ejercicio2.main();
                break;
            case 3:
                Ejercicio3.main();
                break;
            case 21:
                Bonus.Bonus1();
                break;
            case 22:
                Bonus.Bonus2();
                break;
            case 23:
                Bonus.Bonus3();
                break;
            case 24:
                Bonus.Bonus4();
                break;
             case 25:
                Bonus.Bonus5();
                break;
            default:
                System.out.println("Opción inválida.");
        }   
    }
}
