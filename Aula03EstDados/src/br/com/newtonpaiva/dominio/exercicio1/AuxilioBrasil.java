package br.com.newtonpaiva.dominio.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuxilioBrasil
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<Integer> filaPrioridade = new ArrayList<>();
        List<Integer> filaComum = new ArrayList<>();

        for (int i = 1; i <= 200; i++)
        {
            System.out.print("Digite a senha " + i + ": ");
            int senha = scanner.nextInt();

            if (senha % 2 == 1 && senha <= 100)
            {
                filaPrioridade.add(senha);
            }
            else
            {
                filaComum.add(senha);
            }
        }

        scanner.close();

        System.out.println("\nLista de Prioridade (Senhas ímpares até 100):");
        for (int senha : filaPrioridade)
        {
            System.out.println(senha);
        }

        System.out.println("\nLista da Fila Comum:");
        for (int senha : filaComum)
        {
            System.out.println(senha);
        }
    }
}