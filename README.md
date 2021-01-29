# DropWizard_gelocation

To run this application: 
Open project in any IDE
Open configuration.yml file
Update Database username and password and url (by default its localhost)
Run the application as java application with following arguments 
server configuration.yml

To create a table in your mysql database use this query. (We have used mysql database to store and access the responses)SQL script to create database: 

CREATE TABLE `geolocation` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `status` varchar(30) DEFAULT NULL,
  `message` varchar(30) DEFAULT NULL,
  `continent` varchar(30) DEFAULT NULL,
  `continentCode` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `countryCode` varchar(30) DEFAULT NULL,
  `region` varchar(30) DEFAULT NULL,
  `regionName` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `district` varchar(30) DEFAULT NULL,
  `zip` varchar(30) DEFAULT NULL,
  `lat` varchar(30) DEFAULT NULL,
  `lon` varchar(30) DEFAULT NULL,
  `timezone` varchar(30) DEFAULT NULL,
  `offset` varchar(30) DEFAULT NULL,
  `currency` varchar(30) DEFAULT NULL,
  `isp` varchar(30) DEFAULT NULL,
  `org` varchar(30) DEFAULT NULL,
  `ascode` varchar(30) DEFAULT NULL,
  `asname` varchar(30) DEFAULT NULL,
  `reverse` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  `proxy` varchar(30) DEFAULT NULL,
  `hosting` varchar(30) DEFAULT NULL,
  `query` varchar(30) DEFAULT NULL,
  `tiemstamp` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_general_ci;
After having database and your server up and running and running the application.

Use postman to check API responses.

For an e.g

•	Hit http://localhost:8080/geoLocation/ with your JSON response to store your data into the database.
•	Hit http://localhost:8080/geoLocation/{query} to access the data where {query} is your ip-address

1.	http://localhost:8080/geoLocation/ Your POST request with this as your JSON response.
{
  "id":4,
   "status":"status3",
   "message":"message",
   "continent":"continent",
   "continentCode":"continent code",
   "country":"country_1",
   "countryCode":"country code",
   "region":"region",
   "regionName":"region name",
   "city":"city",
   "district":"district",
   "zip":"zip",
   "lat":"lat",
   "lon":"lon",
   "timezone":"timezone",
   "offset":"offset",
   "currency":"currency",
   "isp":"isp",
   "org":"org",
   "ascode":"ascode",
   "asname":"asname",
   "reverse":"reverse",
   "mobile":"mobile",
   "proxy":"proxy",
   "hosting":"hosting",
   "query":"10.1.1.40"
}
2.	http://localhost:8080/geoLocation/10.1.1.40 Your GET request to access your database for 


