package com.locationsV2;

import com.megaport.api.models.getLocationsV2Model.response.GetLocationsV2ResponseModel;
import com.megaport.api.services.locationsV2Services.LocationsV2Service;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.megaport.api.conditions.Conditions.statusCode;

public class GetLocationsV2Test {

    private LocationsV2Service locationsV2Service = new LocationsV2Service();

    @BeforeClass
    private void preConditions(){

    }

    @Test(groups = {"smoke"})
    public void getSingleStatusActive(){

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations()
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

    }


}
