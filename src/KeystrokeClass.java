import javax.swing.JButton;
import javax.swing.KeyStroke;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class KeystrokeClass extends JFrame implements KeyListener, Runnable {
	JTextField keyText = new JTextField();
	JButton c = new JButton("c");
	JButton d = new JButton("d");
	JButton e = new JButton("e");

	MakeSound note = new MakeSound();

	// constructor
	public KeystrokeClass() throws IOException {
		// setting up all the JFrame Stuff
		setup();
	}

	public void showKeystroke() {
		//
		keyText.addKeyListener(this);
		
		// buttonAction();

	}

	//
	// public static void main(String[] args) {
	// // createSound();
	//
	// JButton component = new JButton("Button");
	//
	// component.setFocusTraversalKeysEnabled(false);
	//
	// }
	// button
	public void buttonAction() {

		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String cmd = evt.getActionCommand();
				note.playSound("C:\\Users\\s-laist\\Music\\c.wav");

			}
		});
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String cmd = evt.getActionCommand();
				note.playSound("C:\\Users\\s-laist\\Music\\d.wav");

			}
		});
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String cmd = evt.getActionCommand();
				note.playSound("C:\\Users\\s-laist\\Music\\e.wav");
			}
		});
	}

	public void keyTyped(KeyEvent e) {
		// unused method
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// if the key is a, play "c" note
		Thread thread = new Thread(new Runnable() {
			public void run() {
				if (keyCode == KeyEvent.VK_A) {
					note.playSound("C:\\Users\\s-laist\\Music\\c.wav");

				} else if (keyCode == KeyEvent.VK_S) {

					note.playSound("C:\\Users\\s-laist\\Music\\d.wav");
				} else if (keyCode == KeyEvent.VK_D) {

					note.playSound("C:\\Users\\s-laist\\Music\\e.wav");
				} else if (keyCode == KeyEvent.VK_F) {
					note.playSound("C:\\Users\\s-laist\\Music\\f.wav");
				} else if (keyCode == KeyEvent.VK_G) {

					note.playSound("C:\\Users\\s-laist\\Music\\g.wav");
				} else if (keyCode == KeyEvent.VK_H) {

					note.playSound("C:\\Users\\s-laist\\Music\\a.wav");
				} else if (keyCode == KeyEvent.VK_J) {

					note.playSound("C:\\Users\\s-laist\\Music\\b.wav");
				} else if (keyCode == KeyEvent.VK_K) {

					note.playSound("C:\\Users\\s-laist\\Music\\c5.wav");
				} else if (keyCode == KeyEvent.VK_W) {

					note.playSound("C:\\Users\\s-laist\\Music\\dFlat.wav");
				} else if (keyCode == KeyEvent.VK_E) {

					note.playSound("C:\\Users\\s-laist\\Music\\eFlat.wav");
				} else if (keyCode == KeyEvent.VK_T) {

					note.playSound("C:\\Users\\s-laist\\Music\\gFlat.wav");
				} else if (keyCode == KeyEvent.VK_Y) {

					note.playSound("C:\\Users\\s-laist\\Music\\aFlat.wav");
				} else if (keyCode == KeyEvent.VK_U) {

					note.playSound("C:\\Users\\s-laist\\Music\\bFlat.wav");
				}
				// if user hold down shift and 'A'

			}
		});

		thread.start();
//		Thread.currentThread().setDaemon(true);

	}

	public void keyReleased(KeyEvent e) {

	}

	public static void soundFiles() {
		// cNote.playSound("C:\\Users\\s-laist\\Music\\c.wav");
		// dNote.playSound("C:\\Users\\s-laist\\Music\\d.wav");
		// eNote.playSound("C:\\Users\\s-laist\\Music\\e.wav");
		// fNote.playSound("C:\\Users\\s-laist\\Music\\f.wav");
		// gNote.playSound("C:\\Users\\s-laist\\Music\\g.wav");
		// aNote.playSound("C:\\Users\\s-laist\\Music\\a.wav");
		// bNote.playSound("C:\\Users\\s-laist\\Music\\b.wav");

	}

	public void setup() throws IOException {
		BorderLayout layout = new BorderLayout();
		JFrame frame = new JFrame();
		File file = new File("C:\\Users\\s-laist\\Pictures\\Camera Roll\\piano-octave.jpg");

		BufferedImage image = ImageIO.read(file);
		JLabel label = new JLabel(new ImageIcon(image));
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(layout);
		frame.add(keyText);
		frame.add(label, BorderLayout.NORTH);
		// frame.add(c, BorderLayout.WEST);
		// frame.add(d, BorderLayout.EAST);
		// frame.add(e, BorderLayout.NORTH);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}