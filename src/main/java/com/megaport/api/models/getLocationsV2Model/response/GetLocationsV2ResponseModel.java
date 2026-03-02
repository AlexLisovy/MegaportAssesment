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
public class GetLocationsV2ResponseModel {

	@JsonProperty("data")
	private List<DataItem> data;

	@JsonProperty("terms")
	private String terms;

	@JsonProperty("message")
	private String message;


}