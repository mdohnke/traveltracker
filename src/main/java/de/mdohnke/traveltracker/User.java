package de.mdohnke.traveltracker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by mdohnke on 27.10.16.
 */
@Path("users")
public class User {

    private String username;
    private String password;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a application/json response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt() {

        //TODO: Implement DB access, list users

        return "Got it!";
    }
}
