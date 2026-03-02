package com.megaport.api.properties.enumProp;

import lombok.Getter;

@Getter
public enum LocationStatuses {

    Active("Active"),
    Extended("Extended"),
    Deployment("Deployment"),
    New("New"),
    Restricted("Restricted"),
    Expired("Expired");

    private String locationStatuses;

    LocationStatuses(String locationStatuses) {
        this.locationStatuses = locationStatuses;
    }


}
