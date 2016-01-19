package dice;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RollGUI extends JFrame {
	private JTextField di;
	private JTextField ro;
	
	public RollGUI(){
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("# of sides"));
		di = new JTextField("0",10);
		di.setEditable(false);
		cp.add(di);
		
		JButton diSet = new JButton("Set");
		cp.add(diSet);
		
		diSet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dice Roller");
		setSize(300,100);
		setVisible(true);
	}
}
