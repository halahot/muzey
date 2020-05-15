package com.company.muzey.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|title")
@Table(name = "MUZEY_KIND_OF_ERA")
@Entity(name = "muzey_KindOfEra")
public class KindOfEra extends StandardEntity
{
    private static final long serialVersionUID = -8151681687941386502L;

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