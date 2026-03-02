void main() {
    Notas notas = new Notas();

    notas.setNota1();
    notas.setNota2();
    notas.setNota3();

    System.out.println("Nota 1:" + notas.getNota1() + ", Nota 2: " + notas.getNota2() + ", Nota 3: " + notas.getNota3());
    System.out.println("Media do Aluno: " + notas.calcularMedia());
}