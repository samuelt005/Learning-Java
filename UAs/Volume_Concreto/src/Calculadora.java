public class Calculadora {
    private float volume;
    private float base;
    private float altura;
    private float comprimento;

    private void calculaVolume(float base, float altura, float comprimento) {
        this.volume = base * altura * comprimento;
    }

    public float getVolume() {
        calculaVolume(base, altura, comprimento);
        return volume;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
}
