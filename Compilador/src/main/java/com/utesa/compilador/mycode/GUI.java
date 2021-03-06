/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utesa.compilador.mycode;


import com.utesa.compilador.entities.Entity;
import com.utesa.compilador.entities.Function;
import com.utesa.compilador.entities.Program;
import com.utesa.compilador.mycode.syntax.Parser;
import com.utesa.compilador.traductores.MyCodeToJavaScriptTranslator;
import com.utesa.compilador.util.Log;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rodolfo
 */
@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private StringWriter errors = new StringWriter();
    private Log log = new Log("MyCode", new PrintWriter(errors));
    private MyCodeToJavaScriptTranslator traslate = new MyCodeToJavaScriptTranslator();
    public GUI() {
        initComponents();
        setTitle("MyCode Compiler");
        setLocationRelativeTo(null);
        codigoFuente.setText("int a = 5;\n" +
"int b = 6;\n" +
"string s = \"Hola\";\n" +
"\n" +
"int suma(int a, int b){\n" +
"  return a + b;\n" +
"}\n" +
"\n" +
"void main(){\n" +
"int result = suma(a,b);\n" +
"}");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigoFuente = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tokens = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        analisisSintactico = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        javascript = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        analisisSemantico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        codigoIntermedio = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaSimbolos = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        codigoFuente.setColumns(20);
        codigoFuente.setRows(5);
        jScrollPane1.setViewportView(codigoFuente);

        tokens.setColumns(20);
        tokens.setRows(5);
        jScrollPane2.setViewportView(tokens);

        analisisSintactico.setColumns(20);
        analisisSintactico.setRows(5);
        jScrollPane3.setViewportView(analisisSintactico);

        javascript.setColumns(20);
        javascript.setRows(5);
        jScrollPane4.setViewportView(javascript);

        analisisSemantico.setColumns(20);
        analisisSemantico.setRows(5);
        jScrollPane5.setViewportView(analisisSemantico);

        jLabel1.setText("Tokens");

        jLabel2.setText("Analisis Sintactico");

        jLabel3.setText("Analisis Semantico");

        jLabel4.setText("Traduccion a JavaScript");

        jLabel5.setText("Codigo Fuente");

        codigoIntermedio.setColumns(20);
        codigoIntermedio.setRows(5);
        jScrollPane6.setViewportView(codigoIntermedio);

        tablaSimbolos.setColumns(20);
        tablaSimbolos.setRows(5);
        jScrollPane7.setViewportView(tablaSimbolos);

        jLabel6.setText("Codigo Intermedio");

        jLabel7.setText("Tabla de Simbolos");

        jButton2.setText("Guardar Js");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addComponent(jScrollPane5))
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                        .addComponent(jScrollPane3))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane7))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void verTablaSimbolos() {
        try {
            Program program = analizar();
            if (log.getErrorCount() > 0) {
                this.tablaSimbolos.setBackground(Color.ORANGE);
                this.tablaSimbolos.setText(errors.toString());
            } else {

                this.tablaSimbolos.setBackground(Color.GREEN);
                //program.get
                String str = "Nombre\tTipo\n";
                
                List<com.utesa.compilador.entities.Type> types = program.getTypes();
                List<com.utesa.compilador.entities.Variable> variables = program.getVariables();
                List<Function> functions = program.getFunctions();       
                
                for (com.utesa.compilador.entities.Type type: types) {
                  str=str+  type.getName()+"\t"+type.getId();
                }
                
                for (com.utesa.compilador.entities.Variable variable: variables) {
                  str=str+  variable.getName()+"\t"+variable.getTypename()+"\n";
                }
                
                for (com.utesa.compilador.entities.Function function: functions) {
                  str=str+  function.getName()+ "\t"+function.getReturnTypeName()+"\n";
                }
                
                
                
                this.tablaSimbolos.setText(str);
            }
        } catch (Exception e) {
            tablaSimbolos.setBackground(Color.RED);
            StringWriter writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            tablaSimbolos.setText(writer.toString());
        }
    }
    private void verTokens() {
        try {
            Program program = parse();
            
            if (log.getErrorCount() > 0) {
                this.tokens.setBackground(Color.ORANGE);
                this.tokens.setText(errors.toString());
            } else {
                StringWriter writer = new StringWriter();
                program.printTokens(new PrintWriter(writer));
                this.tokens.setBackground(Color.GREEN);
                this.tokens.setText(writer.toString());
            }
        } catch (Exception e) {
            tokens.setBackground(Color.RED);
            StringWriter writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            tokens.setText(writer.toString());
        }
    }
    private void verCodigoIntermedio() {
        try {
            Program program = optimizarCodigo();
            if (log.getErrorCount() > 0) {
                    codigoIntermedio.setBackground(Color.ORANGE);
                    codigoIntermedio.setText(errors.toString());
            } else {
                StringWriter writer = new StringWriter();
                program.printEntities(new PrintWriter(writer));
                codigoIntermedio.setBackground(Color.GREEN);
                codigoIntermedio.setText(writer.toString());                
            }
        } catch (Exception e) {
            codigoIntermedio.setBackground(Color.RED);
            StringWriter writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            codigoIntermedio.setText(writer.toString());
        }
    }
    private void verAnalisisSemantico() {
        try {
            Program program = analizar();
            if (log.getErrorCount() > 0) {
                analisisSemantico.setBackground(Color.ORANGE);
                analisisSemantico.setText(errors.toString());
            } else {
                StringWriter writer = new StringWriter();
                program.printAnalisisSemanticio(new PrintWriter(writer));
                analisisSemantico.setBackground(Color.GREEN);
                analisisSemantico.setText(writer.toString());
            }
        } catch (Exception e) {
            analisisSemantico.setBackground(Color.RED);
            StringWriter writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            analisisSemantico.setText(writer.toString());
        }
    }
    private void verArbolSintactico() {
        try {
            Program program = parse();
            if (log.getErrorCount() > 0) {
                analisisSintactico.setBackground(Color.ORANGE);
                analisisSintactico.setText(errors.toString());
            } else {
                StringWriter writer = new StringWriter();
                program.printSyntaxTree("", "", new PrintWriter(writer));
                analisisSintactico.setBackground(Color.GREEN);
                analisisSintactico.setText(writer.toString());
            }
        } catch (Exception e) {
            analisisSintactico.setBackground(Color.RED);
            StringWriter writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            analisisSintactico.setText(writer.toString());
        }
    }
    private void verJavaScript() {
        try {

            StringWriter writer = toJavaScript();

            if (log.getErrorCount() > 0) {
                javascript.setBackground(Color.ORANGE);
                javascript.setText(errors.toString());
            } else {
                javascript.setBackground(Color.GREEN);
                 javascript.setText(writer.toString());
            }
        } catch (Exception e) {
            javascript.setBackground(Color.RED);
            StringWriter writer = new StringWriter();
            e.printStackTrace(new PrintWriter(writer));
            javascript.setText(writer.toString());
        }
    }
    
    private StringWriter toJavaScript() {

        Program program = optimizarCodigo();

        if (log.getErrorCount() > 0){return null;}
        StringWriter writer = new StringWriter();
        
        PrintWriter pw = new PrintWriter(writer);
        
        //MyCodeToJavaScriptTranslator tl = new MyCodeToJavaScriptTranslator();
        
        traslate.translateProgram(program, pw);
        
        //new MyCodeToJavaScriptTranslator().translateProgram(program, new PrintWriter(writer));
        return writer;
    }
    
    private Program optimizarCodigo() {
        Program program = analizar();
        if (log.getErrorCount() > 0) return null;
        program.optimize();
        return program;
    }
    
    private Program analizar() {
        Program program = parse();
        if (log.getErrorCount() > 0) return null;
        program.analyze(Entity.AnalysisContext.makeGlobalContext(log));
        return program;
    }
    
    private Program parse() {
        log.clearErrors();
        errors.getBuffer().setLength(0);
        Reader reader = new StringReader(codigoFuente.getText());
        return new Parser(reader).parse(reader, log);
    }


    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        verArbolSintactico();
        verAnalisisSemantico();
        verCodigoIntermedio();
        verTokens();
        verTablaSimbolos();
        verJavaScript();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(log.getErrorCount()>0 || javascript.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Error: Debe analizar el codigo fuente primero!");
        }else{
            try {
  
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Espesifique el lugar y Nombre del Archivo a guardar");   
                
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Js File", "js"));

                int userSelection = fileChooser.showSaveDialog(this);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    PrintWriter pw = new PrintWriter(fileToSave);
                    pw.println(javascript.getText());
                    pw.close();
                    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
                    JOptionPane.showMessageDialog(rootPane, "Archivo guardado exitosamente!");
                }
                
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea analisisSemantico;
    private javax.swing.JTextArea analisisSintactico;
    private javax.swing.JTextArea codigoFuente;
    private javax.swing.JTextArea codigoIntermedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea javascript;
    private javax.swing.JTextArea tablaSimbolos;
    private javax.swing.JTextArea tokens;
    // End of variables declaration//GEN-END:variables
}
