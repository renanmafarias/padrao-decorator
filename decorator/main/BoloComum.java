package decorator.main;

public class BoloComum implements Bolo {

    public float preco;

    public BoloComum(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
}
