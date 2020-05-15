package com.company.muzey.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@NamePattern("%s|title")
@Table(name = "MUZEY_UNIVERSITY")
@Entity(name = "muzey_University")
public class University extends StandardEntity
{
    private static final long serialVersionUID = -895121177717738978L;

    @Lob
    @Column(name = "TITLE")
    protected String title;

    @Lob
    @Column(name = "CITY")
    protected String city;

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
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