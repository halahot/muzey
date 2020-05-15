package com.company.muzey.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|title")
@Table(name = "MUZEY_ERA")
@Entity(name = "muzey_Era")
public class Era extends StandardEntity
{
    private static final long serialVersionUID = -7130094003586953172L;

    @Lob
    @Column(name = "TITLE")
    protected String title;

    @Column(name = "TIME_START")
    protected String timeStart;

    @Column(name = "TIME_END")
    protected String timeEnd;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KIND_ID")
    protected KindOfEra kind;

    public KindOfEra getKind()
    {
        return kind;
    }

    public void setKind(KindOfEra kind)
    {
        this.kind = kind;
    }

    public String getTimeEnd()
    {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd)
    {
        this.timeEnd = timeEnd;
    }

    public String getTimeStart()
    {
        return timeStart;
    }

    public void setTimeStart(String timeStart)
    {
        this.timeStart = timeStart;
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