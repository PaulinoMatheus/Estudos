import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas {
    Scanner scanner = new Scanner(System.in);
    private double nota1 = 0.0;
    private double nota2 = 0.0;
    private double nota3 = 0.0;

    public double verificarNota(double nota) {
        while (nota < 0 || nota > 10) {
            System.out.println("A nota precisa ser maior que 0 e menor que 10! Digite a nota novamwente!");
            nota = scanner.nextDouble();
            scanner.nextLine();
        }
        return nota;
    }

    public double calcularMedia() {
        double media = ((nota1 + nota2 + nota3) / 3);
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação! :/");
        } else {
            System.out.println("Aluno reprovado! =[");
        }
        return media;
    }

    public void setNota1() {
        System.out.println("Digite a primeira nota: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Você deve digitar um número válido.");
            scanner.next();
            System.out.println("Digite a primeira nota: ");
        }
        nota1 = verificarNota(scanner.nextDouble());
    }

    public void setNota2() {
        System.out.println("Digite a segunda nota: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Você deve digitar um número válido.");
            scanner.next();
            System.out.println("Digite a segunda nota: ");
        }
        nota2 = verificarNota(scanner.nextDouble());
    }

    public void setNota3() {
        System.out.println("Digite a terceira nota: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Você deve digitar um número válido.");
            scanner.next();
            System.out.println("Digite a terceira nota: ");
        }
        nota3 = verificarNota(scanner.nextDouble());
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }
}
