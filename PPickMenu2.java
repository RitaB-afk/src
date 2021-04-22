import javax.swing.*;
public class PPickMenu2 {
    private Menu2 briefMenu;
    private String guestChoice = new String ();
    public PPickMenu2 (Menu2 theMenu) throws MenuException {
        briefMenu = theMenu;
        setGuestChoice ();

    }
    public void setGuestChoice () throws MenuException {
        JOptionPane.showMessageDialog(null, "Choose from the following menu");
        guestChoice= briefMenu.displayMenu();

    }

    public String getGuestChoice() {
        return (guestChoice);

    }


}

