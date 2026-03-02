package com.megaport.api.models.getLocationsV2Model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class DataItem{

	@JsonProperty("country")
	private String country;

	@JsonProperty("liveDate")
	private long liveDate;

	@JsonProperty("siteCode")
	private String siteCode;

	@JsonProperty("networkRegion")
	private String networkRegion;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("campus")
	private String campus;

	@JsonProperty("productCapacityMap")
	private Object productCapacityMap;

	@JsonProperty("latitude")
	private Object latitude;

	@JsonProperty("diversityZones")
	private DiversityZones diversityZones;

	@JsonProperty("products")
	private Products products;

	@JsonProperty("market")
	private String market;

	@JsonProperty("metro")
	private String metro;

	@JsonProperty("name")
	private String name;

	@JsonProperty("vRouterAvailable")
	private boolean vRouterAvailable;

	@JsonProperty("id")
	private int id;

	@JsonProperty("dc")
	private Dc dc;

	@JsonProperty("status")
	private String status;

	@JsonProperty("longitude")
	private Object longitude;

	@JsonProperty("ordering_message")
	private Object orderingMessage;


}