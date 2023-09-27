package quarto_desafio;

public class Main {
    public static void main(String[] args) {
        String[] frases = {
                "I ENIL SIHTHSIREBBIG S",
                "LEVELKAYAK",
                "H YPPAHSYADILO",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE"
        };
        for (String frase : frases) {
            String resultado = Desembaralhar.desembaralharFrase(frase);
            System.out.println(resultado);
        }
    }
}

