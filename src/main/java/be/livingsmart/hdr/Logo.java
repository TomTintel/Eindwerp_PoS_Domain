/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.livingsmart.hdr;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  {@link Logo} class to connect standalone {@link Logo}s to possibly multiple {@link Item}s
 * 
 * @author Pieter
 */
@Entity
@Table
public class Logo implements Serializable {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    
    @Column(name = "name", nullable = false)
    private String name; 
    
    @Column(name = "url", nullable = false)
    private String url;
    
    /**
     *  Returns the name of the {@link Logo}
     * @return  String
     */
    public String getName() {
        return name;
    }

    /**
     *  Sets the name of the {@link Logo}
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  Returns the url of the {@link Logo}
     * @return  {@link String}
     */
    public String getUrl() {
        return url;
    }

    /**
     *  Sets the url of the {@link Logo}
     * @param url {@link String}
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *  Returns the id of the {@link Logo}
     * @return {@link Long}
     */
    public Long getId() {
        return id;
    }

    /**
     *  Sets the id of the {@link Logo} (automatically generated by jpa) 
     * @param id {@link Long}
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
    
    
}