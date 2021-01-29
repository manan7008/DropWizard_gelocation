package com.dropWizard.assaignment.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import io.dropwizard.jersey.caching.CacheControl;
import org.skife.jdbi.cglib.core.CollectionUtils;

import com.codahale.metrics.annotation.Timed;
import com.dropWizard.assaignment.dao.GeoLocationDb;
import com.dropWizard.assaignment.dto.GeoLocation;

import io.dropwizard.hibernate.UnitOfWork;

@Path("/geoLocation")
@Produces(MediaType.APPLICATION_JSON)
public class GeoLocationRESTController {
	private GeoLocationDb geoLocationDb;
    public GeoLocationRESTController(GeoLocationDb geoLocationDb) {
        this.geoLocationDb = geoLocationDb;
    }

    @GET
    @Path("/{query}")
    @UnitOfWork
    @Timed
    @CacheControl(maxAge = 5, maxAgeUnit = TimeUnit.MINUTES)
    public Response getGeoLocationByQuery(@PathParam("query") String query) {
        List<GeoLocation> location = geoLocationDb.getLocationByIP(query);
        if (location != null || !location.isEmpty())
            return Response.ok(location).build();
        else
            return Response.status(Status.NOT_FOUND).build();
    }
 
    @POST
    public Response createGeoLocation(GeoLocation geoLocation) {
        	GeoLocationDb.createGeoLocation(geoLocation);
              return Response.ok("Record successfully created").build();
    }
}