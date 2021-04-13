public class ElectricBlanket extends Blanket {
    public static int heatsetting;
    public static String autshutoff;

    public ElectricBlanket () {
        super();
        heatsetting = 1;
        autshutoff = "no";
    }

    public int getHeatsetting () {
        return heatsetting;
    }

    public String getAutshutoff() {
        return autshutoff;
    }
    public void setHeatsetting (int heatsetting) {
        if (heatsetting < 1 ){
            System.out.println("The heat settings cannot be fewer than 1");
            heatsetting = 1;
        }
        else {
         this.heatsetting= heatsetting;}
    }

    public void setAutshutoff (String autshutoff)
    {
         this.autshutoff=autshutoff;
        if (autshutoff.equals("yes")) {
            price= price + 5.75;
        }
    }

    @Override
    public String toString() {
       String info= "This blanket is of size " + ElectricBlanket.size + " and the material is " + material + " the color is " + color+
                "the price is "+ ElectricBlanket.price+ "electrical blanket has a heat setting of " + heatsetting +
                " and the automatic shuttoff is " + autshutoff ;
       return info;

    }

}
