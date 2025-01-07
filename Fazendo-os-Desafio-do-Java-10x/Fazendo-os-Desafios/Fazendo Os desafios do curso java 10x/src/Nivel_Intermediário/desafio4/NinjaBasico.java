package Nivel_Intermediário.desafio4;

public class NinjaBasico implements Ninja {
   String nome;
   String habilidade;
    int idade;

   //Criando um ALLArgs Constructor
public NinjaBasico(String nome, int idade, String habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
}
   @Override
   public void mostrarInformacoes(){
      System.out.println("Nome: " + nome );
      System.out.println("Tenho: " + idade +" anos ");
      System.out.println("Minha habilidade é: " + habilidade );
   }
//Mesmo não usando este método para ninjabasico precisa por, pois se não, não funcionará ( já que precisa por todos os métodos da interface)
   @Override
   public void executarHabilidade() {
   }
}