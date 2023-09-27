package quarto_desafio;

public class Desembaralhar {
    // Função para desembaralhar uma frase
    public static String desembaralharFrase(String frase) {
        int minhaFrase = frase.length();

        // Dividir a frase ao meio
        int metade = minhaFrase / 2;

        // Iniciar com strings vazias para as metades esquerda e direita
        StringBuilder metadeEsquerda = new StringBuilder();
        StringBuilder metadeDireita = new StringBuilder();

        // Metade esquerda da frase
        for (int i = metade - 1; i >= 0; i--) {
            metadeEsquerda.append(frase.charAt(i));
        }

        // Metade direita da frase
        for (int i = minhaFrase - 1; i >= metade; i--) {
            metadeDireita.append(frase.charAt(i));
        }

        // Formar a frase original
        return metadeEsquerda.toString() + metadeDireita.toString();
    }
}