package notebook;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.Document;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

public class MainInterface extends javax.swing.JFrame {
    private UndoManager undoManager;
    int c=0,pos=0;
    String filepath;
    public MainInterface() {
                
                initComponents();
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                 String[] fontNames = ge.getAvailableFontFamilyNames();
                 for(int i=0;i<fontNames.length;i++){
                        jComboBox3.addItem(fontNames[i]);
                 }
    jTextArea1.setEditable(false);
    undoManager = new UndoManager();
    Document doc = jTextPane1.getDocument();
    doc.addUndoableEditListener(new UndoableEditListener() {
    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        undoManager.addEdit(e.getEdit());
        }
    });
    InputMap im = jTextPane1.getInputMap(JComponent.WHEN_FOCUSED);
    ActionMap am =jTextPane1.getActionMap();
    
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()), "Undo");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()), "Redo");

    am.put("Undo", new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (undoManager.canUndo()) {
                undoManager.undo();
            }
        } catch (CannotUndoException exp) {}}});
    am.put("Redo", new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (undoManager.canRedo()) {
                undoManager.redo();
            }
        } catch (CannotUndoException exp) {}}});}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jDialog2 = new javax.swing.JDialog();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16))
        );

        jButton3.setText("Replace");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Find");

        jLabel2.setText("Replace");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addGap(53, 53, 53)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel3.setText("Version Details");

        jLabel4.setText("Version number:");

        jLabel5.setText("Version 1.0");

        jLabel6.setText("Year:");

        jLabel7.setText("2017");

        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(48, 48, 48))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9", "10", "11", "12", "13", "14", "18", "24", "36", "48", "64", "72", "96", "144", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Italic", "Bold", "Bold Italic" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton6.setText("Ok");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setText("Size");

        jLabel10.setText("Style");

        jLabel11.setText("Family");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton6))
        );

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setText("             HELP");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Shortcuts:-\nnew file:-cntr+n\nopen file:-cntr+o\nSave file:-cntr+s\nSave file to new destination:-cntr+b\nPrint file:-cntr+p\nUndo:-cntr+z\nRedo:-cntr+y\nCut:-cntr+x\nCopy:-cntr+c\nPaste:-cntr+v\nDelete:-cntr+d\n\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextPane1);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Save As");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Print");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Exit");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Undo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setText("Redo");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Cut");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Copy");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Paste");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Delete");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Search");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Find");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Replace");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Format");

        jMenuItem14.setText("Font");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem16.setText("Border Color");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem22.setText("Text Color");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem22);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Encode");

        jMenuItem20.setText("Encode");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenuItem21.setText("Decode");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenuBar1.add(jMenu7);

        jMenu6.setText("Help");

        jMenuItem17.setText("View Help");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem18.setText("Version");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        String s=jTextPane1.getText();
            JFileChooser fc=new JFileChooser();    
            int i=fc.showSaveDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){    
            File f=fc.getSelectedFile();    
            filepath=f.getPath(); 
            int a=filepath.lastIndexOf("/");
            String name=filepath.substring(a+1,filepath.length()); 
            }
            try{
             PrintWriter writer = new PrintWriter(filepath, "UTF-8");
             writer.println(s);
             
             writer.close();
            } catch (IOException e) {
                // do something
        }
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jTextPane1.cut();
    }                                          

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        jFrame1.setSize(450,300);
        jFrame1.setVisible(true);
    }                                           

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(c==0){
            c=1;
            String s=jTextPane1.getText();
            JFileChooser fc=new JFileChooser();    
            int i=fc.showSaveDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){    
            File f=fc.getSelectedFile();    
            filepath=f.getPath(); 
            int a=filepath.lastIndexOf("/");
            String name=filepath.substring(a+1,filepath.length()); 
            }
            try{
             PrintWriter writer = new PrintWriter(filepath, "UTF-8");
             writer.println(s);
             
             writer.close();
            } catch (IOException e) {
                // do something
        }
      }
        else{
            String s=jTextPane1.getText();
            try{
             PrintWriter writer = new PrintWriter(filepath, "UTF-8");
             writer.println(s);
             
             writer.close();
            } catch (IOException e) {
                // do something
        }
        }
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION){
            File f=fc.getSelectedFile();    
            filepath=f.getPath(); 
            int q;
            String s="";
            try{
            FileReader fi=new FileReader(filepath);
            while((q=fi.read())!=-1){
                s=s+(char)q;
            }
            jTextPane1.setText(s);
            }catch(Exception e){}
        }
    }                                          

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           

         int dialogButton = JOptionPane.YES_NO_OPTION;
         int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
          if(dialogResult == JOptionPane.YES_OPTION){
            if(c==0){
            c=1;
            String s=jTextPane1.getText();
            JFileChooser fc=new JFileChooser();    
            int i=fc.showSaveDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){    
            File f=fc.getSelectedFile();    
            filepath=f.getPath(); 
            int a=filepath.lastIndexOf("/");
            String name=filepath.substring(a+1,filepath.length()); 
            }
            try{
             PrintWriter writer = new PrintWriter(filepath, "UTF-8");
             writer.println(s);
             
             writer.close();
            } catch (IOException e) {
                // do something
        }
      }
        else{
            String s=jTextPane1.getText();
            try{
             PrintWriter writer = new PrintWriter(filepath, "UTF-8");
             writer.println(s);
             
             writer.close();
            } catch (IOException e) {
                // do something
        }
        }
           }
          else{
              jTextPane1.setText("");
          }
    }                                          

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
                    if(c==0){
        int dialogButton = JOptionPane.YES_NO_OPTION;
         int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);
          if(dialogResult == JOptionPane.YES_OPTION){

            c=1;
            String s=jTextPane1.getText();
            JFileChooser fc=new JFileChooser();    
            int i=fc.showSaveDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){    
            File f=fc.getSelectedFile();    
            filepath=f.getPath(); 
            int a=filepath.lastIndexOf("/");
            String name=filepath.substring(a+1,filepath.length()); 
            }
            try{
             PrintWriter writer = new PrintWriter(filepath, "UTF-8");
             writer.println(s);
             
             writer.close();
            } catch (IOException e) {
                // do something
        }
      }
        else{
            String s=jTextPane1.getText();
            try{
             PrintWriter writer = new PrintWriter(filepath, "UTF-8");
             writer.println(s);
             
             writer.close();
            } catch (IOException e) {
                // do something
        }
        }
           }
        System.exit(1);
    }                                          

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jTextPane1.copy();
    }                                          

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        jTextPane1.paste();
    }                                           

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {
            if (undoManager.canUndo()) {
                undoManager.undo();
            }
        } catch (CannotUndoException exp) {}
    }                                          

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        int s=jTextPane1.getSelectionStart();
        int e=jTextPane1.getSelectionEnd();
        String text=jTextPane1.getText();
        jTextPane1.setText(text.substring(0,s)+text.substring(e+1,text.length()));
    }                                           

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {                                            

        jDialog1.setSize(300,150);
        jDialog1.setVisible(true);
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String f=jTextField1.getText();
        jTextPane1.requestFocusInWindow();
        if(f!=null && f.length()>0){
            Document d=jTextPane1.getDocument();
            int l=f.length();
            try{
                boolean found=false;
                if(pos+l>d.getLength()){
                    pos=0;
                }
                while(pos+l<=d.getLength()){
                    String match=d.getText(pos,l).toLowerCase();
                    if(match.equals(f)){
                        found=true;
                        break;
                    }
                    pos++;
                }
                if(found){
                    Rectangle r=jTextPane1.modelToView(pos);
                    jTextPane1.scrollRectToVisible(r);
                    jTextPane1.setCaretPosition(pos+l);
                    jTextPane1.moveCaretPosition(pos);
                    pos+=l;
                }
            }catch(Exception ex){}
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText("");
        jDialog1.setVisible(false);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String f=jTextField2.getText();
        String r=jTextField3.getText();
        jTextPane1.requestFocusInWindow();
        String s=jTextPane1.getText();
        String s1;
        int p=0;
        while(p<=s.length()-f.length()){
            if(s.substring(p,p+f.length()).equalsIgnoreCase(f)){
                s1=s.substring(0,p)+r+s.substring(p+f.length(),s.length());
                s=s1;
            }
            p++;
        } 
        jTextPane1.setText(s);
        jDialog2.setVisible(false);
        jTextField2.setText("");
        jTextField3.setText("");
    }                                        

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        jDialog2.setSize(300,150);
        jDialog2.setVisible(true);
    }                                           

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jDialog2.setVisible(false);
        jTextField2.setText("");
        jTextField3.setText("");
    }                                        

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(Check.isBinary(jTextPane1.getText())==0){
            JOptionPane.showMessageDialog(this, "Already encoded", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Endecode e=new Endecode();
            String s=jTextPane1.getText();
            String pass = JOptionPane.showInputDialog(this,"Enter 4 digits(numeric)", "Enter password", JOptionPane.INFORMATION_MESSAGE);
            if(pass.length()!=4){
                JOptionPane.showMessageDialog(this, "Wrong password format it should be 4 digits", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                String n=e.encode(s, pass);
                jTextPane1.setText(n);
            }
        }
    }                                           

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(Check.isBinary(jTextPane1.getText())==1){
            JOptionPane.showMessageDialog(this, "Already decoded", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        Endecode e=new Endecode();
        String s=jTextPane1.getText();
        String pass = JOptionPane.showInputDialog(this,"Enter 4 digits(numeric)", "Enter password", JOptionPane.INFORMATION_MESSAGE);
        String n=e.decode(s);
        String p=n.substring(0,4);
        String a=n.substring(5,n.length());
        if(pass.equals(p)){
            jTextPane1.setText(a);
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong password", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }                                           

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        jDialog3.setSize(350,200);
        jDialog3.setVisible(true);
    }                                           

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jDialog3.setVisible(false);
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jFrame1.setVisible(false);
    }                                        

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           

        int a=Integer.parseInt((String)jComboBox2.getSelectedItem());
        String special=(String)jComboBox1.getSelectedItem();
        Font f;
        if(special=="Bold")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.BOLD,a);
        else if(special=="Italic")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.ITALIC,a);
        else if(special=="Regular")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.PLAIN,a);
        else
            f=new Font((String)jComboBox3.getSelectedItem(),Font.BOLD+Font.ITALIC,a);
        jLabel9.setFont(f);
        jTextPane1.setFont(f);
        jLabel9.setText("Demo");
    }                                          

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int a=Integer.parseInt((String)jComboBox2.getSelectedItem());
        String special=(String)jComboBox1.getSelectedItem();
        Font f;
        if(special=="Bold")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.BOLD,a);
        else if(special=="Italic")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.ITALIC,a);
        else if(special=="Regular")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.PLAIN,a);
        else
            f=new Font((String)jComboBox3.getSelectedItem(),Font.BOLD+Font.ITALIC,a);
        jLabel9.setFont(f);
        jTextPane1.setFont(f);
        jLabel9.setText("Demo");
    }                                          

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int a=Integer.parseInt((String)jComboBox2.getSelectedItem());
        String special=(String)jComboBox1.getSelectedItem();
        Font f;
        if(special=="Bold")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.BOLD,a);
        else if(special=="Italic")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.ITALIC,a);
        else if(special=="Regular")
            f=new Font((String)jComboBox3.getSelectedItem(),Font.PLAIN,a);
        else
            f=new Font((String)jComboBox3.getSelectedItem(),Font.BOLD+Font.ITALIC,a);
        jLabel9.setFont(f);
        jTextPane1.setFont(f);
        jLabel9.setText("Demo");
    }                                          

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        try {
            if (undoManager.canRedo()) {
                undoManager.redo();
            }
        } catch (CannotUndoException exp) {}
    }                                           

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Color color=JColorChooser.showDialog(this,"Select a color",Color.BLACK);    
       getContentPane().setBackground(color);
    }                                           

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Color color=JColorChooser.showDialog(this,"Select a color",Color.BLACK);    
        jTextPane1.setForeground(color);
    }                                           

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        jFrame2.setSize(412,358);
        jFrame2.setVisible(true);
    }                                           

    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration                   
}
