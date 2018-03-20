import javax.swing.JOptionPane;

public class principal{
    public static void main(String[] args) {

      //Nome_da_Classe Nome_do_Objeto new_metodo_construtor();
        Aluno a = new Aluno();

        a.setNome(JOptionPane.showInputDialog("Digite seu nome"));
        
        a.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Digite sua Idade")));
        
        a.setNota1(Float.valueOf(JOptionPane.showInputDialog("Digite a 1 nota")));
        
        a.setNota2(Float.valueOf(JOptionPane.showInputDialog("Digite a 2 nota")));
        
        JOptionPane.showMessageDialog(null, a.exibir());
        
      //  JOptionPane.showMessageDialog(null, "media:"+ a.calcularMedia()+"\naprovado?"+a.exibirSituacao(7));
    }
    
}