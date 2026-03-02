package com.megaport.api.locationsV2;

import com.megaport.api.models.getLocationsV2Model.response.GetLocationsV2ResponseModel;
import com.megaport.api.properties.enumProp.LocationStatuses;
import com.megaport.api.services.locationsV2Services.LocationsV2Service;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.megaport.api.conditions.Conditions.statusCode;
import static com.megaport.api.properties.enumProp.LocationStatuses.*;


public class GetLocationsV2Test {

    private LocationsV2Service locationsV2Service = new LocationsV2Service();

    @BeforeClass
    private void preConditions(){

    }

    @Test(groups = {"smoke"})
    public void getSingleLocationStatus_Active(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", Active);

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        getLocationsV2ResponseModel.getData().stream()
                .forEach(loc -> Assert.assertEquals(loc.getStatus(), Active.name(), "Wrong status for id=" + loc.getId()));

    }

    @Test()
    public void getSingleLocationStatus_Extended(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", Extended);

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        getLocationsV2ResponseModel.getData().stream()
                .forEach(loc -> Assert.assertEquals(loc.getStatus(), Extended.name(), "Wrong status for id=" + loc.getId()));

    }

    @Test()
    public void getSingleLocationStatus_Deployment(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", Deployment);

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        getLocationsV2ResponseModel.getData().stream()
                .forEach(loc -> Assert.assertEquals(loc.getStatus(), Deployment.name(), "Wrong status for id=" + loc.getId()));

    }

    @Test()
    public void getSingleLocationStatus_New(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", New);

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        getLocationsV2ResponseModel.getData().stream()
                .forEach(loc -> Assert.assertEquals(loc.getStatus(), New.name(), "Wrong status for id=" + loc.getId()));

    }

    @Test()
    public void getSingleLocationStatus_Restricted(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", Restricted);

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        getLocationsV2ResponseModel.getData().stream()
                .forEach(loc -> Assert.assertEquals(loc.getStatus(), Restricted.name(), "Wrong status for id=" + loc.getId()));

    }

    @Test()
    public void getSingleLocationStatus_Expired(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", Expired);

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        getLocationsV2ResponseModel.getData().stream()
                .forEach(loc -> Assert.assertEquals(loc.getStatus(), Expired.name(), "Wrong status for id=" + loc.getId()));

    }

    @Test()
    public void getMultupleLocationsStatuses_Active_Extended(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", List.of(Active.name(), Extended.name()));

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        Set<String> allowedStatuses = Set.of(Active.name(), Extended.name());

        getLocationsV2ResponseModel.getData().forEach(loc ->
                Assert.assertTrue(
                        allowedStatuses.contains(loc.getStatus()),
                        "Wrong status for id=" + loc.getId()
                                + ". Expected one of " + allowedStatuses
                                + ", but was '" + loc.getStatus() + "'"
                )
        );

    }

    @Test(groups = {"smoke"})
    public void getMultupleLocationsStatuses_Active_Extended_Deployment(){

        Map<String, Object> params = new HashMap<>();
        params.put("locationStatuses", List.of(Active.name(), Extended.name(), Deployment.name()));

        GetLocationsV2ResponseModel getLocationsV2ResponseModel = locationsV2Service
                .getLocations(params)
                .shouldHave(statusCode(200))
                .responseAs(GetLocationsV2ResponseModel.class);

        Set<String> allowedStatuses = Set.of(Active.name(), Extended.name(), Deployment.name());

        getLocationsV2ResponseModel.getData().forEach(loc ->
                Assert.assertTrue(
                        allowedStatuses.contains(loc.getStatus()),
                        "Wrong status for id=" + loc.getId()
                                + ". Expected one of " + allowedStatuses
                                + ", but was '" + loc.getStatus() + "'"
                )
        );

    }







}
