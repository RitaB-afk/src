public class InternationalDivision extends Division{
    public static String country;
    public static String language;
    public InternationalDivision (String divisionname, int accnum, String country, String language) {
        super(divisionname,accnum);
        this.country = country;
        this.language = language;

    }
    @Override
    public void display() {
        System.out.println("We are "+divisionname+ "from "+ country + " Here we speak mainly "+ language+
                " Our account number is "+ accnum);
    }
}
