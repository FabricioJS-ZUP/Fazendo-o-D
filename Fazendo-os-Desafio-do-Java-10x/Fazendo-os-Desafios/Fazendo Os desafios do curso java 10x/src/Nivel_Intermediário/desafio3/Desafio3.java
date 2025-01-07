package Nivel_Intermediário.desafio3;

public class Desafio3 {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 15;
        sasuke.missao = "Lutar contra o Haku";
        sasuke.nivelDificuldade = 'D';
        sasuke.statusMissao = "Concluida";
        sasuke.mostrarInformacoes();
        System.out.println("------------------------------------------------");
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 14;
        naruto.missao = "Criar clones";
        naruto.nivelDificuldade = 'E';
        naruto.statusMissao = "Concluida";
        naruto.mostrarInformacoes();
        System.out.println("------------------------------------------------");
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 15;
        sakura.missao = "Aprender a curar";
        sakura.nivelDificuldade = 'C';
        sakura.statusMissao = "Concluida";
        sakura.mostrarInformacoes();
    }
}
