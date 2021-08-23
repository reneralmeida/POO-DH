package UsuarioJogo;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 1;
    }

    public String aumentarPontuacao() {
        this.pontuacao = pontuacao + 1;
        return "Sua pontuação é: " + this.pontuacao;
    }

    public String subirNivel() {
        this.nivel = nivel + 1;
        return "Seu nível é: " + this.nivel;
    }

    public String bonus(int valor) {
        this.pontuacao = pontuacao + valor;
        return "Seu bonus pontuado é: " + this.pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getSubirNivel() {
        return "Sua nível é: " + this.nivel;
    }

    public String getNome() {
        return this.nome;
    }
}
