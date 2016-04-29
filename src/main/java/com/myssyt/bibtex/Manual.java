/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myssyt.bibtex;

/**
 *
 * @author jphkylli
 */
public class Manual extends Viite {
    
    private String title;
    private String author;
    private String organization;
    private String address;
    private String edition;
    private String month;
    private String year; 
    private String note;

    public Manual(String bibtexKey, String title, String author, 
            String organization, String address, String edition, String month, 
            String year, String note) {
        
        super(bibtexKey);
        
        this.title = title;
        this.author = author;
        this.organization = organization;
        this.address = address;
        this.edition = edition;
        this.month = month;
        this.year = year;
        this.note = note;
    }

    /**
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @return organisation
     */
    public String getOrganization() {
        return organization;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     *
     * @return month
     */
    public String getMonth() {
        return month;
    }

    /**
     *
     * @return year
     */
    public String getYear() {
        return year;
    }

    /**
     *
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     *
     * @param organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @param edition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     *
     * @param month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     *
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     *
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
    
    
}
