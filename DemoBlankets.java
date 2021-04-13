public class DemoBlankets {
    public static void main (String [] args) {


        Blanket normal = new Blanket();
        normal.setColor("Blue");
        normal.setSize("Queen");
        normal.setMaterial("wool");

        System.out.println(normal.toString());

        ElectricBlanket electro= new ElectricBlanket();
        electro.setColor("Red");
        electro.setMaterial("cashmere");
        electro.setSize("King");

        electro.setAutshutoff("yes");
        electro.setHeatsetting(0);
        System.out.println(electro);

    }
}
