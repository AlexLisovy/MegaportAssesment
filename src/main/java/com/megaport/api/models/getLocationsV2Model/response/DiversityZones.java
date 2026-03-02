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
public class DiversityZones{

	@JsonProperty("megaport")
	private List<MegaportItem> megaport;

	@JsonProperty("mcr2")
	private List<Mcr2Item> mcr2;

	@JsonProperty("mve")
	private List<MveItem> mve;

}