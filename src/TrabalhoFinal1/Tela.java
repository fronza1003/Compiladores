/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal1;

import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import Lexico.Constants;
import Lexico.LexicalError;
import Lexico.Lexico;
import Lexico.Lexico2;
import Lexico.ScannerConstants;
import Lexico.Token;
import VerificaLinha.CodeConverter;
import VerificaLinha.LineScanner;

/**
 *
 * @author asus
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form UltimaTentativa
     */
    public Tela() {
        initComponents();
        jButtonNew.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "Novo");
        jButtonNew.getActionMap().put("Novo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //JOptionPane.showMessageDialog(null, "Ctrl + N");
                jButtonNewActionPerformed(ae);
            }
        });
        jButtonOpen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK), "Open");
        jButtonOpen.getActionMap().put("Open", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonOpenActionPerformed(ae);
            }
        });
        jButtonSave.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK), "Save");
        jButtonSave.getActionMap().put("Save", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonSaveActionPerformed(ae);
            }
        });

        jButtonCopy.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK), "Copy");
        jButtonCopy.getActionMap().put("Copy", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonCopyActionPerformed(ae);
            }
        });

        jButtonPaste.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK), "Paste");
        jButtonPaste.getActionMap().put("Paste", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonPasteActionPerformed(ae);
            }
        });

        jButtonCut.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK), "Cut");
        jButtonCut.getActionMap().put("Cut", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonCutActionPerformed(ae);
            }
        });

        jButtonAbout.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F1"), "About");
        jButtonAbout.getActionMap().put("About", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jButtonAboutActionPerformed(ae);
            }
        });

        jButtonCompile.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("F9"), "About");
        jButtonCompile.getActionMap().put("About", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
					jButtonCompileActionPerformed(ae);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelEsquerda = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonOpen = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCopy = new javax.swing.JButton();
        jButtonPaste = new javax.swing.JButton();
        jButtonCut = new javax.swing.JButton();
        jButtonCompile = new javax.swing.JButton();
        jButtonAbout = new javax.swing.JButton();
        jPanelCenter = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 620));
        setPreferredSize(new java.awt.Dimension(900, 620));

        jLabel2.setText(" ");
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jButtonNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/new.png"))); // NOI18N
        jButtonNew.setText("New [Ctrl + N]");
        jButtonNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/open.png"))); // NOI18N
        jButtonOpen.setText("Open [Ctrl + O]");
        jButtonOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpenActionPerformed(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/save.png"))); // NOI18N
        jButtonSave.setText("Save [Ctrl + S]");
        jButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/copy.png"))); // NOI18N
        jButtonCopy.setText("Copy [Ctrl + C]");
        jButtonCopy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCopy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });

        jButtonPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/paste.png"))); // NOI18N
        jButtonPaste.setText("Paste [Ctrl + V]");
        jButtonPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasteActionPerformed(evt);
            }
        });

        jButtonCut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cut.png"))); // NOI18N
        jButtonCut.setText("Cut [Ctrl + X]");
        jButtonCut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCutActionPerformed(evt);
            }
        });

        jButtonCompile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/compile.png"))); // NOI18N
        jButtonCompile.setText("Compile [F9]");
        jButtonCompile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCompile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonCompileActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButtonAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/about.png"))); // NOI18N
        jButtonAbout.setText("About [F1]");
        jButtonAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAbout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAbout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutActionPerformed(evt);
            }
        });
        jButtonAbout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAboutKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEsquerdaLayout = new javax.swing.GroupLayout(jPanelEsquerda);
        jPanelEsquerda.setLayout(jPanelEsquerdaLayout);
        jPanelEsquerdaLayout.setHorizontalGroup(
            jPanelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEsquerdaLayout.createSequentialGroup()
                .addGroup(jPanelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCompile, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelEsquerdaLayout.setVerticalGroup(
            jPanelEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEsquerdaLayout.createSequentialGroup()
                .addComponent(jButtonNew, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonCut, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonCompile, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 102, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelEsquerda, java.awt.BorderLayout.LINE_START);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new NumberedBorder());
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 105));
        jPanel2.setRequestFocusEnabled(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {                                            
        final JFileChooser fc = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt");
        fc.setFileFilter(filter);

        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {            
            arquivoAtual = fc.getSelectedFile();
        } else {
            return;
        }
        
        
        try {
            jTextArea1.setText(Arquivo.leTodasAsLinhas(arquivoAtual));
            jLabel2.setText(arquivoAtual.getName() + ": " + arquivoAtual.getPath());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Deu erro " + e.getMessage());
        }

    }                                           

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        jTextArea1.setText("");
        jTextArea2.setText("");
        jLabel2.setText(" ");
        arquivoAtual = null;

    }                                          

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        if (arquivoAtual == null) {
            //Arquivo novo
            final JFileChooser fc = new JFileChooser();

            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto", "txt");
            fc.setFileFilter(filter);

            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    String nomeArquivo = fc.getSelectedFile().toString() + ".txt";
            arquivoAtual = Paths.get(nomeArquivo).toFile();
                    

                    Arquivo.escreveNoArquivo(jTextArea1.getText(), arquivoAtual);
                    jTextArea2.setText("");
                    jLabel2.setText(arquivoAtual.getName() + ": " + arquivoAtual.getPath());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Deu erro" + ex.getMessage());
                }
            } else {
                
            }

        }else{
            try {
                    Arquivo.escreveNoArquivo(jTextArea1.getText(), arquivoAtual);
                    jTextArea2.setText(" ");
                    jLabel2.setText(arquivoAtual.getName() + ": " + arquivoAtual.getPath());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Deu erro" + ex.getMessage());
                }
        }
    }                                           

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {                                            
       jTextArea1.copy();
    }                                           

    private void jButtonPasteActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextArea1.paste();
    }                                            

    private void jButtonCutActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextArea1.cut();
    }                                          

    private void jButtonCompileActionPerformed(java.awt.event.ActionEvent evt) throws IOException {                                               
    	
    	jButtonSaveActionPerformed(evt);
    	//Lexico lexico = new Lexico();
    	Lexico lexico = new Lexico();
    	//Buscar o nome de identificacao
    	CodeConverter codCon = new CodeConverter(); 
    	//Buscar a linha
    	LineScanner scan = new LineScanner(jTextArea1.getText());
    	

    	//...
    	lexico.setInput(Arquivo.leTodasAsLinhas(arquivoAtual));
    	//...
    	try {
    	    Token t = null;
    	    while ( (t = lexico.nextToken()) != null ) {
    	        System.out.println("Id: "+codCon.idToLex(t.getId())+" Lexema: "+t.getLexeme()+" Posi��o: "+t.getPosition());
    	    }
    	}
    	catch ( LexicalError e ) {
    	    System.err.println(e.getMessage() + " em " + e.getPosition());
    	}
    }                                              

    private void jButtonAboutActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextArea2.setText("Felipe Fronza Marcos, Renato Constancio Filho");
    }                                            

    private void jButtonAboutKeyPressed(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAbout;
    private javax.swing.JButton jButtonCompile;
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonCut;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOpen;
    private javax.swing.JButton jButtonPaste;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelEsquerda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration                   
    private File arquivoAtual;
}
