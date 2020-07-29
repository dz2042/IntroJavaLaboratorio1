
package laboratorioclase1;

public class Bonus {
    public static void Bonus1 (){
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 1");
        System.out.println(linea);
        int n1 = 5;
        int n2 = 10;
        int n3 = 20;
        
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n1 + n2 = " + (n1 + n2));
        System.out.println("n1 * n3 = " + (n1 * n3));
        System.out.println("n1 / n2 = " + (n3 / n2));
    }
    public static void Bonus2 (){
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 2");
        System.out.println(linea);
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        double promedio = 0;
        int total = 0; 
        int resto = 0; 
        total = n1 + n2 + n3;
        promedio = total /3;
        resto = n2 / n1;
        System.out.println("Total = " + total);
        System.out.println("Promedio = " + promedio);
        System.out.println("Resto = " + resto);
    }
    public static void Bonus3 (){
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 3");
        System.out.println(linea);
        boolean n1 = true;
        boolean n2 = false;
        boolean n3 = true;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        
        System.out.println("n1 ^ n2 = " +  (n1 ^ n2));
        System.out.println("(n1 & !n2) | n3 = " + ((n1 & !n2) | n3));
        System.out.println("(n1 | n2) & !n3 = " + ((n1 | n2) & !n3));
    }
    public static void Bonus4 (){
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 4");
        System.out.println(linea);
        int n1 = 5;
        int n2 = 10;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        
        System.out.println("n1 es igual a " + n1 + ",n2 es igual a " + n2 + " y n1 más n2 es igual a " + (n1 + n2));
    }
    public static void Bonus5 (){
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 5");
        System.out.println(linea);
        double remera = 59.90, pantalon = 99.90, campera = 149.90;
        final double iva = 0.21;
        
        System.out.println("Remera = $" + remera + " - Iva: $" + (remera * iva) + " - Total: $" + (remera + (remera * iva)));
        System.out.println("Pantalón = $" + pantalon + " - Iva: $" + (pantalon * iva) + " - Total: $" + (pantalon + (pantalon * iva)));
        System.out.println("Campera = $" + campera + " - Iva: $" + (campera * iva) + " - Total: $" + (campera + (campera * iva)));
        
        
    }
}
