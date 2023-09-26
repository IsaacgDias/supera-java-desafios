package terceiro_desafio;

public class Main {
    public static void main(String[] args) {
        // valor de entrada
        int k = 2;

        int n = 5;

        int contador = 0;

        //tamanho do array
        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 2;

        for(int i = 0; i < n; i++) {
            for(int z = i; z < n; z++) {
                if(Math.abs(arr[i] - arr[z]) == k) {
                    
                    contador++;
                }
            }
        }
        System.out.println(contador);
    }
}
