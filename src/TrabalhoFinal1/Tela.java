package TrabalhoFinal1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelEditor = new JPanel();
		panelEditor.setBounds(145, 4, 740, 465);
		contentPane.add(panelEditor);
		panelEditor.setLayout(null);
		
		JScrollPane scrollTextArea = new JScrollPane();
		scrollTextArea.setBounds(0, 1, 740, 465);
		panelEditor.add(scrollTextArea);
		
		textArea = new JTextArea();
		textArea.setBounds(0, 1, 740, 465);
		textArea.setBorder(new NumberedBorder());
		
		scrollTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    scrollTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollTextArea.setViewportView(textArea);
		
		JPanel panelBarraFerramentas = new JPanel();
		panelBarraFerramentas.setBounds(0, 0, 145, 590);
		contentPane.add(panelBarraFerramentas);
		panelBarraFerramentas.setLayout(null);
		
		//lblImagem.setText("<html><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/new.png/></html>");
		
		btnNewButton = new JButton("New [ctrl + n]");
		btnNewButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "evento");
		btnNewButton.getActionMap().put("evento", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				newButton(e);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newButton(e);
			}
		});
		/*btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evt) {
				
				btnNewButton.setMnemonic(KeyEvent.VK_F1);
			}
		});*/
		
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(5, 5, 135, 55);
		btnNewButton.setText("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/new.png/>\r\n<br />New [ctrl + n]<br />\r\n<center>\r\n</html>");
		panelBarraFerramentas.add(btnNewButton);
		
		JButton btnOpen = new JButton("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/open.png/>\r\n<br />Open [ctrl + o]<br />\r\n<center>\r\n</html>");
		btnOpen.setVerticalAlignment(SwingConstants.BOTTOM);
		btnOpen.setBounds(5, 64, 135, 55);
		btnOpen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK), "openAtalho");
		btnOpen.getActionMap().put("openAtalho", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				openButton(e);
			}
		});
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openButton(e);
			}
		});
		panelBarraFerramentas.add(btnOpen);
		
		JButton btnSave = new JButton("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/save.png/>\r\n<br />Save [ctrl + s]<br />\r\n<center>\r\n</html>");
		btnSave.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSave.setBounds(5, 123, 135, 55);
		btnSave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK), "saveAtalho");
		btnSave.getActionMap().put("saveAtalho", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				saveButton(e);
			}
		});
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveButton(e);
			}
		});
		panelBarraFerramentas.add(btnSave);
		
		JButton btnCopy = new JButton("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/copy.png/>\r\n<br />Copy [ctrl + c]<br />\r\n<center>\r\n</html>");
		btnCopy.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCopy.setBounds(5, 182, 135, 55);
		btnCopy.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK), "copyAtalho");
		btnCopy.getActionMap().put("copyAtalho", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				copyButton(e);
			}
		});
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				copyButton(e);
			}
		});
		
		panelBarraFerramentas.add(btnCopy);
		
		JButton btnPaste = new JButton("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/paste.png/>\r\n<br />Paste [ctrl + v]<br />\r\n<center>\r\n</html>");
		btnPaste.setVerticalAlignment(SwingConstants.BOTTOM);
		btnPaste.setBounds(5, 241, 135, 55);
		btnPaste.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK), "pasteAtalho");
		btnPaste.getActionMap().put("pasteAtalho", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				pasteButton(e);
			}
		});
		btnPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasteButton(e);
			}
		});
		
		
		panelBarraFerramentas.add(btnPaste);
		
		JButton btnCut = new JButton("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/cut.png/>\r\n<br />Cut [ctrl + x]<br />\r\n<center>\r\n</html>");
		btnCut.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCut.setBounds(5, 300, 135, 55);
		btnCut.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK), "cutAtalho");
		btnCut.getActionMap().put("cutAtalho", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				cutButton(e);
			}
		});
		btnCut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cutButton(e);
			}
		});
		
		panelBarraFerramentas.add(btnCut);
		
		JButton btnCompile = new JButton("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/compile.png/>\r\n<br />Compile [ctrl + f9]<br />\r\n<center>\r\n</html>");
		btnCompile.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCompile.setBounds(5, 360, 135, 55);
		btnCompile.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F9, InputEvent.CTRL_DOWN_MASK), "compileAtalho");
		btnCompile.getActionMap().put("compileAtalho", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				compileButton(e);
			}
		});
		btnCompile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compileButton(e);
			}
		});
		panelBarraFerramentas.add(btnCompile);
		
		JButton btnAbout = new JButton("<html>\r\n\r\n<center>\r\n<br /><img src=file:/C:/Users/asus/eclipse-workspace/Compiladores/bin/resource/about.png/>\r\n<br />About [ctrl + f1]<br />\r\n<center>\r\n</html>");
		btnAbout.setVerticalAlignment(SwingConstants.BOTTOM);
		btnAbout.setBounds(5, 420, 135, 55);
		btnAbout.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_DOWN_MASK), "aboutAtalho");
		btnAbout.getActionMap().put("aboutAtalho", new AbstractAction(){
			public void actionPerformed(ActionEvent e) {
				aboutButton(e);
			}
		});
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aboutButton(e);
			}
		});
		
		panelBarraFerramentas.add(btnAbout);
		

		
		
		JPanel panelVisual = new JPanel();
		panelVisual.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelVisual.setBounds(145, 480, 740, 95);
		contentPane.add(panelVisual);
		panelVisual.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 740, 95);
		panelVisual.add(scrollPane);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(0, 0, 740, 95);
		textArea_1.setEnabled(false);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	    scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		scrollPane.setViewportView(textArea_1);

	}


	protected void aboutButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Felipe Fronza Marcos \nRenato Constancio Filho");
	}


	protected void compileButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ctrl + F9 testeando");	
		
	}


	protected void cutButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ctrl + X testeando");		
	}


	protected void pasteButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ctrl + V testeando");
		
	}


	protected void copyButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ctrl + C testeando");
	}


	protected void saveButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ctrl + S testeando");
		
	}


	protected void openButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ctrl + O testeando");
		
	}


	protected void newButton(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Ctrl + N testeando");
	}
}
