package pl.dzon.uuidgenerator.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import java.net.HttpURLConnection;

@Path("/status")
public class StatusController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String report() {
        String status = System.getenv("APP_STATUS");
        if (status == null || "OK".equals(status)) {
            return "OK";
        }

        throw new WebApplicationException(HttpURLConnection.HTTP_UNAVAILABLE);
    }
}
