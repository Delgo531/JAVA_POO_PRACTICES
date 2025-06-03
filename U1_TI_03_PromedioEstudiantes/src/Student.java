public class Student {
    //Variables
    private String nombre;
    private String matricula;
    private double[] nota = new double[5];
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(int i, double nota) {
        this.nota[i] = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //metodos
    public double calcularPromedio() {
        double promedio = 0;
        for (int i = 0; i < 5; i++) {
            promedio = promedio + nota[i];
        }
        promedio = promedio / 5;
        return promedio;
    }
    public boolean aprobado(){
        return calcularPromedio() >= 70;
    }

}
