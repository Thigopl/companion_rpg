/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.ui;

import br.com.classes.Item;
import br.com.interfaces.FuncaoActionPerformed;

/**
 *
 * @author gfreitash
 */
public class DisplayItem extends javax.swing.JPanel {
    private Item item;
    private FuncaoActionPerformed editarAcao;
    private FuncaoActionPerformed removerAcao;
    
    /**
     * Creates new form DisplayItem
     */
    public DisplayItem(Item item) {
        this.item = item;
        initComponents();
        customInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemDisplayPanel = new javax.swing.JPanel();
        itemDisplayNomeLabel = new javax.swing.JLabel();
        itemDisplayNome = new javax.swing.JLabel();
        itemDisplayValorLabel = new javax.swing.JLabel();
        itemDisplayMagicoLabel = new javax.swing.JLabel();
        itemDisplayTipoLabel = new javax.swing.JLabel();
        itemDisplayDescricaoLabel = new javax.swing.JLabel();
        itemDisplayRemoverBotao = new javax.swing.JButton();
        itemDisplayEditarBotao = new javax.swing.JButton();
        itemDisplayDescricaoScrollpane = new javax.swing.JScrollPane();
        itemDisplayDescricao = new javax.swing.JTextArea();
        itemDisplayValor = new javax.swing.JLabel();
        itemDisplayMagico = new javax.swing.JLabel();
        itemDisplayTipo = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        itemDisplayNomeLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemDisplayNomeLabel.setText("Nome:");

        itemDisplayNome.setText("itemNome");

        itemDisplayValorLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemDisplayValorLabel.setText("Valor: ");

        itemDisplayMagicoLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemDisplayMagicoLabel.setText("É mágico?");

        itemDisplayTipoLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemDisplayTipoLabel.setText("Tipo:");

        itemDisplayDescricaoLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        itemDisplayDescricaoLabel.setText("Descrição:");

        itemDisplayRemoverBotao.setText("Remover");
        itemDisplayRemoverBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDisplayRemoverBotaoActionPerformed(evt);
            }
        });

        itemDisplayEditarBotao.setText("Editar");
        itemDisplayEditarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDisplayEditarBotaoActionPerformed(evt);
            }
        });

        itemDisplayDescricao.setColumns(20);
        itemDisplayDescricao.setLineWrap(true);
        itemDisplayDescricao.setRows(5);
        itemDisplayDescricao.setWrapStyleWord(true);
        itemDisplayDescricao.setEnabled(false);
        itemDisplayDescricaoScrollpane.setViewportView(itemDisplayDescricao);

        itemDisplayValor.setText("itemValor");

        itemDisplayMagico.setText("Sim");

        itemDisplayTipo.setText("itemTipo");

        javax.swing.GroupLayout itemDisplayPanelLayout = new javax.swing.GroupLayout(itemDisplayPanel);
        itemDisplayPanel.setLayout(itemDisplayPanelLayout);
        itemDisplayPanelLayout.setHorizontalGroup(
            itemDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemDisplayDescricaoScrollpane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemDisplayPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(itemDisplayEditarBotao)
                        .addGap(18, 18, 18)
                        .addComponent(itemDisplayRemoverBotao))
                    .addGroup(itemDisplayPanelLayout.createSequentialGroup()
                        .addComponent(itemDisplayNomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDisplayNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(itemDisplayPanelLayout.createSequentialGroup()
                        .addComponent(itemDisplayDescricaoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(itemDisplayPanelLayout.createSequentialGroup()
                        .addComponent(itemDisplayValorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDisplayValor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDisplayMagicoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDisplayMagico, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDisplayTipoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDisplayTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        itemDisplayPanelLayout.setVerticalGroup(
            itemDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemDisplayNomeLabel)
                    .addComponent(itemDisplayNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemDisplayValorLabel)
                    .addComponent(itemDisplayMagicoLabel)
                    .addComponent(itemDisplayTipoLabel)
                    .addComponent(itemDisplayValor)
                    .addComponent(itemDisplayMagico)
                    .addComponent(itemDisplayTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemDisplayDescricaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemDisplayDescricaoScrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemDisplayRemoverBotao)
                    .addComponent(itemDisplayEditarBotao))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemDisplayEditarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDisplayEditarBotaoActionPerformed
        editarAcao.actionPerformed();
    }//GEN-LAST:event_itemDisplayEditarBotaoActionPerformed

    private void itemDisplayRemoverBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDisplayRemoverBotaoActionPerformed
        removerAcao.actionPerformed();
    }//GEN-LAST:event_itemDisplayRemoverBotaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea itemDisplayDescricao;
    private javax.swing.JLabel itemDisplayDescricaoLabel;
    private javax.swing.JScrollPane itemDisplayDescricaoScrollpane;
    private javax.swing.JButton itemDisplayEditarBotao;
    private javax.swing.JLabel itemDisplayMagico;
    private javax.swing.JLabel itemDisplayMagicoLabel;
    private javax.swing.JLabel itemDisplayNome;
    private javax.swing.JLabel itemDisplayNomeLabel;
    private javax.swing.JPanel itemDisplayPanel;
    private javax.swing.JButton itemDisplayRemoverBotao;
    private javax.swing.JLabel itemDisplayTipo;
    private javax.swing.JLabel itemDisplayTipoLabel;
    private javax.swing.JLabel itemDisplayValor;
    private javax.swing.JLabel itemDisplayValorLabel;
    // End of variables declaration//GEN-END:variables

    private void customInitComponents() {
        itemDisplayNome.setText(item.getNome());
        itemDisplayValor.setText(Double.toString(item.getValor()));
        itemDisplayMagico.setText(item.isMagico() ? "Sim" : "Não");
        itemDisplayTipo.setText(item.getTipo().name());
        itemDisplayDescricao.setText(item.getDescricao());
    }
    
    public void setBotaoEditarActionPerformed(FuncaoActionPerformed funcao) {
        this.editarAcao = funcao;
    }
    
    public void setBotaoRemoverActionPerformed(FuncaoActionPerformed funcao) {
        this.removerAcao = funcao;
    }
}
