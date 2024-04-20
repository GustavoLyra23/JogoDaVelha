import entities.Jogador;
import entities.JogodaVelha;
import entities.Computador;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String result = null;
        int contador = 1;
        int jogada = 0;
        String posicao;
        List<String> posicao_jogada = new ArrayList<>();
        Jogador player = new Jogador();
        JogodaVelha.PreencherMatriz();
        Computador computer = new Computador();
        //-------------------------------------------------------------
        do {
            JogodaVelha.MostrarMatriz();
            System.out.println();
            if (contador % 2 == 1) {
                player.vez = "X";
                do {
                    System.out.println("Vai jogar " + player.vez + " aonde?");
                    posicao = sc.nextLine();
                    ;
                    String finalPosicao = posicao;
                    result = posicao_jogada.stream().filter(obj -> Objects.equals(obj, finalPosicao)).findFirst().orElse(null);
                } while (result != null);
                posicao_jogada.add(posicao);
                JogodaVelha.SubstituirPosicao(player, posicao);
                JogodaVelha.VerificarVencedor();

                jogada++;
                contador++;

            } else {
                player.vez = "O";
                System.out.println("Vez do jogador " + player.vez);
                do {
                    computer.posicao_computador = String.valueOf(Computador.gerarInteiroAleatorio(1, 9));
                    String finalPosicao1 = computer.posicao_computador;
                    result = posicao_jogada.stream().filter(obj -> Objects.equals(obj, finalPosicao1)).findFirst().orElse(null);
                } while (result != null);
                computer.posicao_computador = String.valueOf(JogodaVelha.melhorJogada(Integer.parseInt(computer.posicao_computador)));
                posicao_jogada.add(computer.posicao_computador);
                JogodaVelha.SubstituirPosicao(player, computer.posicao_computador);
                JogodaVelha.VerificarVencedor();
                jogada++;
                contador++;
            }


        } while (jogada < 9 && !JogodaVelha.VerificarVencedor());
        JogodaVelha.MostrarMatriz();

        if (JogodaVelha.VerificarVencedor()) {
            System.out.print(player.vez + " Ganhou");
        } else if (jogada >= 9) {
            System.out.println("Velha");
        }
    }
}