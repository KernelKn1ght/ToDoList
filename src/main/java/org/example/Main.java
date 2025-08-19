package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        ArrayList<Tarefa> lista = new ArrayList<>();
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
           sc.nextLine(); // quebrar a linha

           switch (opcao) {
               case 1:
                   System.out.println("Descrição da Tarefa");
                   String desc = sc.nextLine();
                   lista.add(new Tarefa(desc));
                   System.out.println("Tarefa Adicionada com Sucesso !");
                   break;
               default :
                   System.out.println("Opção Inválida(por enquanto, apenas)");
           }

       } while (opcao != 0);

       sc.close();
    }
}