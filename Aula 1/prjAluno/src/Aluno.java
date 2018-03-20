public class Aluno {
    
    private String nome;
    private int idade;
    private float nota1;
    private float nota2;
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getNota1() {
        return nota1;
    }
    public float getNota2() {
        return nota2;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    
    public boolean isMaiorIdade(){
        return idade >= 18;
    }
    
    public float mediaAritmetica(){
        return (nota1 + nota2)/2;
    }
    
    public String exibir(){
        String isMaior = isMaiorIdade()?"Sim":"Não";
        String media = String.format("%.2f", mediaAritmetica());
        
        return "\nNome: "+nome+
               "\nIdade: "+idade+
               "\nMaior de Idade? "+isMaior+
               "\nNota 1: "+nota1+
               "\nNota 2: "+nota2+
               "\nMedia: "+media;
    }
}