package segundo_desafio;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double num = 576.73;

        //Array de notas e moedas
        double[] notas_moedas = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};

        // Armazena a quantidade de notas e moedas
        double[] quantidade_notas_moedas = new double[notas_moedas.length];


        for(int i = 0; i < notas_moedas.length; i++) {
            while (num >= notas_moedas[i]) {

                    quantidade_notas_moedas[i]++;

                    // Atualizar o valor para descobrir quantas notas ou moedas
                    num = num - notas_moedas[i];
            }
        }

        // Formatar com ponto
        Locale.setDefault(Locale.US);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');

        // Formatar numeros para decimal
        DecimalFormat decimal = new DecimalFormat("0.00");



        System.out.println("Notas: ");
        for (int i = 0; i < notas_moedas.length; i++) {
            if(notas_moedas[i] >= 2) {
                System.out.println(quantidade_notas_moedas[i] + " nota(s) de R$ " + decimal.format(notas_moedas[i]));
            }
        }

        System.out.println("Moedas: ");
        for (int i = 0; i < notas_moedas.length; i++) {
            if(notas_moedas[i] < 2) {
                System.out.println(quantidade_notas_moedas[i] + " moeda(s) de R$ " + decimal.format(notas_moedas[i]));
            }
        }

    }
}
