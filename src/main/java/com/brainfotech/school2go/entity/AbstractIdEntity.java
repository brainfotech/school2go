package com.brainfotech.school2go.entity;

import com.brainfotech.school2go.util.CustomJsonDateSerializer;
import com.brainfotech.school2go.util.ThreadLocalUtil;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by thameema on 4/27/14.
 */

@JsonSerialize
@MappedSuperclass
public abstract class AbstractIdEntity implements Serializable {

    private static final long serialVersionUID = -5268166765372397119L;


    protected static final Logger logger = LoggerFactory.getLogger(AbstractIdEntity.class);

    /**
     * Entity's Id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected String id;

    /**
     * Entity's creation date
     */
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", updatable = false)
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    protected Date created;

    /**
     * Entity's created by
     */
    @JsonIgnore
    @Column(name = "CREATED_BY", updatable = false)
    protected String createdBy;

    /**
     * Entity's update date
     */
    @JsonIgnore
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    @JsonSerialize(using = CustomJsonDateSerializer.class)
    protected Date updated;

    /**
     * Entity's updated by
     */
    @XmlTransient
    @JsonIgnore
    @Column(name = "UPDATED_BY")
    protected String updatedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonIgnore
    @XmlTransient
    public boolean isIdSet() {
        return this.id != null;
    }



    @PrePersist
    private void prePresist() {
        DateTime nowUtc = new DateTime(DateTimeZone.UTC);
        this.created = nowUtc.toDate();
        this.updated = nowUtc.toDate();

        this.createdBy = this.updatedBy = ThreadLocalUtil.get();
        if (logger.isDebugEnabled()) {
            logger.debug("\n####### AbstractIdEntity.prePresist() : createdBy id [{}] [{}] \n", this.createdBy
                    , this.id + "|"  + this.getClass().getSimpleName());
        }
    }

    @PreUpdate
    private void preUpdate() {
        this.updated = new DateTime(DateTimeZone.UTC).toDate();
        this.updatedBy = ThreadLocalUtil.get();
        if (logger.isDebugEnabled()) {
            logger.debug("\n## AbstractIdEntity.preUpdate() : User id [{}] [{}] \n", this.updatedBy
                    , this.id + "|"  + this.getClass().getSimpleName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (this.isIdSet() && o instanceof AbstractIdEntity) {
            AbstractIdEntity that = (AbstractIdEntity) o;
            return this.getId().equals(that.getId());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.isIdSet() ? 19* this.id.hashCode():super.hashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

