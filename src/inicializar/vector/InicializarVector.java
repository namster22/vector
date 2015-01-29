/*
 * METODO PARA CREAR UN VECTOR Y TRABAJAR CON EL SOBRE METODOS.
 * Jueves 22 de enero del 2015
 */
package inicializar.vector;

import java.util.Scanner;

/**
 *
 * @author Emilio Silvestre Sanchez
 */
public class InicializarVector {

    public static void inicializa(int vector[]) {
        Scanner introducir = new Scanner(System.in);

        for (int x = 0; x < vector.length; x++) {
            System.out.println("Introduce el " + x + " valor");
            vector[x] = introducir.nextInt();
        }

    }

    public static void imprimir(int vector[]) {

        for (int x = 0; x < vector.length; x++) {
            System.out.print(vector[x] + ", ");
        }
        System.out.println(" ");
    }

    public static int maximo(int v[]) {
        int maximo = 0;
        for (int x = 0; x < v.length; x++) {
            if (maximo < v[x]) {
                maximo = v[x];

            }

        }
        return maximo;

    }

    public static int minimo(int v[]) {
        int minimo;
        minimo = v[0];
        for (int x = 0; x < v.length; x++) {
            if (minimo > v[x]) {
                minimo = v[x];

            }

        }
        return minimo;

    }

    public static double media(int v[]) {
        int suma = 0;
        double media;

        for (int x = 0; x < v.length; x++) {
            suma = suma + v[x];

        }
        media = suma / v.length;
        return media;

    }

    public static boolean igual(int v[]) {

        boolean zas = false;

        int[] igual1 = new int[v.length];
        inicializa(igual1);
        for (int j = 0; j < v.length; j++) {
            for (int x = 1; x < v.length; x++) {
                if (v[j] == igual1[x]) {
                    zas = true;
                    break;

                }

            }
        }
        if (zas == true) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean palindromo(int v[]) {
        int j, mitad, i = 0;
        j = v.length - 1;
        mitad = v.length / 2;
        for (i = 0; i < mitad; i++) {
            if (v[i] != v[j]) {
                break;
            }
            j--;
        }

        if (i == mitad) {
            return true;
        } else {
            return false;
        }

    }

    public static void ordenar(int v[]) {
        int aux = 0, i = 0, j = 0;
        for (i = 1; i < v.length; i++) {
            aux = v[i];
            j = i - 1;

            // System.out.print("  "+v[i]+""); 
            while ((j >= 0) && (aux < v[j])) {
                v[j + 1] = v[j];
                --j;
                //  System.out.print("  "+v[i]+" ");
            }
            v[j + 1] = aux;

        }

        System.out.println("Los numero introduccidos son");
        for (int x = 0; x < v.length; x++) {
            System.out.print("  " + v[x] + ", ");

        }
        System.out.println("");

    }

    public static void copiar(int copiav[], int vector[]) {
        int x;
        for (x = 0; x < vector.length; x++) {
            copiav[x] = vector[x];
        }

    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        int v, max, min, c = 0;
        double med;
        boolean igu, pal;
        String espera;

        System.out.println("Introduce la longitud del vector: ");
        v = introducir.nextInt();
        int vector[] = new int[v];
        int copiav[] = new int[v];

        System.out.println("");
        System.out.println("");
        ///MENU

        while (c != 11) {
            do {
                System.out.println("Bienvenido al menu, elije una opcion");
                System.out.println("Intoducie 1 para inicializar");
                System.out.println("Intoducie 2 para copiar");
                System.out.println("Intoducie 3 para saber cual es el minimo");
                System.out.println("Intoducie 4 para saber cual es maximo");
                System.out.println("Intoducie 5 para saber la media");
                System.out.println("Intoducie 6 para saber si son palindromos");
                System.out.println("Introduce 7 para ordenar");
                System.out.println("Introduce 8 para imprimir");
                System.out.println("Indroduce 9 para igualar");
                System.out.println("Indroduce 10 para salir");

                c = introducir.nextInt();
            } while (c < 0 || c > 10);

            ///ESPACIADO PARA MOSTRAR EL RESULTADO
            System.out.println("");
            System.out.println("");
            System.out.println("");
            switch (c) {

                case 1://METODO PARA INICIALIZAR
                    inicializa(vector);
                    break;

                case 2:///METODO PARA COPIAR
                    copiar(copiav, vector);
                    break;

                case 3://METODO PARA SABER EL MINIMO
                    System.out.println("De los numeros siguientes");
                    imprimir(vector);
                    min = minimo(vector);
                    System.out.println("El minimo es: " + min);
                    break;

                case 4:///METODO PARA SABER EL MAXIMO
                    System.out.println("De los numeros siguientes");
                    imprimir(vector);
                    max = maximo(vector);
                    System.out.println("El maximo es: " + max);
                    break;

                case 5:///METODO PARA SABER LA MEDIA
                    System.out.println("De los numeros siguientes");
                    imprimir(vector);
                    med = media(vector);
                    System.out.println("La media es: " + med);
                    break;

                case 6:///METODO PARA SABER SI EL NUMERO ES PALINDROMO
                    pal = palindromo(vector);
                    if (pal == true) {
                        System.out.println("El vector es palindoromo");
                    } else {
                        System.out.println("El vector no es palindormo");
                    }
                    break;

                case 7:///METODO PARA ORDENAR
                    System.out.println("Ordenado seria: ");
                    ordenar(vector);
                    break;

                case 8:///METODO PARA IMPRIMIR LOS VALORES DEL ARRAY
                    System.out.println("Los numeros del array son: ");
                    imprimir(vector);
                    break;

                case 9:///METODO PARA CREAR OTRO ARRAY Y DECIR SI SON IGUALES
                    igu = igual(vector);
                    if (igu == true) {
                        System.out.println("Hay alguno o son iguales");
                    } else {
                        System.out.println("No son iguales");
                    }

                    break;

                case 10:/// CREAMOS UNA VARIABLE PARA SALIR
                    c = 11;
                    break;
            }
            System.out.println("");
            System.out.println("Introduce cualquier caracter para continuar");
            espera = introducir.next();

        }
System.out.println("Hola emiliet");
    }
}
