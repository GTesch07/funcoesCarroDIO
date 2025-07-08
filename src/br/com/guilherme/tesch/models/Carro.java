package br.com.guilherme.tesch.models;

public class Carro {

    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;

    public void ligarCarro() {
        if (ligado == false) {
            ligado = true;
            System.out.println("Ligando o carro");
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    public void desligarCarro() {
        if (ligado == true) {
            if (marcha == 0 && velocidade == 0) {
                ligado = false;
                System.out.println("Desligando o carro");
            } else {
                System.out.println("O carro não pode ser desligado");
            }
        }
    }

    public void acelerar() {
        if (ligado == true && marcha != 0) {
            if (velocidade < 120) {
                switch (marcha) {
                    case 1 -> {
                        if (velocidade < 20) {
                            velocidade++;
                        } else {
                            System.out.println("Velocidade máxima da 1ª marcha atingida.");
                        }

                    }
                    case 2 -> {
                        if (velocidade >= 21 && velocidade < 40) {
                            velocidade++;
                        } else {
                            System.out.println("Velocidade máxima da 2ª marcha atingida.");
                        }

                    }
                    case 3 -> {
                        if (velocidade >= 41 && velocidade < 60) {
                            velocidade++;
                        } else {
                            System.out.println("Velocidade máxima da 3ª marcha atingida.");
                        }

                    }
                    case 4 -> {
                        if (velocidade >= 61 && velocidade < 80) {
                            velocidade++;
                        } else {
                            System.out.println("Velocidade máxima da a 4ª marcha atingida.");
                        }

                    }
                    case 5 -> {
                        if (velocidade >= 81 && velocidade < 100) {
                            velocidade++;
                        } else {
                            System.out.println("Velocidade máxima da 5ª marcha atingida.");
                        }

                    }
                    case 6 -> {
                        if (velocidade >= 101 && velocidade < 120) {
                            velocidade++;
                        } else {
                            System.out.println("Velocidade máxima da 6ª marcha atingida.");
                        }
                    }
                }
            } else {
                System.out.println("Velocidade máxima do carro atingida");
            }
        }
    }

    public void diminuirVelocidade() {
        if (ligado == true && velocidade != 0) {
            velocidade--;
            System.out.println("Diminuindo a velocidade do carro");

        }
    }

    public void aumentarMarcha() {
        if (ligado) {
            if (marcha < 6) {
                marcha++;
                System.out.println("Aumentando para a " + marcha + "ª marcha");

            } else {
                System.out.println("Você já está na última marcha.");
            }
        }

    }

    public void diminuirMarcha() {
        if (ligado == true) {
            if (marcha > 0) {
                marcha--;
                System.out.println("Diminuindo para a " + marcha + "ª marcha");
            } else {
                System.out.println("Você já está na primeira marcha.");
            }
        }
    }

    public void virarDireita() {
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a direita");
            return;
        } else {
            System.out.println("Não é possível virar para a direita");
        }
    }

    public void virarEsquerda() {
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a esquerda");
            return;
        } else {
            System.out.println("Não é possível virar para a esquerda");
        }
    }

    public void verificarVelocidade() {
        System.out.println("A velocidade do carro é de: " + velocidade + " Km/h");
    }

}
