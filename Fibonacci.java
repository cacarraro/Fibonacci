package f;

import java.util.Scanner;

public class Fibonacci
{
    public Fibonacci()
    {}

    public int fibonacciIterativo(int n)
    {
        int anterior = 0;
        int fibo = 0;
        for (int i=0; i<=n; i++)
        {
            if (i==0)
            {
                fibo = 0;
                anterior = 0;
            }
            if (i==1)
            {
                fibo = 1;
                anterior = 0;
            }
            if (i==2)
            {
                fibo = 1;
                anterior = 1;
            }
            else
            {
                fibo = fibo + anterior;
                anterior = fibo - anterior;
            }
            //System.out.println(fibo);
        }
        return fibo;
    }

    public int fibonacciRecursivo(int n)
    {
        int fibo = 0;
        if (n == 1 || n == 2)
        {
            fibo = 1;
        }
        else
        {
            fibo = fibonacciRecursivo(n - 2) + fibonacciRecursivo(n - 1);
        }
        //System.out.println(fibo);
        return fibo;
    }
}

class Main {
    public static void main(String[] args)
    {
        // cria uma instancia da classe f.Fibonacci
        Fibonacci F = new Fibonacci();

        // cria um Scan para ler a entrada do usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira qual o termo da serie de f.Fibonacci que deseja calcular: ");
        int input = scan.nextInt();
        scan.close();

        int resultadoIterativo = F.fibonacciRecursivo(input);
        int resultadoRecursivo = F.fibonacciRecursivo(input);

        System.out.println("O Valor do termo " + input + " na sequencia (obtido de forma iterativa) é: " + resultadoIterativo);
        System.out.println("O Valor do termo " + input + " na sequencia (obtido de forma recursiva) é: " + resultadoRecursivo);
    }
}