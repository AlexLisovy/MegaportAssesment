package com.megaport.api.services.locationsV2Services;

import com.megaport.api.AssertableResponse;
import com.megaport.api.services.SetupApiService;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class LocationsV2Service extends SetupApiService {

//    @Step("GET Locations V2")
//    public AssertableResponse getLocations() {
//        Response response =
//                baseSetupHeaders()
//                        .when()
//                        .get("/v2/locations")
//                        .then()
//                        .extract()
//                        .response();
//
//        return new AssertableResponse(response);
//    }

    @Step("GET Locations V2")
    public AssertableResponse getLocations() {
        return getLocations(Collections.emptyMap());
    }

    @Step("GET Locations V2 with query params")
    public AssertableResponse getLocations(Map<String, Object> queryParams) {

        // 1) Filter out nulls and blank strings
        Map<String, Object> filteredParams = queryParams.entrySet().stream()
                .filter(e -> e.getValue() != null)
                .filter(e -> {
                    Object v = e.getValue();
                    if (v instanceof String) {
                        return !((String) v).trim().isEmpty();
                    }
                    return true;
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // 2) Request
        Response response =
                baseSetupHeaders()
                        .queryParams(filteredParams)
                        .when()
                        .get("/v2/locations")
                        .then()
                        .extract()
                        .response();

        return new AssertableResponse(response);
    }

}
