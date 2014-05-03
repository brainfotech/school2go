package com.brainfotech.school2go.rest.resources;

import com.brainfotech.school2go.entity.School;
import com.brainfotech.school2go.entity.collection.Schools;
import com.brainfotech.school2go.repository.SchoolRepository;
import com.brainfotech.school2go.util.ThreadLocalUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;
import static javax.ws.rs.core.MediaType.TEXT_XML;
import static com.brainfotech.school2go.rest.ApiPath.*;
import org.springframework.data.domain.Pageable;

/**
 * Created by thameema on 5/1/14.
 */

@Component
@Path(V1_CONTEXT)
@Produces({APPLICATION_JSON})
@Consumes({APPLICATION_JSON})
public class SchoolResource  {
    private static final Logger logger = LoggerFactory.getLogger(SchoolResource.class);

    @Autowired SchoolRepository schoolRepository;

    @GET
    @Path(SCHOOL_BASE_PATH)
    public School getSchool(@PathParam(SCHOOL_FRAGMENT) String id) {
        ThreadLocalUtil.setSchoolId(id);
        return null;
    }

    @GET
    @Path(SCHOOLS_BASE_PATH)
    public Page<School> getSchools(@DefaultValue(PAGINATION_RETRIEVE_ALL_DEFAULT_VALUE) @QueryParam(PAGINATION_RETRIEVE_ALL) boolean retrieveAll
            , @DefaultValue(PAGINATION_PAGE_NUMBER_DEFAULT_VALUE) @QueryParam(PAGINATION_PAGE_NUMBER) int page
            , @DefaultValue(PAGINATION_PAGE_SIZE_DEFAULT_VALUE) @QueryParam(PAGINATION_PAGE_SIZE) int size
            , @DefaultValue(PAGINATION_SORT_DEFAULT_VALUE) @QueryParam(PAGINATION_SORT) String sort) {

        Pageable paging;
        if(Sort.Direction.DESC.equals(sort))
            paging = new PageRequest(page,size, Sort.Direction.DESC);
        else
            paging = new PageRequest(page,size, Sort.Direction.ASC);

        return schoolRepository.findAll(paging);

    }


}
