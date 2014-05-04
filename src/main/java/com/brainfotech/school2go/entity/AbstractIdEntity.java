package com.brainfotech.school2go.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.brainfotech.school2go.util.ThreadLocalUtil;

/**
 * Created by thameema on 4/27/14.
 */


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
    protected Long id;

    /**
     * Entity's creation date
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE", updatable = false)
    protected Date createDate;

    /**
     * Entity's created by
     */
    @Column(name = "CREATED_BY", updatable = false)
    protected String createdBy;

    /**
     * Entity's update date
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    protected Date updateDate;

    /**
     * Entity's updated by
     */
    @Column(name = "UPDATED_BY")
    protected String updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
    
    

    public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public boolean isIdSet() {
        return this.id != null;
    }



    @PrePersist
    private void prePresist() {
        DateTime nowUtc = new DateTime(DateTimeZone.UTC);
        this.createDate = nowUtc.toDate();
        this.updateDate = nowUtc.toDate();

        this.createdBy = this.updatedBy = ThreadLocalUtil.get();
        if (logger.isDebugEnabled()) {
            logger.debug("\n####### AbstractIdEntity.prePresist() : createdBy id [{}] [{}] \n", this.createdBy
                    , this.id + "|"  + this.getClass().getSimpleName());
        }
    }

    @PreUpdate
    private void preUpdate() {
        this.updateDate = new DateTime(DateTimeZone.UTC).toDate();
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

