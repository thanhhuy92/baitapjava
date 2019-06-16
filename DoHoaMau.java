import java.io.*;
import javax.swing.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.*;

public class DoHoaMau extends JFrame implements ActionListener {
	
	private JButton btnBlue=new JButton("Blue");
	private JButton btnRed=new JButton("Red");
	
	Container pane = getContentPane();
	
	public DoHoaMau() {
		pane.setLayout(new FlowLayout());
		pane.add(btnBlue);
		pane.add(btnRed);
		
		btnBlue.addActionListener(this);
		btnRed.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBlue)
		{
			pane.setBackground(Color.blue);
		}
		else
		{
			pane.setBackground(Color.red);
		}
	}
}