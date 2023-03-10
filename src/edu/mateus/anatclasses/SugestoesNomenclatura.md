###JAVA BEANS 
    
a linguagem Java sugere convencoes para a escrita de nossas classes, atributos variaveis, metodos e pacotes.

##VARIAVEIS

#exemplos nao recomendados

    double salMedio = 1500.23; // abreviado //
    String emails = "aluno@escola.com"; // plural //
    String myName = "JOSEPH"; // mistura de idiomas //

#exemplos recomendados

    double salarioMedio = 1500.23; // sem abreviacao //
    String email = "aluno@escola.com"; // singular //
    String [] emails = {"aluno@escola.com","professor@ escola.com"}; // ARRAY com diversos "itens" ( [] = ARRAY ) //
    String meuNome = "JOSEPH"; // seguindo o mesmo idioma em todo codigo //

##METODOS

#exemplos de metodos

    somar(int n1, int n2){}
    abrirConexao(){}
    concluirProcessamento(){}
    findById(int id){}
    calcularImprimir(){} // este contém um erro, ele deveria conter apenas 1 finalidade //.
