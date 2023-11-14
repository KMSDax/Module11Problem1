package source;

public class Main {
    public static void main(String[] args) {

        AmericanPlug americanPlug = new AmericanPlug();
        AmericanToEuropeanAdapter europeanAdapter = new AmericanToEuropeanAdapter(americanPlug);
        europeanAdapter.plugInEuropeanPlug();

        EuropeanPlug europeanPlug = new EuropeanPlug();
        EuropeanToAmericanAdapter americanAdapter = new EuropeanToAmericanAdapter(europeanPlug);
        americanAdapter.plugInAmericanPlug();
    }
}