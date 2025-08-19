package org.example;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int opcao;

       do {
           System.out.println("\n --- TO-DO LIST ---");
           System.out.println("1 - Adicionar Tarefa");
           System.out.println("2 - Lista de Tarefas");
           System.out.println("3 - Concluir Tarefa");
           System.out.println("4 - Remover tarefa");
           System.out.println("0 - Sair ");
           System.out.println("Escolha: ");
           opcao = sc.nextInt();

           //  por enquanto, só imprime
           System.out.println();
       } while (opcao != 0);

       sc.close();
    }
}