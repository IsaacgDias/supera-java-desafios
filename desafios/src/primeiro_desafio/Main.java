package primeiro_desafio;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Array com todos os números de entrada
       int[] numeros = {10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98};

       // Arrays para números ímpares e pares
       int[] numerosPares = new int[numeros.length];
       int[] numerosImpares = new int[numeros.length];

       int contadorPares = 0;
       int contadorImpares = 0;

        //Verificar quais números são pares do array
        for (int p = 1; p < numeros.length; p++) {

            if (numeros[p] % 2 == 0) {
                numerosPares[contadorPares] = numeros[p];
                contadorPares++;

            }
        }
        // Novo array para conter apenas números válidos
        numerosPares = Arrays.copyOf(numerosPares, contadorPares);

        Arrays.sort(numerosPares);

        for (int numeroP : numerosPares) {
            System.out.println(numeroP);
        }


        //Verificar quais números são ímpares do array
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i] % 2 == 1) {
                numerosImpares[contadorImpares] = numeros[i];
                contadorImpares++;
            }

        }
        // Novo array para conter apenas números ímpares válidos
        numerosImpares = Arrays.copyOf(numerosImpares, contadorImpares);

        // Ordenar números ímpares em ordem decrescente
        Arrays.sort(numerosImpares);

        // Inverter o array de números ímpares
        int[] numerosImparesDecrescente = new int[numerosImpares.length];
        for (int i = 0; i < numerosImpares.length; i++) {
            numerosImparesDecrescente[i] = numerosImpares[numerosImpares.length - 1 - i];
        }

        for (int numeroI : numerosImparesDecrescente) {
            System.out.println(numeroI);
        }
    }
}
