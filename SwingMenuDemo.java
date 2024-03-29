
    import javax.swing.*;
    import java.awt.*;
import java.awt.event.*;

    public class SwingMenuDemo {
        private JFrame mainFrame;
        private JLabel headerLabel;
        private JLabel statusLabel;
        private JPanel controlPanel;

        public SwingMenuDemo(){
            prepareGUI();
        }
        public static void main(String[] args){
            SwingMenuDemo  swingMenuDemo = new SwingMenuDemo();
            swingMenuDemo.showMenuDemo();
        }
        private void prepareGUI(){
            mainFrame = new JFrame("Java SWING Examples");
            mainFrame.setSize(400,400);
            mainFrame.setLayout(new GridLayout(3, 1));

            headerLabel = new JLabel("",JLabel.CENTER );
            statusLabel = new JLabel("",JLabel.CENTER);
            statusLabel.setSize(350,100);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            controlPanel = new JPanel();
            controlPanel.setLayout(new FlowLayout());

            mainFrame.add(headerLabel);
            mainFrame.add(controlPanel);
            mainFrame.add(statusLabel);
            mainFrame.setVisible(true);
        }
        private void showMenuDemo(){
            //create a menu bar
            final JMenuBar menuBar = new JMenuBar();

            //create menus
            JMenu fileMenu = new JMenu("File");
            JMenu editMenu = new JMenu("Edit");
            final JMenu aboutMenu = new JMenu("About");
            final JMenu linkMenu = new JMenu("Links");

            //create menu items
            JMenuItem newMenuItem = new JMenuItem("New");
            newMenuItem.setMnemonic(KeyEvent.VK_N);
            newMenuItem.setActionCommand("New");

            JMenuItem openMenuItem = new JMenuItem("Open");
            openMenuItem.setActionCommand("Open");

            JMenuItem saveMenuItem = new JMenuItem("Save");
            saveMenuItem.setActionCommand("Save");

            JMenuItem exitMenuItem = new JMenuItem("Exit");
            exitMenuItem.setActionCommand("Exit");

            JMenuItem cutMenuItem = new JMenuItem("Cut");
            cutMenuItem.setActionCommand("Cut");

            JMenuItem copyMenuItem = new JMenuItem("Copy");
            copyMenuItem.setActionCommand("Copy");

            JMenuItem pasteMenuItem = new JMenuItem("Paste");
            pasteMenuItem.setActionCommand("Paste");

            MenuItemListener menuItemListener = new MenuItemListener();

            newMenuItem.addActionListener(menuItemListener);
            openMenuItem.addActionListener(menuItemListener);
            saveMenuItem.addActionListener(menuItemListener);
            exitMenuItem.addActionListener(menuItemListener);
            cutMenuItem.addActionListener(menuItemListener);
            copyMenuItem.addActionListener(menuItemListener);
            pasteMenuItem.addActionListener(menuItemListener);

            final JCheckBoxMenuItem showWindowMenu = new JCheckBoxMenuItem("Show About", true);
            showWindowMenu.addItemListener(e -> {

                if(showWindowMenu.getState()){
                    menuBar.add(aboutMenu);
                } else {
                    menuBar.remove(aboutMenu);
                }
            });
            final JRadioButtonMenuItem showLinksMenu = new JRadioButtonMenuItem(
                    "Show Links", true);
            showLinksMenu.addItemListener(e -> {

                if(menuBar.getMenu(3)!= null){
                    menuBar.remove(linkMenu);
                } else {
                    menuBar.add(linkMenu);
                }
                mainFrame.repaint();
            });
            //add menu items to menus
            fileMenu.add(newMenuItem);
            fileMenu.add(openMenuItem);
            fileMenu.add(saveMenuItem);
            fileMenu.addSeparator();
            fileMenu.add(showWindowMenu);
            fileMenu.addSeparator();
            fileMenu.add(showLinksMenu);
            fileMenu.addSeparator();
            fileMenu.add(exitMenuItem);

            editMenu.add(cutMenuItem);
            editMenu.add(copyMenuItem);
            editMenu.add(pasteMenuItem);

            //add menu to menubar
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(aboutMenu);
            menuBar.add(linkMenu);

            //add menubar to the frame
            mainFrame.setJMenuBar(menuBar);
            mainFrame.setVisible(true);
        }
        class MenuItemListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText(e.getActionCommand() + " JMenuItem clicked.");
            }
        }
    }

