package com.myssyt.bibtex;

/**
 *
 * @author oplindst
 */
import com.myssyt.bibtex.domain.Article;
import com.myssyt.bibtex.domain.Incollection;
import com.myssyt.bibtex.domain.Inproceedings;
import com.myssyt.bibtex.domain.Booklet;
import com.myssyt.bibtex.domain.Book;
import com.myssyt.bibtex.domain.Reference;
import java.util.ArrayList;

public class ReferenceManager {
    
    private ArrayList<Reference> references;
    
    public ReferenceManager() {
        references = new ArrayList<>();
    }
    
    public ArrayList<Reference> getReferences() {
        return references;
    }
    
    public String addArticle(String bibtexkey, String author, String title, 
            String journal, String year, String volume, String number, 
            String pages, String month, String note) {
        
            Article article = new Article(bibtexkey, author, title, 
                    journal, year, volume, number, pages, month, note);
        
        references.add(article);
        
        return "Adding article succeeded";
    }
    
    public String addBook(String bibtexkey, String author, String editor, 
            String title, String publisher, String year, String volume, 
            String number, String series, String address, String edition, 
            String month, String note) {
        
        Book book = new Book(bibtexkey, author, editor, title, publisher, 
                year, volume, number, series, address, edition, month, note);
            
        references.add(book);
        
        return "Adding book succeeded";
    }
    
    public String addInproceedings(String bibtexkey, String author, String title, 
            String booktitle, String year, String editor, String volume, 
            String number, String series, String pages, String address, 
            String month, String organization, String publisher,
            String note) {
        
        Inproceedings inproceedings = new Inproceedings(bibtexkey, author,
            title, booktitle, year, editor, volume, number, series, pages,
            address, month, organization, publisher, note);
        
        references.add(inproceedings);
        
        return "Adding inproceedings succeeded";
    }
    
    public String addBooklet(String bibtexKey, String title, String author, String howpublished, String address, String month, 
            String year, String note) {
        
        Booklet booklet = new Booklet(bibtexKey, title, author, howpublished, address, month, 
            year, note);
        
        references.add(booklet);
        
        return "Adding booklet succeeded";
    }
    
    public String addIncollection(String bibtexkey, String author, String title, String booktitle,
            String publisher, String year, String editor, String volume, String number,
            String series, String type, String chapter, String pages, String address,
            String edition, String month, String note) {
        
        Incollection incollection = new Incollection(bibtexkey, author, title, booktitle, publisher, 
                year, editor, volume, number, series, type, chapter, pages, address, edition, month, note);
                        
        references.add(incollection);
        
        return "Adding incollectionin succeeded";
    }
    
    public String saveReferences(String name) {
        try {
            FileHandler.writeFile(references, name);
            return "Saving file succeeded";
        }
        catch (Exception e) {
            return "Saving file failed";
        }
    }
    
    public String loadReferences(String name) {
        try {
            references = FileHandler.readFile(name);
            return "Loading file succeeded";
        }
        catch (Exception e) {
            references = new ArrayList<>();
            return "Loading file failed";
        }
    }
    
    public String removeReference(int index) {
        references.remove(index);
        return "Removing reference succeeded";
    }
    
    public void editArticle(int index, String bibtexkey,String author,
            String title,String journal,String year,String volume,String number,
            String pages,String month,String note) {
        
        Article article = (Article) getReferences().get(index);
        article.setBibtexKey(bibtexkey);
                
        article.setAuthor(author);
        article.setTitle(title);
        article.setJournal(journal);
        article.setYear(year);

        // vapaavalintaiset
        article.setVolume(volume);
        article.setNumber(number);
        article.setPages(pages);
        article.setMonth(month);
        article.setNote(note);
    }
    
    public void editBook(int index, String bibtexkey,String author,
            String title,String editor,String year,String volume,String number,
            String publisher,String month,String note,String series,
            String address, String edition) {
        
        Reference reference = getReferences().get(index);
        Book kirja = (Book) reference;
        
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
    }
    
    public void editInproceedings(int index, String bibtexkey,String author,
            String title,String booktitle,String year,String editor,String
            volume,String number,String series,String pages,String address,
            String month,String organization,String publisher,String note) {
        Reference reference = getReferences().get(index);
        Inproceedings inproceedings = (Inproceedings) reference;
        
        inproceedings.setBibtexKey(bibtexkey);
                
        inproceedings.setAuthor(author);
        inproceedings.setTitle(title);
        inproceedings.setBooktitle(booktitle);
        inproceedings.setYear(year);

        // vapaavalintaiset + volume or number
        inproceedings.setEditor(editor);
        inproceedings.setVolume(volume);
        inproceedings.setNumber(number);
        inproceedings.setSeries(series);
        inproceedings.setPages(pages);
        inproceedings.setAddress(address);
        inproceedings.setMonth(month);
        inproceedings.setOrganization(organization);
        inproceedings.setPublisher(publisher);
        inproceedings.setNote(note);
    }
    
    public String exportReferences(String name) {
        try {
            BibtexExporter.exportBibtex(references, name);
            return "Exporting file succeeded";
        }
        catch (Exception e) {
            return "Exporting file failed";
        }
    }
}
