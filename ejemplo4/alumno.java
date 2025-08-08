public class alumno {
    String  matricula;
    String nombre;
    String correo;
    String carrera;
    int c1;
    int c2;
    int c3;
    int c4;
    int c5;
    String estatus;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }    
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    public int getC4() {
        return c4;
    }

    public void setC4(int c4) {
        this.c4 = c4;
    }

    public int getC5() {
        return c5;
    }

    public void setC5(int c5){
        this.c5=c5;
    }

    public double calcularpromedio(){
        return (c1+c2+c3+c4+c5)/5;
    }

    @Override
    public String toString(){
        return "Alumno{"+"matricula"+matricula+"nombre"+nombre+"correo="+correo+
        ",carrera="+carrera+",calculo integral ="+c1+",base de datos="+c2+
        ",programacion orientada a objetos="+c3+",integradora"+c4+",habilidades s.="+c5+"}";
    }
    public String getEstatus(){
        return estatus;
    }

    public String DefinicirEstatus(){
        if(calcularpromedio()>=7)
            return estatus="aprobado";
        else
            return estatus="no aprobado";
            
    }


    
}
