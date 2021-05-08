package com.hector.entelgy.helpers;

import java.util.List;

public class JsonResponse {

    private List<String> data;

    public JsonResponse(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }
}
