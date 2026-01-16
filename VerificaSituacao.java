import java.util.Scanner;

public class VerificaSituacao {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String nome = "";
      String nomeAlta = "";
      String nomeBaixa = "";
      double menorNota = 10;
      double maiorNota = 0;
    
       for (int aluno = 1; aluno <= 4; aluno++) {
    
          System.out.println("\n ===== INFORME O NOME DO ALUNO " + aluno + " =====");
           nome = sc.nextLine();
          
          // Leitura das notas do aluno
          
          System.out.println("\n ===== INFORME AS NOTAS DO ALUNO " + nome + " =====");
          System.out.print("\nEscreva a primeira nota do " + nome + ": ");
          double nota1 = sc.nextDouble();
          System.out.print("Escreva a segunda nota do " + nome + ": ");
          double nota2 = sc.nextDouble();
          System.out.print("Escreva a terceira nota do " + nome + ": ");
          double nota3 = sc.nextDouble();
          System.out.print("Escreva a quarta nota do " + nome + ": ");
          double nota4 = sc.nextDouble();
          System.out.print("Escreva a quinta nota do " + nome + ": ");
          double nota5 = sc.nextDouble();
          
          //Calculo da media do aluno atual
          double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
          
          // Verificação de aprovação do aluno atual
          if (media >= 7) {
              System.out.println("\nO Aluno " + nome + " está aprovado com média de " + media);
          } else {
              System.out.println("Aluno " + nome + " com média de " + media + " não foi aprovado");
          }
          
          if (media > maiorNota){
          nomeAlta = nome;
          maiorNota = media;
          }
          
          if (media < menorNota){
            nomeBaixa = nome;
            menorNota = media;
          }
          sc.nextLine();
      }
      
      
      System.out.println("O aluno com a menor média é o " + nomeBaixa + " com a média: " + menorNota);
      System.out.println("O aluno com a maior média é o "  + nomeAlta + " com a média: " + maiorNota);  
      
      sc.close();
  }
}
