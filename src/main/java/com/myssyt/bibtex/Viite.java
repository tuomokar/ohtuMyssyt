package com.myssyt.bibtex;

import java.io.Serializable;

public class Viite implements Serializable {

    private String bibtexKey;
    private boolean exportable;

    public Viite(String bibtexKey) {
        this.bibtexKey = bibtexKey;
        exportable = true;
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
    
    /**
     * @return exportable (true/false)
     */
    public boolean getExportable() {
        return exportable;
    }

    /**
     * @param exportable (true/false)
     */
    public void setExportable(boolean exportable) {
        this.exportable = exportable;
    }
}
