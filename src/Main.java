import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int iterador = 0;

        System.out.println("¡Bienvenido a la calculadora ATL!");
        while(iterador == 0){
            Scanner scanner = new Scanner(System.in);
            mostrarTextoBienvenida();
            String opciones = scanner.nextLine();
            while (!opciones.equals("1") && !opciones.equals("2") && !opciones.equals("3")
                    && !opciones.equals("4") && !opciones.equals("5") && !opciones.equals("0") ){
                System.out.println("HAS ELEGIDO UNA OPCION INCORRECTA");
                mostrarTextoBienvenida();
                opciones = scanner.nextLine();
            }

            if(opciones.equals("1")){
                System.out.println("Ingrese la edad de su perro");
                int edad = scanner.nextInt();
                System.out.println("La edad de su perro es " + calcularEdadPerros(edad) + " años");
                iterador = volverAIniciar();

            } else if (opciones.equals("2")) {
                System.out.println("Ingrese la cantidad de millas a convertir");
                int millas = scanner.nextInt();
                System.out.println(millas + " serian " + convertirMillasAKilometros(millas) + " kilometros");
                iterador = volverAIniciar();

            } else if (opciones.equals("3")) {
                System.out.println("Ingrese el precio");
                int precio = scanner.nextInt();
                System.out.println("Ingrese el porcentaje de descuento");
                int descuento = scanner.nextInt();
                System.out.println("El precio final con descuento seria " + calcularDescuento(precio,descuento));
                iterador = volverAIniciar();

            } else if (opciones.equals("4")) {
                System.out.println("Ingrese el monto de la cuenta");
                int montoCuenta = scanner.nextInt();
                System.out.println("Ingrese el porcentaje de propina que desea dejar");
                int propina = scanner.nextInt();
                System.out.println("La propina que deberia dejar es de " + calcularPropina(montoCuenta, propina));
                iterador = volverAIniciar();

            } else if (opciones.equals("5")) {
                System.out.println("Ingrese un número del 1 al 100 para adivinar el número secreto");
                int numero = scanner.nextInt();
                while(numero < 0 || numero > 100){
                    System.out.println("El numero debe estar entre 1 y 100");
                    System.out.println("Ingrese un número del 1 al 100 para adivinar el número secreto");
                    numero = scanner.nextInt();
                }

                adivinarNumero(numero);
                iterador = volverAIniciar();
            } else if (opciones.equals("0")) {
                System.out.println("GRACIAS POR UTILIZAR LA CALCULADORA ATL");
                return;
            }
        }



        System.out.println("GRACIAS POR UTILIZAR LA CALCULADORA ATL");
    }


    public static int calcularEdadPerros(int edad){
        return edad * 7;
    }

    public static double convertirMillasAKilometros(int millas){
        return millas * 1.60934;
    }

    public static int calcularDescuento(int precio, int descuento){
        return precio - (precio * descuento / 100);
    }

    public static double calcularPropina(int precio, int porcentajeDescuento){
        return (precio * porcentajeDescuento) / 100;
    }

    public static String adivinarNumero(int numero){
        double numeroAleatorio =Math.random() * 100;
        if(numero == (int)numeroAleatorio){
            return "Acertaste, el número era " + (int)numeroAleatorio;
        }else{
            return "Has fallado, el número era " + (int)numeroAleatorio;
        }
    }

    public static void mostrarTextoBienvenida(){
        System.out.println("Por favor ingrese una de las opciones");
        System.out.println("1- Calcular edad de perros");
        System.out.println("2- Convertir millas a kilometros");
        System.out.println("3- Calcular descuento");
        System.out.println("4- Calcular propina");
        System.out.println("5- Adivinar número");
        System.out.println("0- Salir");
    }

    public static int volverAIniciar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea realizar alguna otra operacion? 1(si)  /  2(no)");
        String opcion = scanner.nextLine();
        while (!opcion.equals("1") && !opcion.equals("2")) {
            System.out.println("Has ingresado una opcion no válida");
            System.out.println("Desea realizar alguna otra operacion? 1(si)  /  2(no)");
            opcion = scanner.nextLine();
        }
        if (opcion.equals("2")){
            return 1;
        }else {
            return 0;
        }
    }
}