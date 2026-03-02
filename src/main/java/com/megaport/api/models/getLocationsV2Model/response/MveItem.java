package com.megaport.api.models.getLocationsV2Model.response;

import java.util.List;
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
public class MveItem{

	@JsonProperty("maxAvailableCpuCores")
	private int maxAvailableCpuCores;

	@JsonProperty("name")
	private String name;

	@JsonProperty("product")
	private String product;

	@JsonProperty("sizes")
	private List<String> sizes;

	@JsonProperty("releaseImage")
	private boolean releaseImage;

	@JsonProperty("vendor")
	private String vendor;

	@JsonProperty("maxCpuCount")
	private int maxCpuCount;

	@JsonProperty("details")
	private List<DetailsItem> details;

	@JsonProperty("id")
	private int id;

	@JsonProperty("version")
	private String version;

	@JsonProperty("vendorDescription")
	private String vendorDescription;

}