package org;

import java.util.Scanner;

public class userInteraction {

    private Scanner scanner;

    public userInteraction(){
        this.scanner = new Scanner(System.in);
    }
    
    public void iniciar(){
        while(true) {
            System.out.println("Programa iniciado");
            System.out.println("Digite 1 para começar");
            System.out.println("Digite 2 para encerrar");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine(); // Consumir a linha pendente
                    System.out.println("Nome do titular da conta");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o número da sua conta");
                    int numero = scanner.nextInt();
                    System.out.println("O número da sua agência");
                    int agencia = scanner.nextInt();
                    System.out.println("Digite seu saldo inicial");
                    float saldo = scanner.nextFloat();
                    scanner.nextLine(); // Consumir a linha pendente

                    while (saldo <= 0){
                        System.out.println("Digite um valor válido");
                        saldo = scanner.nextFloat();
                        scanner.nextLine(); // Consumir a linha pendente
                    }
                    
                    BancoTerminal banco = new BancoTerminal(numero, agencia, nome, saldo);
                    
                    System.out.println("Ola " + banco.getNomeConta() + ", obrigado por criar sua conta em nosso banco. Sua agência é "
                        + banco.getAgencia() + ", conta: " + banco.getNumero() + " e seu saldo R$" + banco.getSaldo() + " está disponível para saque.");
                     
                    System.out.println("Deseja abrir uma nova conta?\n");
                    System.out.println("1 - Sim, 2 - Não");
                    
                    escolha = scanner.nextInt();
                    if (escolha != 1) {
                        System.out.println("Saindo...");
                        return;
                    }
                    break;

                case 2:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }
    }
}
