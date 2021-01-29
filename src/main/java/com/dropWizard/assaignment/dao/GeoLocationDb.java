package com.dropWizard.assaignment.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import com.dropWizard.assaignment.dto.GeoLocation;

import io.dropwizard.hibernate.AbstractDAO;
import io.dropwizard.hibernate.UnitOfWork;

public class GeoLocationDb extends AbstractDAO<GeoLocation>{
	private static SessionFactory sessionFactory;
	public GeoLocationDb(SessionFactory sessionFactory) {
		super(sessionFactory);
		this.sessionFactory = sessionFactory;
	}

	public static HashMap<Integer, GeoLocation> geoLocations = new HashMap<>();
     
    public static List<GeoLocation> getGeoLocations(){
        return new ArrayList<GeoLocation>(geoLocations.values());
    }
     
    public static GeoLocation getGeoLocationById(Integer id){
        return geoLocations.get(id);
    }
     
    public static void updateGeoLocation(Integer id, GeoLocation employee){
    	
        geoLocations.put(id, employee);
    }
    
    public static void createGeoLocation(GeoLocation location) {
            location.setTiemstamp(LocalDateTime.now().toString());
            Session sessionOne = sessionFactory.openSession();
            sessionOne.beginTransaction();
            sessionOne.save(location);
            sessionOne.getTransaction().commit();

    }
     
    public static void removeGeoLocation(Integer id){
        geoLocations.remove(id);
    }
    
    public List<GeoLocation> getLocationByIP(String query){
    	StringBuilder builder = new StringBuilder("%");
    	builder.append(query);
    	return list(namedQuery("com.dropWizard.assaignment.dto.GeoLocation.findByQuerry")
    			.setParameter("query", builder.toString()));
    }
}