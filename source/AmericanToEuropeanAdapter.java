package source;

public class AmericanToEuropeanAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public AmericanToEuropeanAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void plugInEuropeanPlug() {
        System.out.println("Using an adapter to plug American plug into European socket.");
        americanPlug.insertAmericanPlug();
    }
}