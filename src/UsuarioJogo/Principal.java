package UsuarioJogo;

public class Principal {
    public static void main(String[] args) {
        UsuarioJogo user = new UsuarioJogo("José", "Pinguin");
        user.aumentarPontuacao();
        System.out.println(user.getNome() + " " + user.getPontuacao());
        System.out.println(user.bonus(2));
        user.subirNivel();
        System.out.println(user.getNome() + " " + user.getSubirNivel());

        UsuarioJogo user1 = new UsuarioJogo("Joelmir", "Robin");
        user1.aumentarPontuacao();
        user1.aumentarPontuacao();
        System.out.println(user1.getNome() + " " + user1.getPontuacao());
        System.out.println(user1.bonus(2));
        user1.subirNivel();
        user1.subirNivel();
        System.out.println(user1.getNome() + " " + user1.getSubirNivel());
    }
}
