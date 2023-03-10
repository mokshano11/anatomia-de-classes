package edu.mateus.anatclasses;

public class MinhaClasse {

    public static void main (String [] args) {  /* metodo "main" */

        String primeiroNome = "Mateus"; /*variavel 1 */
        String segundoNome = "Gruber"; /*variavel 2 */

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome); /*variavel chamando um metodo */

        System.out.print (nomeCompleto); /*saida do programa */
     }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {   /* metodo */
        return "Resultado Do Metodo " + primeiroNome.concat(" ").concat(segundoNome);  /*o que o metodo esta retornando */
    }

}
