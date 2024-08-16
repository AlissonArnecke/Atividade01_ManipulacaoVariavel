public class Main {
    public static void main(String[] args) {

        //Declarar Variáveis
        String nome = "Alisson";
        int idade = 18;
        boolean estudante = true;
        double altura = 1.87;

        //Operações
        int somaIdades = idade + 25;
        double somaAlturas = altura * 2;
        String saudacao = "Olá, " + nome + "!";


        //Exibição de Resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        if (estudante) {
            System.out.println("É estudante? Sim!" );

        }
        else {
            System.out.println("É estudante? Não!");
        }
        //System.out.println("É estudante? " + (estudante ? "Sim" : "Não") ); // ternário
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura dobrada: " + somaAlturas);
        System.out.println(saudacao);

    };

}


