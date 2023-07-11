public enum Currency {

    USD("DOllar", "$"),

    EUR("EURO", "€"),

    RUB("RUBL", "₽"),

    JPY("Japanese Yen", "¥"),

    AVD("Australian Dollar", "AV$");


    private String currency;

    private String symbol;

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {this.currency = currency;}

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    Currency(String currency, String symbol) {
        this.currency = currency;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Currency " +
                "\n Name = " + currency +
                "\n symbol = " + symbol ;
    }
}

