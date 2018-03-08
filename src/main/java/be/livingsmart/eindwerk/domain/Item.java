/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.livingsmart.eindwerk.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Base class for {@link Item}s
 * 
 * 
 * @author Pieter
 */
@Entity
@Table
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    
    @Column(name = "price", nullable = false)
    private double price; 
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="logo", nullable=true)
    private Logo logo;
    
    @Column(name = "isFavorite", nullable = false)
    private boolean isFavorite;
    
    /**
     *  Base empty constuctor for {@link Item}
     */
    public Item (){}
    
    /**
     *  Returns the id
     * @return {@link Long} id
     */
    public Long getId() {
        return id;
    }

    /**
     *  Sets the id, this is automatically generated by the jpa repository
     * @param id {@link Long}
     */
    public void setId(Long id) 
    {
        if (id == null) throw new IllegalArgumentException("Id can't be null");
        this.id = id;
    }

    /**
     *  Returns the name 
     * @return {@link String}
     */
    public String getName() {
        return name;
    }

    /**
     *  Sets the name
     * @param name  {@link String}, can't be null or empty
     */
    public void setName(String name) 
    {
        if (name == null) throw new IllegalArgumentException("Name can't be empty");
        if (name.trim().isEmpty()) throw new IllegalArgumentException("Name can't be empty");
        this.name = name;
    }
    
    /**
     *  Returns the price
     * @return {@link Double}
     */
    public double getPrice() {
        return price;
    }

    /**
     *  Sets price 
     * @param price {@link Double} 
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *  Gets the {@link Logo}
     * @return {@link Logo} object
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     *  Sets the {@link Logo}
     * @param logo {@link Logo} 
     */
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    /**
     *  Returns the isFavorite {@link Boolean}
     * @return {@link Boolean}
     */
    public boolean isIsFavorite() {
        return isFavorite;
    }

    /**
     *  Sets ifFavorite {@link Boolean}
     * @param isFavorite {@link Boolean}
     */
    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    
    
    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof Item)) return false;
        Item item = (Item) object;
        if (!this.name.equals(item.getName())) return false;
        if (!(this.price == item.getPrice())) return false;
        return true;
    }

    
    

    

    
}
