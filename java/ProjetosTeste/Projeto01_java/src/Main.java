import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static void main(String[] args) {
   List<String> listaDeTarefas = new ArrayList<>();
   Scanner s = new Scanner(System.in);

   boolean executando = true;
   while(executando){
       System.out.println("""
               Digite o número da ação que deseja realizar:
               
               1 - Cadastrar nova tarefa
               2 - Remover tarefa
               3 - Listar Tarefas
               4 - Sair
               """);
       int opcao = s.nextInt();
       if (opcao == 1){
          System.out.println("Digite qual tarefa deverá realizar: ");
          s.nextLine();
          String tarefa = s.nextLine();
          listaDeTarefas.add(tarefa);
       } else if (opcao == 2) {
          System.out.println("Digite a tarefa que deseja excluir");
          int indice = s.nextInt();
          if (indice >= listaDeTarefas.size()){
             System.out.println("Digite o indice da tarefa valido na lista");
          } else {
             listaDeTarefas.remove(indice);
          }
       } else if (opcao == 3) {
           System.out.println("******************* LISTA DE TAREFAS *******************");
           for (String x : listaDeTarefas){
               System.out.println(listaDeTarefas.indexOf(x) + " - " + listaDeTarefas.get(listaDeTarefas.indexOf(x)));
           }
           System.out.println("********************************************************");
       } else if (opcao == 4) {
          System.out.println("Encerrando lista de tarefas");
          executando = false;
       }else {
          System.out.println("Digite um numero de 1 a 4 para realizar a tarefa: ");
       }
   }
}