package decorator.main;

public class Tema extends BoloDecorator {

    public Tema(Bolo bolo) {
        super(bolo);
    }

    public float getPrecoAdicional() {
        return 15.0f;
    }
}
