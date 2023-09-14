// 3. Using Java JMenuItem and JMenu implement application swing.

import javax.swing.*;

class SwingMenu extends JFrame {
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    SwingMenu() {
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        JMenuBar mb = new JMenuBar();
        mb.add(menu);
        setJMenuBar(mb);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingMenu();
    }
}