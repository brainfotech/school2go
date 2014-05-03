package com.brainfotech.school2go.util;

/**
 * Created by thameema on 5/2/14.
 */

public class Pagination {

    public Sort sort;

    private int page;

    private int size;

    public Pagination(int page, int size, Sort sort) {
        if (page < 0) {
            throw new IllegalArgumentException("Page number should be non negative number");
        }
        if (size < 0) {
            throw new IllegalArgumentException("Page size should be non negative number");
        }

        this.page = page;
        this.size = size;
        this.sort = sort;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}

