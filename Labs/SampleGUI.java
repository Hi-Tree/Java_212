import javax.swing.*;
import java.awt.*;
public class SampleGUI extends JFrame {
      
   public SampleGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
       setLocation  (400,200);
	    createFileMenu();
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   } //SSNGUI

   private void createFileMenu( ) {
      JMenuItem   item;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("File");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      JMenu       fileMenu2 = new JMenu("Edit");
      EditMenuHandler edit = new EditMenuHandler(this);
      item = new JMenuItem("Find");
      item.addActionListener(edit);
      fileMenu2.add(item);

      item = new JMenuItem("Replace");
      item.addActionListener(edit);
      fileMenu2.add(item);

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
      menuBar.add(fileMenu2);
    
   } //createMenu

} //SSNGUI
