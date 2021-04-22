public class VegetarianMenu extends Menu2 {
    String [] vegEntreeChoices= {"Spinach Lasagna", "Cheese Enchiladas", "Fruit Plate"};

    public VegetarianMenu () {
        super();
        for (int x=0; x< entreeChoices.length; x++) {
            entreeChoices[x]=vegEntreeChoices[x];
        }
    }
}
