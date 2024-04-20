package entities;

public class JogodaVelha {

    public static String[][] matriz = new String[3][3];

    public static void PreencherMatriz() {
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.toString(valor);
                valor++;
            }

        }
    }

    public static void MostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void SubstituirPosicao(Jogador player, String posicao) {
        switch (posicao) {
            case "1":
                matriz[0][0] = player.vez;
                break;
            case "2":
                matriz[0][1] = player.vez;
                break;
            case "3":
                matriz[0][2] = player.vez;
                break;
            case "4":
                matriz[1][0] = player.vez;
                break;
            case "5":
                matriz[1][1] = player.vez;
                break;
            case "6":
                matriz[1][2] = player.vez;
                break;
            case "7":
                matriz[2][0] = player.vez;
                break;
            case "8":
                matriz[2][1] = player.vez;
                break;
            case "9":
                matriz[2][2] = player.vez;
                break;
            default:
                System.out.println("Posicao invalida!");
        }
    }

    public static boolean VerificarVencedor() {


        if (matriz[0][0].equals(matriz[0][1]) && matriz[0][0].equals(matriz[0][2])) {
            return true;
        }
        if (matriz[0][0].equals(matriz[1][1]) && matriz[0][0].equals(matriz[2][2])) {
            return true;
        }
        if (matriz[0][0].equals(matriz[1][0]) && matriz[0][0].equals(matriz[2][0])) {
            return true;
        }
        if (matriz[0][2].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0])) {
            return true;
        }
        if (matriz[0][2].equals(matriz[1][2]) && matriz[0][2].equals(matriz[2][2])) {
            return true;
        }
        if (matriz[2][0].equals(matriz[2][1]) && matriz[2][0].equals(matriz[2][2])) {
            return true;
        }
        if (matriz[1][0].equals(matriz[1][1]) && matriz[1][0].equals(matriz[1][2])) {
            return true;
        }

        return false;
    }

    //calcula a melhor jogada para o computador
    public static int melhorJogada(int posicao_computador) {
        if ((matriz[0][0].equals(matriz[0][1])) || matriz[0][1].equals(matriz[0][2])) {
            if (matriz[0][2].equals("3")) {
                return 3;
            } else if (matriz[0][0].equals("1")) {
                return 1;
            } else if (matriz[0][1].equals("2")) {
                return 2;
            }


        }
        if ((matriz[0][0].equals(matriz[1][1])) || matriz[1][1].equals(matriz[2][2])) {
            if (matriz[0][0].equals("1")) {
                return 1;
            } else if (matriz[1][1].equals("5")) {
                return 5;
            } else if (matriz[2][2].equals("9")) {
                return 9;
            }

        }
        if ((matriz[0][0].equals(matriz[1][0])) || matriz[1][0].equals(matriz[2][0])){
            if (matriz[0][0].equals("1")) {
                return 1;
            } else if (matriz[1][0].equals("4")) {
                return 5;
            } else if (matriz[2][0].equals("7")) {
                return 7;
            }

        }
        if ((matriz[0][2].equals(matriz[1][1])) || matriz[1][1].equals(matriz[2][0])) {
            if (matriz[0][2].equals("3")) {
                return 3;
            } else if (matriz[1][0].equals("5")) {
                return 5;
            } else if (matriz[2][0].equals("7")) {
                return 7;
            }

        }
        if ((matriz[0][2].equals(matriz[1][2])) || matriz[1][2].equals(matriz[2][2])) {
            if (matriz[0][2].equals("3")) {
                return 3;
            } else if (matriz[1][2].equals("6")) {
                return 6;
            } else if (matriz[2][2].equals("9")) {
                return 9;
            }

        }
        if ((matriz[0][1].equals(matriz[1][1])) || matriz[1][1].equals(matriz[2][1])) {
            if (matriz[0][1].equals("2")) {
                return 2;
            } else if (matriz[1][1].equals("5")) {
                return 5;
            } else if (matriz[2][1].equals("8")) {
                return 8;
            }

        }
        if ((matriz[0][1].equals(matriz[1][1])) || matriz[1][1].equals(matriz[2][1])) {
            if (matriz[0][1].equals("2")) {
                return 2;
            } else if (matriz[1][1].equals("5")) {
                return 5;
            } else if (matriz[2][1].equals("8")) {
                return 8;
            }

        }
        if ((matriz[1][0].equals(matriz[1][1])) || matriz[1][1].equals(matriz[1][2])) {
            if (matriz[1][0].equals("4")) {
                return 4;
            } else if (matriz[1][1].equals("5")) {
                return 5;
            } else if (matriz[1][2].equals("6")) {
                return 6;
            }

        }
        if ((matriz[2][0].equals(matriz[2][1])) || matriz[2][1].equals(matriz[2][2])) {
            if (matriz[2][0].equals("7")) {
                return 7;
            } else if (matriz[2][1].equals("8")) {
                return 8;
            } else if (matriz[2][2].equals("9")) {
                return 9;
            }

        }
        return posicao_computador;
    }
}
