/////////////////////////////////////////////////////////////////////
/**
 * Exercicio que implementa uma calculadora para as quatro operacoes
 * basicas: adicao, subtracao, multiplicacao e divisao.
 * 
 * Versao 0.0.1 - executa as quatro operacoes mas nao faz o
 *                tratamento de erro caso os operandos passados
 *                nao forem numeros. 
 * 
 */
public class Calculadora{

    public static double soma(double x, double y){
        return x + y;
    }

    public static double subtracao(double x, double y){
        return x - y;
    }

    public static double multiplicacao(double x, double y){
        return x * y;
    }

    public static double divisao(double x, double y){
        return x / y;
    }

    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("ERRO!\nUso correto: NUMERO OPERADOR NUMERO");
            System.out.println("OPERADORES: +  -  x  /");
            return;
        }

        double n1 = Double.valueOf(args[0]).doubleValue();
        double n2 = Double.valueOf(args[2]).doubleValue();

        switch(args[1]){
            case "+":
                System.out.println(soma(n1, n2));
                break;
            case "-":
                System.out.println(subtracao(n1, n2));
                break;
            case "x":
                System.out.println(multiplicacao(n1, n2));
                break;
            case "/":
                System.out.println(divisao(n1, n2));
                break;
        }
    }
}



