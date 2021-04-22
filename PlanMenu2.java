import javax.swing.*;
public class PlanMenu2 {
    public static void main(String[] args) {
        PPickMenu2 entree = null;
        Menu2 briefMenu= new Menu2();
        String guestChoice= new String();
        try {
            PPickMenu2 selection = new PPickMenu2(briefMenu);
            entree= selection;
            guestChoice= entree.getGuestChoice();

        }
        catch (MenuException e) {
            guestChoice= " what";
        }
        catch (Exception e) {
            guestChoice= " an invalid selection";
        }
        JOptionPane.showMessageDialog(null, "You chose " + guestChoice);

    }
}
