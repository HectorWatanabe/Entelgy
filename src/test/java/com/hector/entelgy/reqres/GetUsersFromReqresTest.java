package com.hector.entelgy.reqres;

import com.hector.entelgy.reqres.models.DataUsersReqres;
import com.hector.entelgy.reqres.services.GetUsersFromReqres;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class GetUsersFromReqresTest {

    private GetUsersFromReqres getUsersFromReqres;

    @Before
    public void before() {
        this.getUsersFromReqres = new GetUsersFromReqres();
    }

    @Test
    public void test() throws IOException{

        DataUsersReqres response = this.getUsersFromReqres.get();

        assertNotNull(response);

        System.out.println(">>>> Page From Reqres: " + response.getPage());
        System.out.println(">>>> Per Page From Reqres: " + response.getPerPage());
        System.out.println(">>>> Total From Reqres: " + response.getTotal());
        System.out.println(">>>> Users From Reqres: " + response.getUserReqresList());

    }

}
