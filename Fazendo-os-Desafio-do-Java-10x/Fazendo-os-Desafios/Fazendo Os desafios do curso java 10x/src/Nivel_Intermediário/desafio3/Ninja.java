package Nivel_Intermediário.desafio3;

public class Ninja {
    String nome;
     int idade;
     String missao;
     char nivelDificuldade;
     String statusMissao;

    // Metodo
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tenho: " + idade + "anos.");
        System.out.println("Missao: " + missao);
        System.out.println("Dificuldade nível: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
    }
}