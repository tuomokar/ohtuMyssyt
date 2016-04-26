package com.myssyt.bibtex;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class App extends javax.swing.JFrame {
    private final String filename = "default";
    private CardLayout cl;
    private ViiteManageri manageri;
    private DefaultTableModel model;
    ArticlePanel articlePanel;
    BookPanel bookPanel;
    InproceedingsPanel inproceedingsPanel;
    BookletPanel bookletPanel;
    
    int currentReferenceType = -1;
    
    private void newReference() {
        refTable.clearSelection();
        
        if (cbType.getSelectedItem().equals("Article")) {
            articlePanel.clearTextFields();
            cl.show(contPanel, "article");
            currentReferenceType = 0;
            lMessage.setText("New Article");
        } else if (cbType.getSelectedItem().equals("Book")) {
            bookPanel.clearTextFields();
            cl.show(contPanel, "book");
            currentReferenceType = 1;
            lMessage.setText("New Book");
        } else if (cbType.getSelectedItem().equals("InProceedings")) {
            inproceedingsPanel.clearTextFields();
            cl.show(contPanel, "inproceedings");
            currentReferenceType = 2;
            lMessage.setText("New Inproceedings");    
        } else if (cbType.getSelectedItem().equals("Booklet")) {
            bookletPanel.clearTextFields();
            cl.show(contPanel, "booklet");
            currentReferenceType = 3;
            lMessage.setText("New Booklet");    
        }
    }
    
    private void addReference() {
        String msg = "";

        if (currentReferenceType == 0) {
            String bibtexkey = articlePanel.getTfBibtexkey().getText();
            
            String author = articlePanel.getTfAuthor().getText();
            String title = articlePanel.getTfTitle().getText();
            String journal = articlePanel.getTfJournal().getText();
            String year = articlePanel.getTfYear().getText();
            
            // vapaavalintaiset
            String volume = articlePanel.getTfVolume().getText();
            String number = articlePanel.getTfNumber().getText();
            String pages = articlePanel.getTfPages().getText();
            String month = articlePanel.getTfMonth().getText();
            String note = articlePanel.getTfNote().getText();
            
            // table row: type, author/editor, title, year, journal/booktitle, key
            model.addRow(new Object[] {
                "Article",
                author,
                title,
                year,
                journal,
                bibtexkey
            });

            msg = manageri.lisaaArtikkeli(bibtexkey, author, title, journal,
                    year, volume, number, pages, month, note);
            lMessage.setText(msg);
        } else if (currentReferenceType == 1) {
            String bibtexkey = bookPanel.getTfBibtexkey().getText();
            
            // author or editor
            String author = bookPanel.getTfAuthor().getText(); 
            String editor = bookPanel.getTfEditor().getText();
            String authorOrEditor = (!author.isEmpty() ? author : editor); 
            String title = bookPanel.getTfTitle().getText();
            String publisher = bookPanel.getTfPublisher().getText();
            String year = bookPanel.getTfYear().getText();
            
            // vapaavalintaiset + volume or number
            String volume = bookPanel.getTfVolume().getText();
            String number = bookPanel.getTfNumber().getText(); 
            String series = bookPanel.getTfSeries().getText();
            String address = bookPanel.getTfAddress().getText();
            String edition = bookPanel.getTfEdition().getText();
            String month = bookPanel.getTfMonth().getText();
            String note = bookPanel.getTfNote().getText();  
            
            // table row: type, author/editor, title, year, journal/booktitle, key
            model.addRow(new Object[] {
                "Book",
                authorOrEditor,
                title,
                year,
                null,
                bibtexkey
            });

            msg = manageri.lisaaKirja(bibtexkey, author, editor, title, publisher,
                    year, volume, number, series, address, edition, month, note);
            lMessage.setText(msg);
        } else if (currentReferenceType == 2) {
            String bibtexkey = inproceedingsPanel.getTfBibtexkey().getText();
            
            String author = inproceedingsPanel.getTfAuthor().getText();
            String title = inproceedingsPanel.getTfTitle().getText();
            String booktitle = inproceedingsPanel.getTfBooktitle().getText();
            String year = inproceedingsPanel.getTfYear().getText();
            
            // vapaavalintaiset + volume or number
            String editor = inproceedingsPanel.getTfEditor().getText();
            String volume = inproceedingsPanel.getTfVolume().getText();
            String number = inproceedingsPanel.getTfNumber().getText();
            String series = inproceedingsPanel.getTfSeries().getText();
            String pages = inproceedingsPanel.getTfPages().getText();
            String address = inproceedingsPanel.getTfAddress().getText();
            String month = inproceedingsPanel.getTfMonth().getText();
            String organization = inproceedingsPanel.getTfOrganization().getText();
            String publisher = inproceedingsPanel.getTfPublisher().getText();
            String note = inproceedingsPanel.getTfNote().getText();
            
            // table row: type, author/editor, title, year, journal/booktitle, key
            model.addRow(new Object[] {
                "Inproceedings",
                author,
                title,
                year,
                booktitle,
                bibtexkey
            });

            msg = manageri.lisaaInproceedings(bibtexkey, author, title,
                    booktitle, year, editor, volume, number, series, pages,
                    address, month, organization, publisher, note);
            lMessage.setText(msg);
        } else if (currentReferenceType == 3) {
            String bibtexkey = bookletPanel.getTfBibtexkey().getText();
            
            String title = bookletPanel.getTfTitle().getText();

            // vapaavalintaiset
            String author = bookletPanel.getTfAuthor().getText();
            String howpublished = bookletPanel.getTfHowpublished().getText();
            String address = bookletPanel.getTfAddress().getText();
            String month = bookletPanel.getTfMonth().getText();
            String year = bookletPanel.getTfYear().getText();
            String note = bookletPanel.getTfNote().getText();
            
            // table row: type, author/editor, title, year, journal/booktitle, key
            model.addRow(new Object[] {
                "Booklet",
                author,
                title,
                year,
                null,
                bibtexkey
            });

            msg = manageri.lisaaBooklet(bibtexkey, title, author,
                    howpublished, address, month, year, note);
            lMessage.setText(msg);
        } else {
            lMessage.setText("Create new reference first");
        }
        currentReferenceType = -1; // estää uuden luomisen
    }
    
    private void updateReference() {
        int selectedRow = refTable.getSelectedRow();
        if (selectedRow == -1) {
            lMessage.setText("Update error: no selection");
        } else {
            Viite viite = manageri.getViitteet().get(selectedRow);
            
            if (viite.getClass().equals(Artikkeli.class)) {
                Artikkeli artikkeli = (Artikkeli) viite;

                String bibtexkey = articlePanel.getTfBibtexkey().getText();
                
                String author = articlePanel.getTfAuthor().getText();
                String title = articlePanel.getTfTitle().getText();
                String journal = articlePanel.getTfJournal().getText();
                String year = articlePanel.getTfYear().getText();

                // vapaavalintaiset
                String volume = articlePanel.getTfVolume().getText();
                String number = articlePanel.getTfNumber().getText();
                String pages = articlePanel.getTfPages().getText();
                String month = articlePanel.getTfMonth().getText();
                String note = articlePanel.getTfNote().getText();
                
                artikkeli.setBibtexKey(bibtexkey);
                
                artikkeli.setAuthor(author);
                artikkeli.setTitle(title);
                artikkeli.setJournal(journal);
                artikkeli.setYear(year);
                
                // vapaavalintaiset
                artikkeli.setVolume(volume);
                artikkeli.setNumber(number);
                artikkeli.setPages(pages);
                artikkeli.setMonth(month);
                artikkeli.setNote(note);
                
                // table row: type, author/editor, title, year, journal/booktitle, key
                //model.setValueAt(viite, selectedRow, 0);
                model.setValueAt(author, selectedRow, 1);
                model.setValueAt(title, selectedRow, 2);
                model.setValueAt(year, selectedRow, 3);
                model.setValueAt(journal, selectedRow, 4);
                model.setValueAt(bibtexkey, selectedRow, 5);
                
                lMessage.setText("Article updated");
            } else if (viite.getClass().equals(Kirja.class)) {
                Kirja kirja = (Kirja) viite;

                String bibtexkey = bookPanel.getTfBibtexkey().getText();
                
                // author or editor
                String author = bookPanel.getTfAuthor().getText(); 
                String editor = bookPanel.getTfEditor().getText();
                String authorOrEditor = (!author.isEmpty() ? author : editor);
                String title = bookPanel.getTfTitle().getText();
                String publisher = bookPanel.getTfPublisher().getText();
                String year = bookPanel.getTfYear().getText();
                
                // vapaavalintaiset + volume or number
                String volume = bookPanel.getTfVolume().getText();
                String number = bookPanel.getTfNumber().getText(); 
                String series = bookPanel.getTfSeries().getText();
                String address = bookPanel.getTfAddress().getText();
                String edition = bookPanel.getTfEdition().getText();
                String month = bookPanel.getTfMonth().getText();
                String note = bookPanel.getTfNote().getText(); 
                
                kirja.setBibtexKey(bibtexkey);
                
                // author or editor
                kirja.setAuthor(author);
                kirja.setEditor(editor);
                kirja.setTitle(title);
                kirja.setPublisher(publisher);
                kirja.setYear(year);
                
                // vapaavalintaiset + volume or number
                kirja.setVolume(volume);
                kirja.setNumber(number);
                kirja.setSeries(series);
                kirja.setAddress(address);
                kirja.setEdition(edition);
                kirja.setMonth(month);
                kirja.setNote(note);
                
                // table row: type, author/editor, title, year, journal/booktitle, key
                //model.setValueAt(viite, selectedRow, 0);
                model.setValueAt(authorOrEditor, selectedRow, 1);
                model.setValueAt(title, selectedRow, 2);
                model.setValueAt(year, selectedRow, 3);
                //model.setValueAt(journal, selectedRow, 4);
                model.setValueAt(bibtexkey, selectedRow, 5);
                
                lMessage.setText("Book updated");
            } else if (viite.getClass().equals(Booklet.class)) {
                Booklet booklet = (Booklet) viite;
                
                String bibtexkey = bookletPanel.getTfBibtexkey().getText();
            
                String title = bookletPanel.getTfTitle().getText();

                // vapaavalintaiset
                String author = bookletPanel.getTfAuthor().getText();
                String howpublished = bookletPanel.getTfHowpublished().getText();
                String address = bookletPanel.getTfAddress().getText();
                String month = bookletPanel.getTfMonth().getText();
                String year = bookletPanel.getTfYear().getText();
                String note = bookletPanel.getTfNote().getText();
                
                booklet.setBibtexKey(bibtexkey);
                
                booklet.setTitle(title);
                
                // vapaavalintaiset
                booklet.setAuthor(author);
                booklet.setHowpublished(howpublished);
                booklet.setAddress(address);
                booklet.setMonth(month);
                booklet.setYear(year);
                booklet.setNote(note);
                
                // table row: type, author/editor, title, year, journal/booktitle, key
                //model.setValueAt(viite, selectedRow, 0);
                model.setValueAt(author, selectedRow, 1);
                model.setValueAt(title, selectedRow, 2);
                model.setValueAt(year, selectedRow, 3);
                //model.setValueAt(booktitle, selectedRow, 4);
                model.setValueAt(bibtexkey, selectedRow, 5);
                
                lMessage.setText("Booklet updated");
            }
        }
    }
    
    private void viewSelectedReference() {
        int selectedRow = refTable.getSelectedRow();
        if (selectedRow == -1) {
            lMessage.setText("Error: viewSelectedReference(), no selection");
        } else {
            Viite viite = manageri.getViitteet().get(selectedRow);
            
            if (model.getValueAt(selectedRow, 0).equals("Article")) {
                Artikkeli artikkeli = (Artikkeli) viite;
                
                articlePanel.clearTextFields();

                String bibtexkey = artikkeli.getBibtexKey();
                
                String author = artikkeli.getAuthor();
                String title = artikkeli.getTitle();
                String journal = artikkeli.getJournal();
                String year = artikkeli.getYear();
                
                // vapaavalintaiset
                String volume = artikkeli.getVolume();
                String number = artikkeli.getNumber();
                String pages = artikkeli.getPages();
                String month = artikkeli.getMonth();
                String note = artikkeli.getNote();
                
                articlePanel.getTfBibtexkey().setText(bibtexkey);
                
                articlePanel.getTfAuthor().setText(author);
                articlePanel.getTfTitle().setText(title);
                articlePanel.getTfJournal().setText(journal);
                articlePanel.getTfYear().setText(year);
                
                // vapaavalintaiset
                articlePanel.getTfVolume().setText(volume);
                articlePanel.getTfNumber().setText(number);
                articlePanel.getTfPages().setText(pages);
                articlePanel.getTfMonth().setText(month);
                articlePanel.getTfNote().setText(note);

                cl.show(contPanel, "article");
                
                lMessage.setText("Article selected");
            } else if (model.getValueAt(selectedRow, 0).equals("Book")) {
                Kirja kirja = (Kirja) viite;
                
                bookPanel.clearTextFields();

                String bibtexkey = kirja.getBibtexKey();
                
                // author or editor
                String author = kirja.getAuthor();
                String editor = kirja.getEditor();
                String title = kirja.getTitle();
                String publisher = kirja.getPublisher();
                String year = kirja.getYear();
                
                // vapaavalintaiset + volume or number
                String volume = kirja.getVolume();
                String number = kirja.getNumber(); 
                String series = kirja.getSeries();
                String address = kirja.getAddress();
                String edition = kirja.getEdition();
                String month = kirja.getMonth();
                String note = kirja.getNote();

                bookPanel.getTfBibtexkey().setText(bibtexkey);
                
                // author or editor
                bookPanel.getTfAuthor().setText(author);
                bookPanel.getTfEditor().setText(editor);
                bookPanel.getTfTitle().setText(title);
                bookPanel.getTfPublisher().setText(publisher); 
                bookPanel.getTfYear().setText(year);
                
                // vapaavalintaiset + volume or number
                bookPanel.getTfVolume().setText(volume);
                bookPanel.getTfNumber().setText(number); 
                bookPanel.getTfSeries().setText(series);
                bookPanel.getTfAddress().setText(address);
                bookPanel.getTfEdition().setText(edition);
                bookPanel.getTfMonth().setText(month);
                bookPanel.getTfNote().setText(note); 

                cl.show(contPanel, "book");
                
                lMessage.setText("Book selected");
            } else if (model.getValueAt(selectedRow, 0).equals("Inproceedings")) {
                Inproceedings inproceedings = (Inproceedings) viite;
                
                inproceedingsPanel.clearTextFields();

                String bibtexkey = inproceedings.getBibtexKey();
                 
                String author = inproceedings.getAuthor();
                String title = inproceedings.getTitle();
                String booktitle = inproceedings.getBooktitle();
                String year = inproceedings.getYear();
                
                // vapaavalintaiset + volume or number
                String editor = inproceedings.getEditor();
                String volume = inproceedings.getVolume();
                String number = inproceedings.getNumber();
                String series = inproceedings.getSeries();
                String pages = inproceedings.getPages();
                String address = inproceedings.getAddress();
                String month = inproceedings.getMonth();
                String organization = inproceedings.getOrganization();
                String publisher = inproceedings.getPublisher();
                String note = inproceedings.getNote();
                
                inproceedingsPanel.getTfBibtexkey().setText(bibtexkey);
                
                inproceedingsPanel.getTfAuthor().setText(author);
                inproceedingsPanel.getTfTitle().setText(title);
                inproceedingsPanel.getTfBooktitle().setText(booktitle);
                inproceedingsPanel.getTfYear().setText(year);
     
                // vapaavalintaiset + volume or number
                inproceedingsPanel.getTfEditor().setText(editor);
                inproceedingsPanel.getTfVolume().setText(volume);
                inproceedingsPanel.getTfNumber().setText(number);
                inproceedingsPanel.getTfSeries().setText(series);
                inproceedingsPanel.getTfPages().setText(pages);
                inproceedingsPanel.getTfAddress().setText(address);
                inproceedingsPanel.getTfMonth().setText(month);
                inproceedingsPanel.getTfOrganization().setText(organization);
                inproceedingsPanel.getTfPublisher().setText(publisher);
                inproceedingsPanel.getTfNote().setText(note);
                
                cl.show(contPanel, "inproceedings");
                
                lMessage.setText("Inproceedings selected");
            }
        } 
    }
    
    private void deleteReference() {
        int selectedRow = refTable.getSelectedRow();
        if (selectedRow == -1) {
            lMessage.setText("Delete error: no selection");
        } else {
            manageri.poistaViite(selectedRow);
            model.removeRow(selectedRow);
            lMessage.setText("Reference deleted");
        }
    }

    /**
     * Creates new form Main
     */
    public App() {
        initComponents();
        
        articlePanel = new ArticlePanel();
        bookPanel = new BookPanel();
        inproceedingsPanel = new InproceedingsPanel();
        bookletPanel = new BookletPanel();
        
        contPanel.add(articlePanel, "article");
        contPanel.add(bookPanel, "book");
        contPanel.add(inproceedingsPanel, "inproceedings");
        contPanel.add(bookletPanel, "booklet");
        cl = (CardLayout)contPanel.getLayout();
        cl.show(contPanel, "article"); 
        
        manageri = new ViiteManageri();
        lMessage.setText(manageri.lataaViitteet(filename)); 
        model = (DefaultTableModel) refTable.getModel();
        
        for(Viite viite : manageri.getViitteet()) {
            if (viite.getClass().equals(Artikkeli.class)) {
                Artikkeli artikkeli = (Artikkeli) viite;
                // entrytype, author/editor, title, year, journal/booktitle, bibtexkey
                model.addRow(new Object[] {
                    "Article",
                    artikkeli.getAuthor(), // todo: or editor
                    artikkeli.getTitle(),
                    artikkeli.getYear(),
                    artikkeli.getJournal(),
                    artikkeli.getBibtexKey()
                });
            } else if (viite.getClass().equals(Kirja.class)) {
                Kirja kirja = (Kirja) viite;
                // entrytype, author/editor, title, year, journal/booktitle, bibtexkey
                model.addRow(new Object[] {
                    "Book",
                    kirja.getAuthor(),
                    kirja.getTitle(),
                    kirja.getYear(),
                    null,
                    kirja.getBibtexKey()
                });
            } else if (viite.getClass().equals(Inproceedings.class)) {
                Inproceedings inproc = (Inproceedings) viite;
                // entrytype, author/editor, title, year, journal/booktitle, bibtexkey
                model.addRow(new Object[] {
                    "Inproceedings",
                    inproc.getAuthor(),
                    inproc.getTitle(),
                    inproc.getYear(),
                    inproc.getBooktitle(),
                    inproc.getBibtexKey()
                });
            } else if (viite.getClass().equals(Booklet.class)) {
                Booklet booklet = (Booklet) viite;
                // entrytype, author/editor, title, year, journal/booktitle, bibtexkey
                model.addRow(new Object[] {
                    "Inproceedings",
                    booklet.getAuthor(),
                    booklet.getTitle(),
                    booklet.getYear(),
                    booklet.getBooktitle(),
                    booklet.getBibtexKey()
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        controlsPanel = new javax.swing.JPanel();
        bNew = new javax.swing.JButton();
        cbType = new javax.swing.JComboBox<>();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bExport = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        bUpdate = new javax.swing.JButton();
        contPanel = new javax.swing.JPanel();
        refTableScrollPane = new javax.swing.JScrollPane();
        refTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        bNew.setText("New");
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Article", "Book", "InProceedings", "Booklet" }));
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bExport.setText("Export");
        bExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExportActionPerformed(evt);
            }
        });

        bSave.setText("Save File");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        lMessage.setText("Message:");

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlsPanelLayout = new javax.swing.GroupLayout(controlsPanel);
        controlsPanel.setLayout(controlsPanelLayout);
        controlsPanelLayout.setHorizontalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addComponent(bNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExport)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        controlsPanelLayout.setVerticalGroup(
            controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addGroup(controlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNew)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAdd)
                    .addComponent(bDelete)
                    .addComponent(bExport)
                    .addComponent(bSave)
                    .addComponent(bUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        contPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(contPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        refTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Entrytype", "Author/Editor", "Title", "Year", "Journal/Booktitle", "Bibtexkey"
            }
        ));
        refTable.setCellEditor(null);
        refTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refTableMouseClicked(evt);
            }
        });
        refTableScrollPane.setViewportView(refTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed

    }//GEN-LAST:event_cbTypeActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        newReference();
    }//GEN-LAST:event_bNewActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        addReference();
    }//GEN-LAST:event_bAddActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        updateReference();
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        deleteReference();
    }//GEN-LAST:event_bDeleteActionPerformed

    private void refTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refTableMouseClicked
        viewSelectedReference();
    }//GEN-LAST:event_refTableMouseClicked

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        lMessage.setText(manageri.tallennaViitteet(filename)); 
    }//GEN-LAST:event_bSaveActionPerformed

    private void bExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExportActionPerformed
        String inputValue = JOptionPane.showInputDialog("Please input a filename");
        if(inputValue != null && !inputValue.trim().equals("")) {
            lMessage.setText(manageri.exportViitteet(inputValue + ".bib"));
        } else {
            lMessage.setText("Export error: invalid filename");
        }
    }//GEN-LAST:event_bExportActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bExport;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bUpdate;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JPanel contPanel;
    private javax.swing.JPanel controlsPanel;
    private javax.swing.JLabel lMessage;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable refTable;
    private javax.swing.JScrollPane refTableScrollPane;
    // End of variables declaration//GEN-END:variables
}
