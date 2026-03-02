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
public class DetailsItem{

	@JsonProperty("size")
	private String size;

	@JsonProperty("cpuCoreCount")
	private int cpuCoreCount;

	@JsonProperty("label")
	private String label;

	@JsonProperty("ramGB")
	private int ramGB;


}