package Model;


public class Aluno extends Pessoa implements Avaliavel{
    //atributos
    private String matricula;
    private double nota;
    //construtor
    public Aluno(String nome, String cpf, String matricula, double nota) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = nota;
    }
    //getters and setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    //exibir informações - SobreEscrita
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Matricula: "+matricula);
        System.out.println("Nota: "+nota);
    }
    //Avaliável
    @Override
    public void avaliarDesempenho() {
        if (nota>=6) {
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }

        
}
