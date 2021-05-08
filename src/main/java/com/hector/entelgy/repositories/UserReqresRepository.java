package com.hector.entelgy.repositories;

import com.hector.entelgy.models.User;
import com.hector.entelgy.reqres.models.UserReqres;

import com.hector.entelgy.reqres.services.GetUsersFromReqres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository("reqres")
public class UserReqresRepository implements UserRepository {

    @Autowired
    private GetUsersFromReqres getUsersFromReqres;

    @Override
    public List<String> getAll() {

        try{

            List<String> users = new ArrayList<>();
            List<UserReqres> userReqresList = getUsersFromReqres.get().getUserReqresList();

            for (UserReqres userRequest: userReqresList) {

                String stringBuilder = userRequest.getId() + "|" +
                        userRequest.getLastName() + "|" +
                        userRequest.getEmail();

                users.add(stringBuilder.toString());
            }

            return users;

        } catch (IOException exception) {

            return null;

        }

    }
}
