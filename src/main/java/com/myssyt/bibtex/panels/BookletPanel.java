
package com.myssyt.bibtex.panels;

import javax.swing.JTextField ;
import javax.swing.JPanel;

/**
 *
 * @author jphkylli
 */
public class BookletPanel extends JPanel {
   /*
        A work that is printed and bound, but without a named publisher or sponsoring institution.

        Required fields: title

        Optional fields: author, howpublished, address, month, year, note, key
    */

    /**
     * Creates new form BookletPanel
     */
    public BookletPanel() {
        initComponents();
    }
    
    public void clearTextFields() {
        
        optionalFieldsScrollPane.getVerticalScrollBar().setValue(optionalFieldsScrollPane.getVerticalScrollBar().getMinimum());
        
        getTfBibtexkey().setText("");
        
        getTfTitle().setText("");
       
        getTfAuthor().setText("");
        getTfHowpublished().setText("");
        getTfAddress().setText("");
        getTfMonth().setText("");
        getTfYear().setText("");
        getTfNote().setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitle = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        tfBibtexkey = new javax.swing.JTextField();
        lBibtexkey = new javax.swing.JLabel();
        optionalFieldsScrollPane = new javax.swing.JScrollPane();
        optionalFieldsPanel = new javax.swing.JPanel();
        tfAuthor = new javax.swing.JTextField();
        tfMonth = new javax.swing.JTextField();
        tfHowpublished = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfYear = new javax.swing.JTextField();
        lAuthor = new javax.swing.JLabel();
        lHowpublished = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        lMonth = new javax.swing.JLabel();
        lYear = new javax.swing.JLabel();
        tfNote = new javax.swing.JTextField();
        lNote = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Booklet"));
        setPreferredSize(new java.awt.Dimension(100, 100));

        lTitle.setText("Title");

        lBibtexkey.setText("Bibtexkey");

        optionalFieldsScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Optional Fields"));
        optionalFieldsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        optionalFieldsScrollPane.setPreferredSize(new java.awt.Dimension(699, 190));

        lAuthor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lAuthor.setText("Author");
        lAuthor.setPreferredSize(new java.awt.Dimension(90, 16));

        lHowpublished.setText("Howpublished");

        lAddress.setText("Address");

        lMonth.setText("Month");

        lYear.setText("Year");

        lNote.setText("Note");

        javax.swing.GroupLayout optionalFieldsPanelLayout = new javax.swing.GroupLayout(optionalFieldsPanel);
        optionalFieldsPanel.setLayout(optionalFieldsPanelLayout);
        optionalFieldsPanelLayout.setHorizontalGroup(
            optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalFieldsPanelLayout.createSequentialGroup()
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lHowpublished)
                    .addComponent(lAddress)
                    .addComponent(lMonth)
                    .addComponent(lYear)
                    .addComponent(lNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHowpublished, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                    .addComponent(tfAuthor)
                    .addComponent(tfYear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfMonth, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfAddress)
                    .addComponent(tfNote))
                .addContainerGap())
        );
        optionalFieldsPanelLayout.setVerticalGroup(
            optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionalFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHowpublished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lHowpublished))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMonth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionalFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNote))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionalFieldsScrollPane.setViewportView(optionalFieldsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionalFieldsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTitle)
                    .addComponent(lBibtexkey))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfBibtexkey, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTitle)
                    .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBibtexkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBibtexkey))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionalFieldsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lAuthor;
    private javax.swing.JLabel lBibtexkey;
    private javax.swing.JLabel lHowpublished;
    private javax.swing.JLabel lMonth;
    private javax.swing.JLabel lNote;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lYear;
    private javax.swing.JPanel optionalFieldsPanel;
    private javax.swing.JScrollPane optionalFieldsScrollPane;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAuthor;
    private javax.swing.JTextField tfBibtexkey;
    private javax.swing.JTextField tfHowpublished;
    private javax.swing.JTextField tfMonth;
    private javax.swing.JTextField tfNote;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tfAddress
     */
    public JTextField getTfAddress() {
        return tfAddress;
    }

    /**
     * @param tfAddress the tfAddress to set
     */
    public void setTfAddress(JTextField tfAddress) {
        this.tfAddress = tfAddress;
    }

    /**
     * @return the tfAuthor
     */
    public JTextField getTfAuthor() {
        return tfAuthor;
    }

    /**
     * @param tfAuthor the tfAuthor to set
     */
    public void setTfAuthor(JTextField tfAuthor) {
        this.tfAuthor = tfAuthor;
    }

    /**
     * @return the tfBibtexkey
     */
    public JTextField getTfBibtexkey() {
        return tfBibtexkey;
    }

    /**
     * @param tfBibtexkey the tfBibtexkey to set
     */
    public void setTfBibtexkey(JTextField tfBibtexkey) {
        this.tfBibtexkey = tfBibtexkey;
    }

    /**
     * @return the tfHowpublished
     */
    public JTextField getTfHowpublished() {
        return tfHowpublished;
    }

    /**
     * @param tfHowpublished the tfHowpublished to set
     */
    public void setTfHowpublished(JTextField tfHowpublished) {
        this.tfHowpublished = tfHowpublished;
    }

    /**
     * @return the tfMonth
     */
    public JTextField getTfMonth() {
        return tfMonth;
    }

    /**
     * @param tfMonth the tfMonth to set
     */
    public void setTfMonth(JTextField tfMonth) {
        this.tfMonth = tfMonth;
    }

    /**
     * @return the tfNote
     */
    public JTextField getTfNote() {
        return tfNote;
    }

    /**
     * @param tfNote the tfNote to set
     */
    public void setTfNote(JTextField tfNote) {
        this.tfNote = tfNote;
    }

    /**
     * @return the tfTitle
     */
    public JTextField getTfTitle() {
        return tfTitle;
    }

    /**
     * @param tfTitle the tfTitle to set
     */
    public void setTfTitle(JTextField tfTitle) {
        this.tfTitle = tfTitle;
    }

    /**
     * @return the tfyear
     */
    public JTextField getTfYear() {
        return tfYear;
    }

    /**
     * @param tfyear the tfyear to set
     */
    public void setTfYear(JTextField tfyear) {
        this.tfYear = tfyear;
    }

}