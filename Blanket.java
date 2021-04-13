public class Blanket {
    public static String size;
    public static String color;
    public static String material;
    public static Double price;

    public Blanket() {
        size= "Twin";
        color= "White";
        material= "cotton";
        price= 30.00;
    }

    public void setSize(String size) {
        this.size= size;
        if (size.equals("double")) {
            price= price +10.00;
        }
        else if (size.equals("Queen")) {
            price = price +25.00;
        }
        else if (size.equals("King")) {
            price = price + 40.00;
        }
        else new Blanket();
    }
    public void setColor (String color) {
       this.color= color;

    }
    public void setMaterial (String material) {
        this.material= material;
        if (material.equals("wool")) {
            price= price +20.00;
        }
        else if (material.equals("cashmere")) {
            price = price +45.00;
        }
        else if (size.equals("King")) {
            price = price + 40.00;
        }
        else new Blanket();
    }
    public void setPrice (Double price) {
         this.price= price;
    }


    public String toString() {

        String info= "This blanket is of size " + size + " and the material is " + material + " the color is " + color+
                " and the price is "+ price;
        return info;
    }
}
