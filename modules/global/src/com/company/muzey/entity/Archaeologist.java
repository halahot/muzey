package com.company.muzey.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|fullName")
@Table(name = "MUZEY_ARCHAEOLOGIST")
@Entity(name = "muzey_Archaeologist")
public class Archaeologist extends StandardEntity
{
    private static final long serialVersionUID = 4772391162955859049L;

    @Lob
    @Column(name = "FULL_NAME")
    protected String fullName;

    @Column(name = "AGE")
    protected Integer age;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNIVERSITY_ID")
    protected University university;

    public University getUniversity()
    {
        return university;
    }

    public void setUniversity(University university)
    {
        this.university = university;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
}