
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150, venta;
        float salarioMensual, ventaCarro, porcVenta, totalPrecio;

        System.out.println("digite la cantidad de carros vendidos: ");//5
        venta = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el precio de un carro: ");//100
        ventaCarro = Float.parseFloat(entrada.nextLine());

        comision *= venta;
        totalPrecio = ventaCarro * venta;
        porcVenta = totalPrecio * 0.05F;
        salarioMensual = salario + comision + porcVenta;

        System.out.println("\nEl salario mensual es: = " + salarioMensual); //1775

    }

}
