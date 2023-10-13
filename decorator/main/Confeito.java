package decorator.main;

public class Confeito extends BoloDecorator {

    public Confeito(Bolo bolo) {
        super(bolo);
    }

    public float getPrecoAdicional() {
        return 12.0f;
    }
}
