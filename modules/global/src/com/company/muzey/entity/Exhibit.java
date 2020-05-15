package com.company.muzey.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|title")
@Table(name = "MUZEY_EXHIBIT")
@Entity(name = "muzey_Exhibit")
public class Exhibit extends StandardEntity
{
    private static final long serialVersionUID = -3060353309610789984L;

    @Lob
    @Column(name = "TITLE")
    protected String title;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLACE_ID")
    protected Place place;

    @Column(name = "AUTHOR")
    protected String author;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ERA_ID")
    protected Era era;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXT_TYPE_ID")
    protected ExType extType;

    public Place getPlace()
    {
        return place;
    }

    public void setPlace(Place place)
    {
        this.place = place;
    }

    public ExType getExtType()
    {
        return extType;
    }

    public void setExtType(ExType extType)
    {
        this.extType = extType;
    }

    public Era getEra()
    {
        return era;
    }

    public void setEra(Era era)
    {
        this.era = era;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}