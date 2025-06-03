import java.text.DecimalFormat;

public class Persona {
    //Atributos
    private Float imc;
    private Float peso;
    private Float altura;
    private String nombre;

    DecimalFormat df2 = new DecimalFormat("0.00");
    //Getters and Setters
    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public float calcularIMC() {

        imc = peso / (altura * altura);

        return imc;

    }

    public void imprimirIMC(float imc) {


        if (imc < 18.5) {
            System.out.println("Bajo Peso : " + df2.format(imc));
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso Saludable: " + df2.format(imc));
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso :" + df2.format(imc));
        }
        else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad :" + df2.format(imc));

        }
    }
}
