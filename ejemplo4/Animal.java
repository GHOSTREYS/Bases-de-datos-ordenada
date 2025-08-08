public class Animal {
    private String nommbre;
    private String color;
    private String alimento;
    private String habitat;
    private int nopatas;

    // Getter y Setter para 'nommbre'
    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    // Getter y Setter para 'color'
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter y Setter para 'alimento'
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    // Getter y Setter para 'habitat'
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Getter y Setter para 'nopatas'
    public int getNopatas() {
        return nopatas;
    }

    public void setNopatas(int nopatas) {
        this.nopatas = nopatas;
    }

    @Override
    public String toString() {
    return "Animal{" +
            "nommbre='" + nommbre + '\'' +
            ", color='" + color + '\'' +
            ", alimento='" + alimento + '\'' +
            ", habitat='" + habitat + '\'' +
            ", nopatas=" + nopatas +
            '}';
    }
    public void jugar(String jugete){
        System.out.println("el animal juega con"+jugete);
    }

    public void dormi(String lugar){
        System.out.println(nommbre+"duerme en "+lugar);
    }

    
}
