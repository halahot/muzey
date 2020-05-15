package com.company.muzey.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|title")
@Table(name = "MUZEY_PLACE")
@Entity(name = "muzey_Place")
public class Place extends StandardEntity
{
    private static final long serialVersionUID = -59584866590189317L;

    @Column(name = "TITLE")
    protected String title;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
}