package pharmacy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bustamantecr_sd2022
 */
import drugstore.Validate;
import drugstore.Database;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DrugStore_UI extends JFrame {

    /**
     * Creates new form DrugStore_UI
     */
    public DrugStore_UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        unameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        cpassLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        unameField = new javax.swing.JTextField();
        passFiedl = new javax.swing.JPasswordField();
        cpassField = new javax.swing.JPasswordField();
        registerButtom = new javax.swing.JButton();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        unamelabelL = new javax.swing.JLabel();
        passlabelL = new javax.swing.JLabel();
        unameFieldL = new javax.swing.JTextField();
        passFieldL = new javax.swing.JPasswordField();
        dontLabel = new javax.swing.JLabel();
        registerLabelL = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerPanel.setBackground(new java.awt.Color(102, 204, 255));
        registerPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                registerPanelPropertyChange(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nameLabel.setText("Name :");

        unameLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        unameLabel.setText("Username : ");

        passLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        passLabel.setText(" Password :");

        cpassLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cpassLabel.setText("Confirm Password :");

        registerButtom.setText("Register");
        registerButtom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtomMouseClicked(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ageLabel.setText("Age :");

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        registerLabel.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        registerLabel.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(registerLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passLabel)
                    .addComponent(cpassLabel)
                    .addComponent(unameLabel)
                    .addComponent(ageLabel)
                    .addComponent(nameLabel))
                .addContainerGap(382, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(passFiedl, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpassField, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(unameField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(nameLabel)
                .addGap(18, 18, 18)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ageLabel)
                .addGap(18, 18, 18)
                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(unameLabel)
                .addGap(18, 18, 18)
                .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLabel)
                .addGap(18, 18, 18)
                .addComponent(passFiedl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cpassLabel)
                .addGap(18, 18, 18)
                .addComponent(cpassField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(registerButtom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        loginPanel.setBackground(new java.awt.Color(102, 204, 255));
        loginPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                loginPanelPropertyChange(evt);
            }
        });

        unamelabelL.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        unamelabelL.setText("Username : ");

        passlabelL.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        passlabelL.setText("Password : ");

        dontLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dontLabel.setText("Don't have an account yet? ");

        registerLabelL.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        registerLabelL.setText("Register");
        registerLabelL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLabelLMouseClicked(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        loginLabel.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        loginLabel.setText("Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(loginLabel)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passlabelL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passFieldL, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unameFieldL, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unamelabelL)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(dontLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerLabelL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(unamelabelL)
                .addGap(18, 18, 18)
                .addComponent(unameFieldL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(passlabelL)
                .addGap(18, 18, 18)
                .addComponent(passFieldL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dontLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerLabelL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Validate validate = new Validate();
    Database db = new Database();
 
    private void registerPanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_registerPanelPropertyChange
        registerPanel.setVisible(true);
        loginButton.setVisible(false);
    }//GEN-LAST:event_registerPanelPropertyChange

    private void registerButtomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtomMouseClicked
        registerPanel.setVisible(false);
        loginPanel.setVisible(true);

        System.out.println("Mouse clicked to register");
        String name = nameField.getText();
        int age = Integer.valueOf(ageField.getText());
        String username = unameField.getText();
        String password = passFiedl.getText();
        String confirmPass = cpassField.getText();
        boolean isValid = validate.regValidator(name, username, password, confirmPass);
        if (isValid) { //if valid save to db
            db.saveData(name, age, username, password);
            System.out.println("Account is verified!");

        } else {
           JOptionPane.showMessageDialog(this, "You need to fill up all field!"); 
        }
        nameField.setText("");
        ageField.setText("");
        unameField.setText("");
        passFiedl.setText("");
        cpassField.setText("");


    }//GEN-LAST:event_registerButtomMouseClicked

    private void loginPanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_loginPanelPropertyChange
        registerPanel.setVisible(false);
        loginButton.setVisible(true);
    }//GEN-LAST:event_loginPanelPropertyChange

    private void registerLabelLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLabelLMouseClicked
        registerPanel.setVisible(true);
        loginPanel.setVisible(false);
    }//GEN-LAST:event_registerLabelLMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked

        System.out.println("Mouse clicked to login");
        String dbUsername = unameFieldL.getText();
        String dbPassword = passFieldL.getText();
        if (db.login(dbUsername, dbPassword)) {
            this.dispose();
            Dashboard_UI dashboard_UI = new Dashboard_UI();
            dashboard_UI.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Try Again!");
        }
        

        unameFieldL.setText("");
        passFieldL.setText("");
        
        
        


    }//GEN-LAST:event_loginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(DrugStore_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrugStore_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrugStore_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrugStore_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrugStore_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JPasswordField cpassField;
    private javax.swing.JLabel cpassLabel;
    private javax.swing.JLabel dontLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passFiedl;
    private javax.swing.JPasswordField passFieldL;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel passlabelL;
    private javax.swing.JButton registerButtom;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel registerLabelL;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JTextField unameField;
    private javax.swing.JTextField unameFieldL;
    private javax.swing.JLabel unameLabel;
    private javax.swing.JLabel unamelabelL;
    // End of variables declaration//GEN-END:variables
}
