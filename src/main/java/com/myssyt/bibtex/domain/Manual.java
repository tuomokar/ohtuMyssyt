
package com.myssyt.bibtex.domain;

import com.myssyt.bibtex.domain.Reference;
import com.myssyt.bibtex.domain.Reference;

/**
 *
 * @author jphkylli
 */
public class Manual extends Reference {

    public Manual(String bibtexKey, String title, String author, 
            String organization, String address, String edition, String month, 
            String year, String note) {
        
        super(bibtexKey);
        
        super.setTitle(title);
        super.setAuthor(author);
        super.setOrganization(organization);
        super.setAddress(address);
        super.setEdition(edition);
        super.setMonth(month);
        super.setYear(year);
        super.setNote(note);
    }
  
}
