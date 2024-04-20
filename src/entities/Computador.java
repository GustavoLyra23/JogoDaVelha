package entities;

import java.util.Random;

public class Computador {
    public String posicao_computador;

    public static int gerarInteiroAleatorio(int limiteInferior, int limiteSuperior) {
        return new Random().nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }
    }

