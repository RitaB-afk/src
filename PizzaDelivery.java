import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PizzaDelivery extends JFrame implements ItemListener {
String [] Toppings= {"","Cheese","Pepperoni","Olives","Mushrooms"};
JComboBox ChooseTop= new JComboBox(Toppings);
String [] Size= {"","Small","Medium", "Large"};
JComboBox ChooseSize= new JComboBox(Size);
String [] Sauce= {"","White Sauce","Hot Sauce","Red Sauce"};
JComboBox ChooseSauce= new JComboBox(Sauce);
JLabel Title= new JLabel("Please Choose your pizza:");
JTextField Address= new JTextField(25);
JLabel Topping= new JLabel("Choose your topping: ");
JLabel Sizes= new JLabel("Choose the size: ");
JLabel Sauces= new JLabel("Choose the sauce: ");
JLabel Addresses= new JLabel("Enter your address: ");
final int WIDTH= 275;
final int HEIGHT= 225;
final int BasePrice= 10;
final int Top=5;
final int s= 5;
final int sau=5;
int total=BasePrice;
JTextField tot= new JTextField(4);
JButton press= new JButton("Order");
Font bigFont= new Font("Arial", Font.BOLD,16);
Font smallFont= new Font("Serif", Font.ITALIC,12);

public PizzaDelivery()
{
    super("Pizza Delivery Service");
    setSize(WIDTH,HEIGHT);
    setLayout(new FlowLayout());
    Title.setFont(bigFont);
    Sizes.setFont(smallFont);
    Addresses.setFont(smallFont);
    Sauces.setFont(smallFont);
    Topping.setFont(smallFont);
    add(Title);
    add(Topping);
    add(ChooseTop);
    add(Sauces);
    add(ChooseSauce);
    add(Sizes);
    add(ChooseSize);
    add(Addresses);
    add(Address);
    add(tot);
    add(press);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tot.setText("Nok"+ total);
    ChooseTop.addItemListener(this);
    ChooseSauce.addItemListener(this);
    ChooseSize.addItemListener(this);


}

public static void main(String[] args){
    PizzaDelivery frame= new PizzaDelivery();
    frame.setVisible(true);
}

    @Override
    public void itemStateChanged(ItemEvent e) {
   Object source= e.getSource();
   int select= e.getStateChange();
   if (source==ChooseSauce)
   { if (select==ItemEvent.SELECTED)
       total+=Top;
   }
   else if (source==ChooseSize)
   {
       if (select==ItemEvent.SELECTED)
       total+=s;
   }
   else {
       if (select==ItemEvent.SELECTED)
       total+=sau;
   }
   tot.setText("nok"+total);
    }
}
