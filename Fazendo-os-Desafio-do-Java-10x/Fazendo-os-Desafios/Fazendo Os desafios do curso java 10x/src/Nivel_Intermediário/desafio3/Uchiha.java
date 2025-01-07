package Nivel_Intermediário.desafio3;

public class Uchiha extends Ninja {
     String habilidadeCla = "Ativando Sharingan";

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade do cla: " + habilidadeCla);
    }

//Sobrepondo o método do ninja porem acrescentando habilidadeCla

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tenho: " + idade + "anos.");
        System.out.println("Missao: " + missao);
        System.out.println("Dificuldade nível: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
       mostrarHabilidadeEspecial();
    }

}