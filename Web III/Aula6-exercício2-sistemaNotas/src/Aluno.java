public class Aluno {
    private String nome;
    private float nota1;
    private float nota2;

    public Aluno(String nome, float nota1, float nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float calculaMedia() {
        return (nota1+nota2)/2;
    }

}
