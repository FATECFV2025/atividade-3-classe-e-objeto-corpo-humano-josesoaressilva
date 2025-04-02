package main.java;

public class CorpoHumano {

    private float massa;
    private float densidade;
    private float volume;
    private float imc;
    private float peso;
    private float altura;

    public CorpoHumano(float massa, double volume,float altura,double peso)
    {
        this.massa = massa;
        this.volume = (float) volume;
        this.altura = altura;
        this.peso = (float) peso;
        imc = (float) (peso/altura);
        float d = 0;
        densidade = massa/d;
    }

    public float getAltura()
    {
        return altura;
    }
    public float getPeso()
    {
        return peso;
    }
    public float getIMC()
    {
        return imc;
    }
    public float getMassa()
    {
        return massa;
    }
    public float getVolume()
    {
        return volume;
    }
    public float getDensidade()
    {
        return densidade;
    }

    public void setAltura(double altura)
    {
        this.altura = (float) altura;
        float d = 0;
        imc = peso/d;
    }
    public void setPeso(float peso)
    {
        this.peso = peso;
        imc = peso/altura;
    }
    public void setMassa(float massa)
    {
        this.massa = massa;
        densidade = massa / volume;
    }
    public void setVolume(double volume)
    {
        this.volume = (float) volume;
        float d = 0;
        densidade = massa / d;
    }

    public void setDensidade(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDensidade'");
    }

    public double calcularIMC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularIMC'");
    }
}
