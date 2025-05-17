import javax.swing.JButton;


public class Calculator extends javax.swing.JFrame {

    private String display = "0";
    private double firstNum = 0;
    private String operator = "";
    private boolean newInput = true;

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        displayField = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        add = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        mod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        displayField.setBackground(new java.awt.Color(229, 229, 229));
        displayField.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        displayField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayField.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));

        one.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        one.setText("1");
        one.setBorderPainted(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        two.setText("2");
        two.setBorderPainted(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        three.setText("3");
        three.setBorderPainted(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        four.setText("4");
        four.setBorderPainted(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        five.setText("5");
        five.setBorderPainted(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        six.setText("6");
        six.setBorderPainted(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        eight.setText("8");
        eight.setBorderPainted(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        seven.setText("7");
        seven.setBorderPainted(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nine.setText("9");
        nine.setBorderPainted(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        decimal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        decimal.setText(".");
        decimal.setBorderPainted(false);
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        zero.setText("0");
        zero.setBorderPainted(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(204, 153, 0));
        equals.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equals.setText("=");
        equals.setBorderPainted(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(54, 133, 213));
        add.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add.setForeground(new java.awt.Color(229, 229, 229));
        add.setText("+");
        add.setBorderPainted(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(54, 133, 213));
        multiply.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        multiply.setForeground(new java.awt.Color(229, 229, 229));
        multiply.setText("*");
        multiply.setBorderPainted(false);
        multiply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(54, 133, 213));
        divide.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        divide.setForeground(new java.awt.Color(229, 229, 229));
        divide.setText("/");
        divide.setBorderPainted(false);
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        subtract.setBackground(new java.awt.Color(54, 133, 213));
        subtract.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subtract.setForeground(new java.awt.Color(229, 229, 229));
        subtract.setText("-");
        subtract.setBorderPainted(false);
        subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 153, 153));
        clear.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        clear.setText("C");
        clear.setBorderPainted(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(255, 153, 153));
        backspace.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        backspace.setText("<");
        backspace.setBorderPainted(false);
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        mod.setBackground(new java.awt.Color(54, 133, 213));
        mod.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        mod.setForeground(new java.awt.Color(229, 229, 229));
        mod.setText("%");
        mod.setBorderPainted(false);
        mod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(seven, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                                        .addComponent(equals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(displayField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(displayField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void numPressed(String val) {
        if (newInput) {
            display = val.equals(".") ? "0." : val;
            newInput = false;
        } else if (!(val.equals(".") && display.contains("."))) {
            display += val;
        }
        displayField.setText(display);
    }


    public void oprPressed(String opr) {
        if (!operator.isEmpty() && !newInput) {
            equals();  // Calculate pending operation first
        }

        firstNum = Double.parseDouble(display);
        operator = opr;
        newInput = true;
    }


    public void equals() {
        if (operator.isEmpty() || newInput) return;

        double secondNum = Double.parseDouble(display);
        double result = 0;

        switch (operator) {
            case "+": result = firstNum + secondNum; break;
            case "-": result = firstNum - secondNum; break;
            case "*": result = firstNum * secondNum; break;
            case "/":
                if (secondNum != 0) result = firstNum / secondNum;
                else { clear(); displayField.setText("Error"); return; }
                break;
            case "%": result = firstNum % secondNum; break;
        }


        display = (result == (long)result || result - (long)result < 0.0001) ? String.valueOf((long)result) : String.valueOf(result);
        displayField.setText(display);

        firstNum = result;
        operator = "";
        newInput = true;
    }


    public void clear() {
        display = "0";
        firstNum = 0;
        operator = "";
        newInput = true;
        displayField.setText(display);
    }


    public void backspace() {
        if (newInput) return;

        display = display.length() > 1 ? display.substring(0, display.length() - 1) : "0";
        if (display.equals("0")) newInput = true;
        displayField.setText(display);
    }

    private void modActionPerformed(java.awt.event.ActionEvent evt) {

        oprPressed(mod.getText());

    }

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {

        backspace();

    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {

        clear();
    }

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {

        oprPressed(subtract.getText());

    }

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {

        oprPressed(divide.getText());

    }

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {

        oprPressed(multiply.getText());

    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {

        oprPressed(add.getText());

    }

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {

        equals();
    }

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {

        numPressed(zero.getText());
    }

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {

        numPressed(decimal.getText());
    }

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {

        numPressed(nine.getText());
    }

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {

        numPressed(seven.getText());
    }

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {

        numPressed(eight.getText());
    }

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {

        numPressed(six.getText());
    }

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {

        numPressed(five.getText());
    }

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {
        numPressed(four.getText());
    }

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {
        numPressed(three.getText());
    }

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {
        numPressed(two.getText());
    }

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {
        numPressed(one.getText());
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton add;
    private javax.swing.JButton backspace;
    private javax.swing.JButton clear;
    private javax.swing.JButton decimal;
    private javax.swing.JLabel displayField;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mod;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton subtract;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration
}
