package com.dropWizard.assaignment;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dropWizard.assaignment.configuration.AssaignmentConfiguration;
import com.dropWizard.assaignment.controller.GeoLocationRESTController;
import com.dropWizard.assaignment.dao.GeoLocationDb;
import com.dropWizard.assaignment.dto.GeoLocation;

public class App extends Application<AssaignmentConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
 
    private final HibernateBundle<AssaignmentConfiguration> hibernateBundle = new HibernateBundle<AssaignmentConfiguration>(GeoLocation.class) {
    	@Override
    	public DataSourceFactory getDataSourceFactory(AssaignmentConfiguration configuration) {
    		return configuration.getDataSourceFactory();
    	}
	};
    
	@Override
	public void initialize(Bootstrap<AssaignmentConfiguration> b) {
    	b.addBundle(hibernateBundle);
	}
    
    @Override
  public void run(AssaignmentConfiguration c, Environment e) throws Exception {
    	GeoLocationDb dao = new GeoLocationDb(hibernateBundle.getSessionFactory());
    	e.jersey().register(new GeoLocationRESTController(dao));
    }

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
}