package com.myssyt.bibtex.domain;

import java.io.Serializable;

public class Viite implements Serializable {

    private String bibtexKey;
    

    public Viite(String bibtexKey) {
        this.bibtexKey = bibtexKey;
    }

    /**
     * @return the bibtexKey
     */
    public String getBibtexKey() {
        return bibtexKey;
    }

    /**
     * @param bibtexKey the bibtexKey to set
     */
    public void setBibtexKey(String bibtexKey) {
        this.bibtexKey = bibtexKey;
    }
}
