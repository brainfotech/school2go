package com.brainfotech.school2go.rest;

/**
 * Created by thameema on 5/1/14.
 */
public final class ApiPath {

    private ApiPath(){}
    public static final String PATH_SEPARATOR = "/";
    public static final String V1_CONTEXT = PATH_SEPARATOR + "v1" + PATH_SEPARATOR;

    // /v1/schools/{schoolId}/families/{familyId}/students/{studentId}/

    public static final String SCHOOLS = "schools";   //orgs
    public static final String FAMILIES = "families";   //devs
    public static final String STUDENTS = "students"; //apps
    public static final String SCHOOL_QUALIFIER = "{schoolId}";
    public static final String SCHOOL_FRAGMENT = "schoolId";

    public static final String SCHOOLS_BASE_PATH = V1_CONTEXT + SCHOOLS;
    public static final String SCHOOL_BASE_PATH = SCHOOLS_BASE_PATH + PATH_SEPARATOR + SCHOOL_QUALIFIER;

    public static final String FAMILY_QUALIFIER = "{familyId}";
    public static final String FAMILY_FRAGMENT = "familyId";
    public static final String FAMILIES_BASE_PATH = SCHOOL_BASE_PATH + PATH_SEPARATOR +  FAMILIES;
    public static final String FAMILY_BASE_PATH = FAMILIES_BASE_PATH + PATH_SEPARATOR + FAMILY_QUALIFIER;

    public static final String STUDENT_QUALIFIER = "{studentId}";
    public static final String STUDENT_FRAGMENT = "studentId";
    public static final String STUDENTS_BASE_PATH = FAMILY_BASE_PATH + PATH_SEPARATOR +  STUDENTS;
    public static final String STUDENT_BASE_PATH = STUDENTS_BASE_PATH + PATH_SEPARATOR + STUDENT_QUALIFIER;



    // pagination
    public static final String PAGINATION_RETRIEVE_ALL = "all";
    public static final String PAGINATION_PAGE_NUMBER = "page";
    public static final String PAGINATION_PAGE_SIZE = "size";
    public static final String PAGINATION_SORT = "sort";

    public static final String PAGINATION_RETRIEVE_ALL_DEFAULT_VALUE = "false";
    public static final String PAGINATION_PAGE_NUMBER_DEFAULT_VALUE = "1";
    public static final String PAGINATION_PAGE_SIZE_DEFAULT_VALUE = "20";
    public static final String PAGINATION_SORT_DEFAULT_VALUE = "UPDATED:DESC";




}
