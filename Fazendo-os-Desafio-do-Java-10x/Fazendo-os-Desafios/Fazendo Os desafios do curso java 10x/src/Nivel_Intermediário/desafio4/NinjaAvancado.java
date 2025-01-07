package Nivel_Intermediário.desafio4;

public class NinjaAvancado implements Ninja{
    String nome;
    String habilidade;
    int idade;
    String especialidade;

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome );
        System.out.println("Nome: " + idade );
        System.out.println("Minha habilidade é: " + habilidade );
    }
    @Override
    public void executarHabilidade(){
        System.out.println("Minha especialidade é: " + especialidade );
    }
}
