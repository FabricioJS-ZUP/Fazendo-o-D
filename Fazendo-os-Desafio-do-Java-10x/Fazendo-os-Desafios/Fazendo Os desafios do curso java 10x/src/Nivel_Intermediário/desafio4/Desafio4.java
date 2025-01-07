package Nivel_Intermediário.desafio4;
public class Desafio4 {
    public static void main(String[] args) {
        NinjaBasico boruto = new NinjaBasico("Boruto",14,"Razengam");
        boruto.mostrarInformacoes();
        System.out.println("---------------------------");
        NinjaAvancado naruto = new NinjaAvancado();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 30;
        naruto.habilidade = "Razenshurikn";
        naruto.especialidade ="Ninjutsu";
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();
        System.out.println("---------------");
    }
}
