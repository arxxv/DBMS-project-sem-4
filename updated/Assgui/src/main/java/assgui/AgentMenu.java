/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgui;

/**
 *
 * @author Arnav Shindolkar
 */
public class AgentMenu extends javax.swing.JFrame {

    /**
     * Creates new form AgentMenu
     */
//    static int agent_id = AgentLogin.agent_id;
    public static String displayestates_q;
    int agent_id;

    public AgentMenu(int aid) {
        initComponents();
        this.agent_id = aid;
        aid_label.setText(String.valueOf(aid));
        aid_label.paintImmediately(aid_label.getVisibleRect());
        this.search_estate = new searchEstate();
    }
    searchEstate search_estate;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agent_menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        update_estate_agent = new javax.swing.JButton();
        show_all_agent = new javax.swing.JButton();
        search_estate_btn = new javax.swing.JButton();
        aid_label = new javax.swing.JLabel();

        agent_menu.setText("Agent Menu");
        agent_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agent_menuActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agent Menu");

        update_estate_agent.setText("Sell/Rent an Estate");
        update_estate_agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_estate_agentActionPerformed(evt);
            }
        });

        show_all_agent.setText("Display the Listed Estates");
        show_all_agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_all_agentActionPerformed(evt);
            }
        });

        search_estate_btn.setText("Search Estates");
        search_estate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_estate_btnActionPerformed(evt);
            }
        });

        aid_label.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(show_all_agent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update_estate_agent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search_estate_btn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(aid_label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aid_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_all_agent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update_estate_agent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search_estate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agent_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agent_menuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_agent_menuActionPerformed

    private void update_estate_agentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_estate_agentActionPerformed
        // TODO add your handling code here:
        Update_estate_agent sell_rent_estate = new Update_estate_agent(agent_id);
        sell_rent_estate.setVisible(true);
        sell_rent_estate.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_update_estate_agentActionPerformed

    private void show_all_agentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_all_agentActionPerformed
        // TODO add your handling code here:
        displayestates_q = "select estate_id as ID,name as Name, concat(city,', ',state) as Address, date_sold_or_rented as 'Date of Last Sale', sale_or_rent as Type, available as Availability,floor_space as 'Floor Space', no_of_bedrooms as '#Bedrooms',price_or_rent_pm as 'Amount(Rs)', o_id as 'Owner ID' from agent natural join estate natural join estate_details where a_id=" + agent_id + ";";
        show_all_estates_agent listEstates = new show_all_estates_agent(agent_id);
        listEstates.setVisible(true);
        listEstates.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // System.out.println(agent_id);

    }//GEN-LAST:event_show_all_agentActionPerformed

    private void search_estate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_estate_btnActionPerformed
        // TODO add your handling code here:
        search_estate.setVisible(true);
        search_estate.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_search_estate_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentMenu(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agent_menu;
    private javax.swing.JLabel aid_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton search_estate_btn;
    private javax.swing.JButton show_all_agent;
    private javax.swing.JButton update_estate_agent;
    // End of variables declaration//GEN-END:variables
}
