import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ShapeDisplayer {

	public static void main (String[] args) {
		JFrame frame = new JFrame();
		final CompoundShape car = new CarShape(5, 5, 40);
		final CompoundShape snowman = new SnowmanShape(20, 10, 10);
		final CompoundShape block = new BlockShape (20, 7, 15);
		
		ShapeIcon carIcon = new ShapeIcon(car, 20, 20);
		ShapeIcon snowmanIcon = new ShapeIcon(snowman, 20, 20);
		ShapeIcon blockIcon = new ShapeIcon(block, 20, 20);
		
		final ScenePanel panel = new ScenePanel();
		
		JButton carButton = new JButton(carIcon);
		carButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setSelected("car");
				panel.setShape(new CarShape(0, 0, 30));
			}
		});
		JButton snowmanButton = new JButton(snowmanIcon);
		snowmanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setSelected("snowman");
				panel.setShape(new SnowmanShape(0, 0, 10));
			}
		});
		JButton blockButton = new JButton(blockIcon);
		blockButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setSelected("block");
				panel.setShape(new BlockShape(0, 0, 20));
			}
		});
		
		JPanel buttons = new JPanel();
		buttons.add(carButton);
		buttons.add(snowmanButton);
		buttons.add(blockButton);
		
		frame.setLayout(new BorderLayout());
		
		frame.add(buttons, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
