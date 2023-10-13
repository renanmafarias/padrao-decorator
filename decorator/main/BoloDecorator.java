package decorator.main;

public abstract class BoloDecorator implements Bolo {

    private Bolo bolo;
    public String estrutura;

    public BoloDecorator(Bolo bolo) {
        this.bolo = bolo;
    }

    public Bolo getBolo() {
        return bolo;
    }

    public void setBolo(Bolo bolo) {
        this.bolo = bolo;
    }

    public abstract float getPrecoAdicional();

    public float getPreco() {
        return this.curso.getPreco() + this.getPrecoAdicional();
    }
}
