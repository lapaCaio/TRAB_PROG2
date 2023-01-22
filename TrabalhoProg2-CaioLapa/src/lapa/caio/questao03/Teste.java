package lapa.caio.questao03;

public class Teste {
    public static void main(String[] args) {
        Login l = new Login("Caio", "C@1op3rLP");

        //Senha incorreta
        l.fazerLogin("Caio", "12345");

        //Usuário incorreto
        l.fazerLogin("Pedro", "C@1op3rLP");
    }
}
