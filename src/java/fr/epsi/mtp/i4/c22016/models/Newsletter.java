/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.epsi.mtp.i4.c22016.models;

import java.util.Date;

/**
 *
 * @author Adrien
 */
public class Newsletter {
    private int id;
    private String title;
    private Content content;
    private Date estimatedSendingDate;

    public Newsletter(String title, Content content, Date estimatedSendingDate) {
        this.title = title;
        this.content = content;
        this.estimatedSendingDate = estimatedSendingDate;
    }

    public Newsletter() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public Content getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * @return the estimatedSendingDate
     */
    public Date getEstimatedSendingDate() {
        return estimatedSendingDate;
    }

    /**
     * @param estimatedSendingDate the estimatedSendingDate to set
     */
    public void setEstimatedSendingDate(Date estimatedSendingDate) {
        this.estimatedSendingDate = estimatedSendingDate;
    }
}
