package com.hector.entelgy.reqres.services;

import com.hector.entelgy.reqres.models.DataUsersReqres;
import com.hector.entelgy.reqres.models.UserReqres;
import org.json.JSONArray;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

@Service
public class GetUsersFromReqres {

    private static final String GET_ALL_URL = "https://reqres.in/api/users";

    public DataUsersReqres get() throws IOException{

        String response = this.getDataFromReqres();
        JSONObject object = new JSONObject(response);

        return new DataUsersReqres(
                object.getInt("page"),
                object.getInt("per_page"),
                object.getInt("total"),
                object.getInt("total_pages"),
                this.getUsers(object.getJSONArray("data"))
        );

    }

    private List<UserReqres> getUsers(JSONArray data) {

        List<UserReqres> userReqresList = new ArrayList<>();

        JSONArray jsonArray = new JSONArray(data);

        for(int i=0; i < jsonArray.length(); i++)
        {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            UserReqres userReqres = new UserReqres(
                    jsonObject.getInt("id"),
                    jsonObject.getString("email"),
                    jsonObject.getString("first_name"),
                    jsonObject.getString("last_name"),
                    jsonObject.getString("avatar")
            );

            userReqresList.add(userReqres);
        }

        return userReqresList;
    }

    private String getDataFromReqres() throws IOException  {

        StringBuilder response = new StringBuilder();

        URL url = new URL(GET_ALL_URL);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String readLine;

        while ((readLine = reader.readLine()) != null) {
            response.append(readLine);
        }

        reader.close();

        return response.toString();

    }
}
