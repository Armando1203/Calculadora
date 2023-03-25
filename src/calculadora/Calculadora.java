
package calculadora;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    boolean modoOscuro = false;

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/iconapp.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Operacion = new javax.swing.JLabel();
        txt_Resultado = new javax.swing.JLabel();
        btn_Color = new javax.swing.JButton();
        btn_Minimizar = new javax.swing.JLabel();
        btn_Cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_Operar = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        btn_Porcentaje = new javax.swing.JButton();
        btn_Division = new javax.swing.JButton();
        btn_Multiplicacion = new javax.swing.JButton();
        btn_Resta = new javax.swing.JButton();
        btn_Suma = new javax.swing.JButton();
        btn_BorrarTodo = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_00 = new javax.swing.JButton();
        btn_Punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Operacion.setFont(new java.awt.Font("Montserrat Alternates Light", 1, 18)); // NOI18N
        txt_Operacion.setForeground(new java.awt.Color(55, 62, 71));
        txt_Operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt_Operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, -1));

        txt_Resultado.setFont(new java.awt.Font("Montserrat Alternates SemiBold", 0, 48)); // NOI18N
        txt_Resultado.setForeground(new java.awt.Color(55, 62, 71));
        txt_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 320, 50));

        btn_Color.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/darkmode_1.png"))); // NOI18N
        btn_Color.setBorder(null);
        btn_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ColorActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        btn_Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_minimize.png"))); // NOI18N
        btn_Minimizar.setText("jLabel3");
        btn_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 10, 10));

        btn_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_exit.png"))); // NOI18N
        btn_Cerrar.setText("jLabel3");
        btn_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 10, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Operar.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        btn_Operar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Operar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btn_Operar.setText("=");
        btn_Operar.setBorder(null);
        btn_Operar.setFocusPainted(false);
        btn_Operar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Operar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Operar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Operar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OperarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Operar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        btn_Borrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Borrar.setForeground(new java.awt.Color(55, 62, 71));
        btn_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Borrar.setText("←");
        btn_Borrar.setBorder(null);
        btn_Borrar.setFocusPainted(false);
        btn_Borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btn_Porcentaje.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Porcentaje.setForeground(new java.awt.Color(55, 62, 71));
        btn_Porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Porcentaje.setText("%");
        btn_Porcentaje.setBorder(null);
        btn_Porcentaje.setFocusPainted(false);
        btn_Porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btn_Division.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Division.setForeground(new java.awt.Color(55, 62, 71));
        btn_Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Division.setText("/");
        btn_Division.setBorder(null);
        btn_Division.setFocusPainted(false);
        btn_Division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        btn_Multiplicacion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Multiplicacion.setForeground(new java.awt.Color(55, 62, 71));
        btn_Multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Multiplicacion.setText("X");
        btn_Multiplicacion.setBorder(null);
        btn_Multiplicacion.setFocusPainted(false);
        btn_Multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MultiplicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        btn_Resta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Resta.setForeground(new java.awt.Color(55, 62, 71));
        btn_Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Resta.setText("-");
        btn_Resta.setBorder(null);
        btn_Resta.setFocusPainted(false);
        btn_Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        btn_Suma.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Suma.setForeground(new java.awt.Color(55, 62, 71));
        btn_Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Suma.setText("+");
        btn_Suma.setBorder(null);
        btn_Suma.setFocusPainted(false);
        btn_Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        btn_BorrarTodo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_BorrarTodo.setForeground(new java.awt.Color(55, 62, 71));
        btn_BorrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_BorrarTodo.setText("C");
        btn_BorrarTodo.setBorder(null);
        btn_BorrarTodo.setFocusPainted(false);
        btn_BorrarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_BorrarTodo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_BorrarTodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_BorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarTodoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_BorrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        btn_8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        btn_7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btn_6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        btn_5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        btn_4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btn_3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        btn_2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btn_1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btn_0.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        btn_00.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_00.setForeground(new java.awt.Color(55, 62, 71));
        btn_00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_00.setText("00");
        btn_00.setBorder(null);
        btn_00.setFocusPainted(false);
        btn_00.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_00.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_00.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_00ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_00, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        btn_Punto.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_Punto.setForeground(new java.awt.Color(55, 62, 71));
        btn_Punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_Punto.setText(".");
        btn_Punto.setBorder(null);
        btn_Punto.setFocusPainted(false);
        btn_Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_Punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarTodoActionPerformed
        txt_Operacion.setText("");
        txt_Resultado.setText("");

        btn_1.setEnabled(true);
        btn_2.setEnabled(true);
        btn_3.setEnabled(true);
        btn_4.setEnabled(true);
        btn_5.setEnabled(true);
        btn_6.setEnabled(true);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
        btn_9.setEnabled(true);
        btn_0.setEnabled(true);
        btn_00.setEnabled(true);
        btn_Suma.setEnabled(true);
        btn_Resta.setEnabled(true);
        btn_Division.setEnabled(true);
        btn_Multiplicacion.setEnabled(true);
        btn_Punto.setEnabled(true);
        btn_Porcentaje.setEnabled(true);
        btn_Operar.setEnabled(true);
        btn_Borrar.setEnabled(true);
    }//GEN-LAST:event_btn_BorrarTodoActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        String texto = txt_Operacion.getText().substring(0, txt_Operacion.getText().length()-1);
        txt_Operacion.setText(texto);
        txt_Resultado.setText("");
    }//GEN-LAST:event_btn_BorrarActionPerformed

    private void btn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PorcentajeActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_PorcentajeActionPerformed

    private void btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DivisionActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_DivisionActionPerformed

    private void btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MultiplicacionActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btn_MultiplicacionActionPerformed

    private void btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestaActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_RestaActionPerformed

    private void btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SumaActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_SumaActionPerformed

    private void btn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntoActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btn_PuntoActionPerformed

    private void btn_OperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OperarActionPerformed
        
        if(txt_Operacion.getText() != "")
        {
            try
            {
                String resultado = se.eval(txt_Operacion.getText()).toString();
                txt_Resultado.setText(resultado);
            }
            catch (ScriptException ex)
            {
                //btn_BorrarTodo.doClick();
                txt_Operacion.setText("Error");
                btn_1.setEnabled(false);
                btn_2.setEnabled(false);
                btn_3.setEnabled(false);
                btn_4.setEnabled(false);
                btn_5.setEnabled(false);
                btn_6.setEnabled(false);
                btn_7.setEnabled(false);
                btn_8.setEnabled(false);
                btn_9.setEnabled(false);
                btn_0.setEnabled(false);
                btn_00.setEnabled(false);
                btn_Suma.setEnabled(false);
                btn_Resta.setEnabled(false);
                btn_Division.setEnabled(false);
                btn_Multiplicacion.setEnabled(false);
                btn_Punto.setEnabled(false);
                btn_Porcentaje.setEnabled(false);
                btn_Operar.setEnabled(false);
                btn_Borrar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn_OperarActionPerformed

    private void btn_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_00ActionPerformed
        addNumber("00");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_00ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_Operar.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ColorActionPerformed
        
        if(!modoOscuro)
        {
            jPanel1.setBackground(Color.decode("#212b41"));
            jPanel2.setBackground(Color.decode("#2e3951"));

            txt_Operacion.setForeground(Color.decode("#0db387"));
            txt_Resultado.setForeground(Color.decode("#0db387"));

            cambiarColorBotonesOscuros1(btn_BorrarTodo);
            cambiarColorBotonesOscuros1(btn_Borrar);
            cambiarColorBotonesOscuros1(btn_Porcentaje);
            cambiarColorBotonesOscuros1(btn_Division);
            cambiarColorBotonesOscuros1(btn_Multiplicacion);
            cambiarColorBotonesOscuros1(btn_Resta);
            cambiarColorBotonesOscuros1(btn_Suma);
            cambiarColorBotonesOscuros1(btn_Punto);

            cambiarColorBotonesOscuros2(btn_1);
            cambiarColorBotonesOscuros2(btn_2);
            cambiarColorBotonesOscuros2(btn_3);
            cambiarColorBotonesOscuros2(btn_4);
            cambiarColorBotonesOscuros2(btn_5);
            cambiarColorBotonesOscuros2(btn_6);
            cambiarColorBotonesOscuros2(btn_7);
            cambiarColorBotonesOscuros2(btn_8);
            cambiarColorBotonesOscuros2(btn_9);
            cambiarColorBotonesOscuros2(btn_0);
            cambiarColorBotonesOscuros2(btn_00);

            btn_Operar.setIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btn_Operar.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn3_dark.png")));
            btn_Operar.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn3_pressed_dark.png")));
            btn_Operar.setForeground(Color.decode("#212b41"));
            
            btn_Color.setIcon(new ImageIcon(getClass().getResource("/images/darkmode_2.png")));
            
            modoOscuro = true;
        }
        else
        {
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btn_ColorActionPerformed

    private void btn_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_CerrarMouseClicked

    private void btn_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btn_MinimizarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void cambiarColorBotonesOscuros1(JButton btn)
    {
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#0db387"));
    }
    
    public void cambiarColorBotonesOscuros2(JButton btn)
    {
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1_pressed_dark.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }
    
    public void addNumber(String digito){
        txt_Operacion.setText(txt_Operacion.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_00;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_BorrarTodo;
    private javax.swing.JLabel btn_Cerrar;
    private javax.swing.JButton btn_Color;
    private javax.swing.JButton btn_Division;
    private javax.swing.JLabel btn_Minimizar;
    private javax.swing.JButton btn_Multiplicacion;
    private javax.swing.JButton btn_Operar;
    private javax.swing.JButton btn_Porcentaje;
    private javax.swing.JButton btn_Punto;
    private javax.swing.JButton btn_Resta;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_Operacion;
    private javax.swing.JLabel txt_Resultado;
    // End of variables declaration//GEN-END:variables
}
