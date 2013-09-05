/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiWell;

/**
 *
 * @author ramunnoj
 */
public class MultiWellGui extends javax.swing.JFrame {

    private WellController controller;

    /**
     * Creates new form MultiWellGui
     */
    public MultiWellGui() {
        initComponents();


    }

    public void setController(WellController temp) {
        controller = temp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadTemplate = new javax.swing.JButton();
        topLetCenter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rows = new javax.swing.JTextField();
        startRow = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cols = new javax.swing.JTextField();
        startCol = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        point2Button = new javax.swing.JButton();
        point3Button = new javax.swing.JButton();
        focalPlaneButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        overLapBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tileButton = new javax.swing.JButton();
        rowTile = new javax.swing.JTextField();
        colTile = new javax.swing.JTextField();
        showList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Multi-Well");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Define Grid from Template"));

        loadTemplate.setText("Load Template");
        loadTemplate.setEnabled(false);
        loadTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTemplateActionPerformed(evt);
            }
        });

        topLetCenter.setText("Top Left Center");
        topLetCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topLetCenterActionPerformed(evt);
            }
        });

        jLabel1.setText("Start:End Row");

        rows.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rows.setText("4");
        rows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rowsActionPerformed(evt);
            }
        });

        startRow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startRow.setText("1");

        jLabel2.setText("Start:End Column");

        cols.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cols.setText("8");
        cols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colsActionPerformed(evt);
            }
        });

        startCol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startCol.setText("1");
        startCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startColActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(loadTemplate)
                    .add(topLetCenter)
                    .add(jLabel1)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(startRow, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(rows, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel2)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(startCol, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cols, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {cols, rows, startCol, startRow}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(topLetCenter)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(loadTemplate)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(rows, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(startRow, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cols, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(startCol, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Find Focal Plane"));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        point2Button.setText("Reference Point 2");
        point2Button.setAlignmentX(0.5F);
        point2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point2ButtonActionPerformed(evt);
            }
        });
        jPanel2.add(point2Button);

        point3Button.setText("Reference Point 3");
        point3Button.setAlignmentX(0.5F);
        point3Button.setEnabled(false);
        point3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                point3ButtonActionPerformed(evt);
            }
        });
        jPanel2.add(point3Button);

        focalPlaneButton.setText("Find Focal Plane");
        focalPlaneButton.setAlignmentX(0.5F);
        focalPlaneButton.setEnabled(false);
        focalPlaneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                focalPlaneButtonActionPerformed(evt);
            }
        });
        jPanel2.add(focalPlaneButton);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Take Tiled Data"));

        jLabel3.setText("Overlap %");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        overLapBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        overLapBox.setText("10");
        overLapBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overLapBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Rows x Cols");

        tileButton.setText("Tile");
        tileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileButtonActionPerformed(evt);
            }
        });

        rowTile.setText("3");
        rowTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rowTileActionPerformed(evt);
            }
        });

        colTile.setText("3");
        colTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colTileActionPerformed(evt);
            }
        });

        showList.setText("Show List");
        showList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showListActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(103, 103, 103))
                    .add(org.jdesktop.layout.GroupLayout.CENTER, jPanel3Layout.createSequentialGroup()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.CENTER, overLapBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(org.jdesktop.layout.GroupLayout.CENTER, jLabel4)
                            .add(org.jdesktop.layout.GroupLayout.CENTER, jPanel3Layout.createSequentialGroup()
                                .add(rowTile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(colTile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.CENTER, showList)
                            .add(org.jdesktop.layout.GroupLayout.CENTER, tileButton))
                        .add(89, 89, 89))))
        );

        jPanel3Layout.linkSize(new java.awt.Component[] {colTile, overLapBox, rowTile}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(overLapBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(rowTile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(colTile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(showList)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(tileButton)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListActionPerformed
        controller.showList();
    }//GEN-LAST:event_showListActionPerformed

    private void tileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileButtonActionPerformed
        controller.setOverlap(Integer.parseInt(this.overLapBox.getText()));
        controller.setTileSizes(Integer.parseInt(this.rowTile.getText()), Integer.parseInt(this.colTile.getText()));
        controller.makeTiles();
    }//GEN-LAST:event_tileButtonActionPerformed

    private void overLapBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overLapBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overLapBoxActionPerformed

    private void focalPlaneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_focalPlaneButtonActionPerformed
        controller.findFocusPlane();
    }//GEN-LAST:event_focalPlaneButtonActionPerformed

    private void point2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point2ButtonActionPerformed
        controller.setPosition2();
        this.point3Button.setEnabled(true);
    }//GEN-LAST:event_point2ButtonActionPerformed

    private void point3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_point3ButtonActionPerformed
        controller.setPosition3();
        this.focalPlaneButton.setEnabled(true);
    }//GEN-LAST:event_point3ButtonActionPerformed

    private void rowTileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rowTileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rowTileActionPerformed

    private void colTileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colTileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colTileActionPerformed

    private void startColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startColActionPerformed

    private void colsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colsActionPerformed

    private void rowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rowsActionPerformed

    private void topLetCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topLetCenterActionPerformed
        controller.setFirstBox();
        this.loadTemplate.setEnabled(true);
    }//GEN-LAST:event_topLetCenterActionPerformed

    private void loadTemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTemplateActionPerformed
        String str = this.rows.getText();
        int row = Integer.parseInt(str);

        String str2 = this.cols.getText();
        int col = Integer.parseInt(str2);

        controller.setInit(row, col, Integer.parseInt(startRow.getText()), Integer.parseInt(startCol.getText()));

        controller.loadTemplate();
        controller.showList();
    }//GEN-LAST:event_loadTemplateActionPerformed

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
            java.util.logging.Logger.getLogger(MultiWellGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiWellGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiWellGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiWellGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiWellGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField colTile;
    private javax.swing.JTextField cols;
    private javax.swing.JButton focalPlaneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loadTemplate;
    private javax.swing.JTextField overLapBox;
    private javax.swing.JButton point2Button;
    private javax.swing.JButton point3Button;
    private javax.swing.JTextField rowTile;
    private javax.swing.JTextField rows;
    private javax.swing.JButton showList;
    private javax.swing.JTextField startCol;
    private javax.swing.JTextField startRow;
    private javax.swing.JButton tileButton;
    private javax.swing.JButton topLetCenter;
    // End of variables declaration//GEN-END:variables
}
