
package com.brainfotech.school2go.entity.collection;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;


public class Pager {

    public Pager(){

    }

    public Pager(long totalRecords, List entityCollection){
      this.entityCollection = entityCollection;
      this.totalRecords = totalRecords;
    }

    protected Long totalRecords;

    @XmlTransient
    @JsonIgnore
    List entityCollection;

    @XmlAttribute(name = "totalRecords")
    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List getEntityCollection() {
        return entityCollection;
    }

    public void setEntityCollection(List entityCollection) {
        this.entityCollection = entityCollection;
    }
}
