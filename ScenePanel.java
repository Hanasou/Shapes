import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * User defined panel that draws shapes when the area gets clicked on.
 *
 */
public class ScenePanel extends JPanel {

	private SceneShape shape = new CarShape(0, 0, 30);
	private ArrayList<SceneShape> display;
	private String selected;
	public ScenePanel() {
		this.display = new ArrayList<SceneShape>();
		this.selected = "car";
		
		MouseListener m = new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				SceneShape drawThis = shape;
				drawThis.translate(e.getX(), e.getY());
				add(drawThis);
				
				repaint();
				shape = drawThis;
				if (selected.equals("car")) {
					shape = new CarShape(0, 0, 30);
				}
				if (selected.equals("snowman")) {
					shape = new SnowmanShape(0, 0, 10);
				}
				if (selected.equals("block")) {
					shape = new BlockShape(0, 0, 20);
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {}

			@Override
			public void mouseExited(MouseEvent arg0) {}

			@Override
			public void mousePressed(MouseEvent arg0) {}

			@Override
			public void mouseReleased(MouseEvent arg0) {}
			
		};
		addMouseListener(m);
	}
	public void setShape(SceneShape s) {
		this.shape = s;
	}
	public void add(SceneShape s) {
		display.add(s);
	}
	public void setSelected(String s) {
		this.selected = s;
	}
	/*
	 * paintComponent method taken from ch6/scene1/scenecomponent.java
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		//shape.draw(g2);
		for (SceneShape s : display) {
			s.draw(g2);
		}
	}

}
