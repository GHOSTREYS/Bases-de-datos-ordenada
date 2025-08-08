
import javax.swing.JOptionPane;

public class ejemplometodos {
    public static void main(String[] args) {
        
        alumno alum=new alumno();
        String res="s";
        while(res.equalsIgnoreCase("s")){

             alum.setMatricula(JOptionPane.showInputDialog("Tecela el numero de matricula"));
            alum.setNombre(JOptionPane.showInputDialog("Teclea el nombre"));
            alum.setCarrera(JOptionPane.showInputDialog("Teclea la carrera que estudia"));
            alum.setCorreo(JOptionPane.showInputDialog("teclea el corrreo"));    
            alum.setC1(Integer.parseInt(JOptionPane.showInputDialog("teclea la calificacion de calculo integral")));
            alum.setC2(Integer.parseInt(JOptionPane.showInputDialog("teclea la calificacion de base de dato")));
            alum.setC3(Integer.parseInt(JOptionPane.showInputDialog("teclea la calificacion de POO")));
            alum.setC4(Integer.parseInt(JOptionPane.showInputDialog("teclea la calificacion de integradora")));
            alum.setC5(Integer.parseInt(JOptionPane.showInputDialog("teclea la calificacion de habilidades s")));

            alum.toString();
        System.out.println("su promedio es="+alum.calcularpromedio()+"el estatus del alumno es "+alum.DefinicirEstatus());
        System.out.println(alum.toString());
        res=JOptionPane.showInputDialog("deasea captura otro s/n");
    }
        }
       

    
}
