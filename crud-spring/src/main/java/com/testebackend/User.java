package com.testebackend;

/*      Modificadores de acesso em Java
 *
 *  public - Acessível em qualquer lugar
 *  default - Acessível apenas dentro do mesmo package, é a ausência do modificador
 *  private - Acessível apenas dentro da classe
 *  protected - Acessível apenas dentro do mesmo package ou por subclasses (classes que herdam da classe que declara o membro protected)
*/

/*      Classe abstract em Java
 * Uma classe abstract não pode ser instanciada, ou seja, não pode ser criada um objeto dela. 
 * Ela é utilizada para criar classes que serão herdadas por outras classes.
*/

public class User implements People {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cidade;

    public User(String nome, String sobrenome, int idade, String cidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cidade = cidade;
    }

    @Override
    public void information(String nome, String sobrenome, int idade, String cidade) {
        System.out.println("Nome: " + nome + " " + sobrenome + ", Idade: " + idade + ", Cidade: " + cidade);
    }
}
