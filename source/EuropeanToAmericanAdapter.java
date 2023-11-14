package source;

public class EuropeanToAmericanAdapter implements AmericanSocket {
    private EuropeanPlug europeanPlug;

    public EuropeanToAmericanAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void plugInAmericanPlug() {
        System.out.println("Using an adapter to plug European plug into American socket.");
        europeanPlug.insertEuropeanPlug();
    }
}