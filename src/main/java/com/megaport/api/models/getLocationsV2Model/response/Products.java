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
public class Products{

	@JsonProperty("megaport")
	private List<Integer> megaport;

	@JsonProperty("mcr")
	private boolean mcr;

	@JsonProperty("mcrVersion")
	private int mcrVersion;

	@JsonProperty("mcr2")
	private List<Integer> mcr2;

	@JsonProperty("mcr1")
	private List<Integer> mcr1;

	@JsonProperty("mve")
	private List<MveItem> mve;


}