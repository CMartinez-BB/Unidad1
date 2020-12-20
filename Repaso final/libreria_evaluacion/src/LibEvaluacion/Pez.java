package LibEvaluacion;

public class Pez {
    String tipo_pez;
    int por_nacimineto;
    int calcular;

    public Pez(String tipo_pez, int por_nacimineto, int calcular) {
        this.tipo_pez = tipo_pez;
        this.por_nacimineto = por_nacimineto;
        this.calcular = calcular;
    }

    public String getTipo_pez() {
        return tipo_pez;
    }

    public void setTipo_pez(String tipo_pez) {
        this.tipo_pez = tipo_pez;
    }

    public int getPor_nacimineto() {
        return por_nacimineto;
    }

    public void setPor_nacimineto(int por_nacimineto) {
        this.por_nacimineto = por_nacimineto;
    }

    public int getCalcular() {
        return calcular;
    }

    public void setCalcular(int calcular) {

        this.calcular = calcular;
    }
}

