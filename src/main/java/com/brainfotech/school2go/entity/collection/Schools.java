package com.brainfotech.school2go.entity.collection;

import com.brainfotech.school2go.entity.School;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.xml.bind.annotation.XmlElement;
import java.util.Iterator;
import java.util.List;

/**
 * Created by thameema on 5/2/14.
 */
public class Schools implements Page<School> {

    private List<School> schools;

    public Schools(List<School> content, Pageable pageable, long total) {

    }


    /**
     * {@link School}
     */
    @XmlElement(name = "school")
    public List<School> getSchools() {
        return this.schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getTotalPages() {
        return 0;
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public long getTotalElements() {
        return 0;
    }

    @Override
    public boolean hasPreviousPage() {
        return false;
    }

    @Override
    public boolean isFirstPage() {
        return false;
    }

    @Override
    public boolean hasNextPage() {
        return false;
    }

    @Override
    public boolean isLastPage() {
        return false;
    }

    @Override
    public Pageable nextPageable() {
        return null;
    }

    @Override
    public Pageable previousPageable() {
        return null;
    }

    @Override
    public Iterator<School> iterator() {
        return null;
    }

    @Override
    public List<School> getContent() {
        return null;
    }

    @Override
    public boolean hasContent() {
        return false;
    }

    @Override
    public Sort getSort() {
        return null;
    }
}
