public class MinhaClasse {

    public static void main (String [] args) {

        /*Exemplos de nomenclaturas corretas */ /*simbolos permitidos: _ , $ */
        int n21 = 21;
        int $N21 = 21;
        int numero_21 = 21;
        int numeroVinteUm = 21; /*camelCase*/
        int NUMEROVINTEUM = 21; /*UPPERCASE para variaveis que nunca mudarao seus valores*/

        /*Exemplos de nomenclaturas incorretas */

        int 21N = 21; /* comecando com numeros ao inves de letras ou simbolos permitidos */
        int n%^&* = 21; /*simbolos nao permitidos */
        int long = 21; /*utilizando palavras-chave que pertencem a linguagem */
        int numero vinteeum = 21; /* utilizando espacos dentro da variavel */
        int numeroVinteUm = 21; /*o nome precisa ser unico, nesse caso repete com o exemplo de nomenclatura correta */
    }

}
