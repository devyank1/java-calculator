import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {

        int escolherOperacao = 0;
        int numeroUm, numeroDois;
        boolean continuarOperacao = true;
        Scanner scanner = new Scanner(System.in);

        if (continuarOperacao){
            System.out.println("Bem vindo a calculadora!");
            System.out.println("Escolha a sua operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Módulo");
            System.out.println("6. Sair da Calculadora!");
            escolherOperacao = scanner.nextInt();
            scanner.nextLine();
        }

        if (escolherOperacao == 6){
            continuarOperacao = false;
            System.out.println("O aplicativo da calculadora foi finalizado");
        }

        System.out.println("Escolha o seu primeiro valor: ");
        while (!scanner.hasNextInt()){
            System.out.println("ERRO! Precisamos de um número inteiro para conseguir realizar o cálculo!");
            scanner.next();
            System.out.println("Digite o número: ");
        }

        numeroUm = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha o segundo valor: ");
        while (!scanner.hasNextInt()){
            System.out.println("ERRO! Precisamos de um número inteiro para conseguir realizar o cálculo");
            scanner.next();
            System.out.println("Digite o número: ");
        }
        numeroDois = scanner.nextInt();
        scanner.nextLine();

        switch (escolherOperacao){
            case 1:
                System.out.println(numeroUm + " + " + numeroDois + " = " + (numeroUm + numeroDois));
                break;

            case 2:
                System.out.println(numeroUm + " - " + numeroDois + " = " + (numeroUm - numeroDois));
                break;

            case 3:
                System.out.println(numeroUm + " * " + numeroDois + " = " + (numeroUm + numeroDois));
                break;

            case 4:
                if (numeroUm == 0 || numeroDois == 0){
                    System.out.println("ERRO!");
                } else {
                    System.out.println(numeroUm + " / " + numeroDois + " = " + (double) numeroUm / (double) numeroDois);
                }break;

            case 5:
                if (numeroUm == 0 || numeroDois == 0){
                    System.out.println("ERRO!");
                }else {
                    System.out.println(numeroUm + " % " + numeroDois + " = " + (double) numeroUm % (double) numeroDois);
                }break;

            default:
                System.out.println("Não entendemos o que está procurando");
                break;
        }

    }


}