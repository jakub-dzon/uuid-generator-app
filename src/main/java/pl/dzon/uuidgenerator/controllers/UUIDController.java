package pl.dzon.uuidgenerator.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/generator/uuid")
public class UUIDController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public UUID generate() {
        return UUID.randomUUID();
    }
}