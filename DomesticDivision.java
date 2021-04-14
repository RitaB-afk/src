public class DomesticDivision extends Division{
    public static String state;


    public DomesticDivision(String divisionname, int accnum, String state) {
        super(divisionname, accnum);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("We are "+divisionname+ "from "+ state +
                " Our account number is "+ accnum);

    }
}
