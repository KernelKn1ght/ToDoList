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
           sc.nextLine();

           switch (opcao) {
               case 1:
                   boolean adicionarMais = true;
                   while (adicionarMais) {
                       System.out.print("Descrição da Tarefa: ");
                       String desc = sc.nextLine();
                       lista.add(new Tarefa(desc));
                       System.out.println("Tarefa adicionada com sucesso!");

                       System.out.print("Deseja adicionar outra tarefa? (s/n): ");
                       String resp = sc.nextLine().trim().toLowerCase();
                       if (!resp.equals("s")) {
                           adicionarMais = false;
                       }
                   }
                   break;

               case 2:
                   System.out.println("\n--- Tarefas ---");
                   for (int i = 0; i < lista.size(); i++) {
                       System.out.println(i + " - " + lista.get(i));
                   }
                   System.out.print("\nPressione ENTER para voltar ao menu...");
                   sc.nextLine();
                   break;

               case 3:
                   if (lista.isEmpty()) {
                       System.out.println("Não há tarefas para concluir!");
                   } else {
                       boolean concluirMais = true;
                       while (concluirMais) {
                           System.out.println("\n--- Tarefas ---");
                           for (int i = 0; i < lista.size(); i++) {
                               System.out.println(i + " - " + lista.get(i));
                           }

                           System.out.print("Digite o índice da tarefa a concluir: ");
                           int idxConcluir = sc.nextInt();
                           sc.nextLine();

                           if (idxConcluir >= 0 && idxConcluir < lista.size()) {
                               lista.get(idxConcluir).concluir();
                               System.out.println("Tarefa concluída!");
                           } else {
                               System.out.println("Índice inválido!");
                           }


                           if (!lista.isEmpty()) {
                               System.out.print("Deseja concluir outra tarefa? (s/n): ");
                               String resp = sc.nextLine().trim().toLowerCase();
                               if (!resp.equals("s")) {
                                   concluirMais = false;
                               }
                           } else {
                               System.out.println("Não há mais tarefas para concluir.");
                               concluirMais = false;
                           }
                       }
                   }
                   System.out.print("\nPressione ENTER para voltar ao menu...");
                   sc.nextLine();
                   break;


               case 4:
                   if (lista.isEmpty()) {
                       System.out.println("Não há tarefas para remover!");
                   } else {
                       boolean continuar = true;
                       while (continuar && !lista.isEmpty()) {
                           System.out.println("\n--- Tarefas ---");
                           for (int i = 0; i < lista.size(); i++) {
                               System.out.println(i + " - " + lista.get(i));
                           }

                           System.out.print("Digite o índice da tarefa a ser removida: ");
                           int idxRemover = sc.nextInt();
                           sc.nextLine();

                           if (idxRemover >= 0 && idxRemover < lista.size()) {
                               lista.remove(idxRemover);
                               System.out.println("Tarefa removida!");
                           } else {
                               System.out.println("Índice inválido!");
                           }

                           if (!lista.isEmpty()) {
                               System.out.print("Deseja remover outra tarefa? (s/n): ");
                               String resp = sc.nextLine().trim().toLowerCase();
                               if (!resp.equals("s")) {
                                   continuar = false;
                               }
                           } else {
                               System.out.println("Não há mais tarefas para remover.");
                               continuar = false;
                           }
                       }
                   }

                   System.out.print("\nPressione ENTER para voltar ao menu...");
                   sc.nextLine();
                   break;

               case 0:
                   System.out.println("Saindo do programa...");
                   break;

               default :
                   System.out.println("Opção Inválida(por enquanto, apenas)");

           }

       } while (opcao != 0);

       sc.close();
    }
}