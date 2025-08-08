import javax.swing.*;

public class Ejemlo5 {
    public static void main(String[] args) {
        Animal anim = new Animal();
        String jugete,lugar; 
        anim.setAlimento(JOptionPane.showInputDialog("Ingresa el alimento del animal"));
        anim.setColor(JOptionPane.showInputDialog("Ingresa el color del animal"));
        anim.setHabitat(JOptionPane.showInputDialog("Ingresa el habitat del animal"));
        anim.setNommbre(JOptionPane.showInputDialog("Ingresa el nombre del animal"));
        anim.setNopatas(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de patas del animal")));

        JOptionPane.showMessageDialog(null, anim.toString());
        jugete=JOptionPane.showInputDialog("Teclea el juguete del animal");
        lugar=JOptionPane.showInputDialog("Teclea el lugar en donde descansa el animal");
               
        JOptionPane.showMessageDialog(null, anim.toString());
        anim.jugar(jugete);
        anim.dormi(lugar);
    }
}
