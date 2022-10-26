package structuralmode.decorator;

public class FriedFood extends FastFood {

    public FriedFood() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
