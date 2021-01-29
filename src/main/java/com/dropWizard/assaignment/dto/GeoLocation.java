package com.dropWizard.assaignment.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "GeoLocation")
@NamedQueries({
	@NamedQuery(
	name="com.dropWizard.assaignment.dto.GeoLocation.findByQuerry", query = "select g from GeoLocation g where g.query like :query")})
public class GeoLocation {
	@NotNull
	@Id
	@GeneratedValue
	@JsonProperty("id")
    private Integer id;
	@JsonProperty("status")
    private String status;
	@JsonProperty("message")
    private String message;
	@JsonProperty("continent")
    private String continent;
	@JsonProperty("continentCode")
    private String continentCode;
	@JsonProperty("country")
    private String country;
	@JsonProperty("countryCode")
    private String countryCode;
	@JsonProperty("region")
    private String region;
	@JsonProperty("regionName")
    private String regionName;
	@JsonProperty("city")
    private String city;
	@JsonProperty("district")
    private String district;
	@JsonProperty("zip")
    private String zip;
	@JsonProperty("lat")
    private String lat;
	@JsonProperty("lon")
    private String lon;
	@JsonProperty("timezone")
    private String timezone;
	@JsonProperty("offset")
    private String offset;
	@JsonProperty("currency")
    private String currency;
	@JsonProperty("isp")
    private String isp;
	@JsonProperty("org")
    private String org;
	@JsonProperty("ascode")
    private String ascode;
	@JsonProperty("asname")
    private String asname;
	@JsonProperty("reverse")
    private String reverse;
	@JsonProperty("mobile")
    private String mobile;
	@JsonProperty("proxy")
    private String proxy;
	@JsonProperty("hosting")
    private String hosting;
	@JsonProperty("query")
    private String query;
	@JsonProperty("tiemstamp")
	private String tiemstamp;
 
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getContinentCode() {
		return continentCode;
	}

	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIsp() {
		return isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getAscode() {
		return ascode;
	}

	public void setAscode(String ascode) {
		this.ascode = ascode;
	}

	public String getAsname() {
		return asname;
	}

	public void setAsname(String asname) {
		this.asname = asname;
	}

	public String getReverse() {
		return reverse;
	}

	public void setReverse(String reverse) {
		this.reverse = reverse;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getProxy() {
		return proxy;
	}

	public void setProxy(String proxy) {
		this.proxy = proxy;
	}

	public String getHosting() {
		return hosting;
	}

	public void setHosting(String hosting) {
		this.hosting = hosting;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public GeoLocation(){
    }
 
    
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
    
	public String getTiemstamp() {
		return tiemstamp;
	}

	public void setTiemstamp(String tiemstamp) {
		this.tiemstamp = tiemstamp;
	}

	@Override
	public String toString() {
		return "GeoLocation [id=" + id + ", status=" + status + ", message=" + message + ", continent=" + continent
				+ ", continentCode=" + continentCode + ", country=" + country + ", countryCode=" + countryCode
				+ ", region=" + region + ", regionName=" + regionName + ", city=" + city + ", district=" + district
				+ ", zip=" + zip + ", lat=" + lat + ", lon=" + lon + ", timezone=" + timezone + ", offset=" + offset
				+ ", currency=" + currency + ", isp=" + isp + ", org=" + org + ", ascode=" + ascode + ", asname=" + asname
				+ ", reverse=" + reverse + ", mobile=" + mobile + ", proxy=" + proxy + ", hosting=" + hosting
				+ ", query=" + query + "]";
	}
}