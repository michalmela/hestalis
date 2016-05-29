package ngdemo.rest;

import ngdemo.domain.Login;
import ngdemo.domain.User;
import ngdemo.service.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/users")
public class UserRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        UserService userService = new UserService();
        return userService.getDefaultUser();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response authenticateUser(Login user) {

        try {
            // Authenticate the user using the credentials provided
            authenticate(user.getUsername(), user.getPassword());

            // Issue a token for the user
            String token = issueToken(user.getUsername());

            // Return the token on the response
            return Response.ok(token).build();

        } catch (Exception e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }

    private void authenticate(String username, String password) throws Exception {
        // Authenticate against a database, LDAP, file or whatever
        // Throw an Exception if the credentials are invalid
        if (!username.equals("daniel") || !password.equals("aaa")) {
            throw new Exception("Invalid login!");
        }
    }

    private String issueToken(String username) {
        // Issue a token (can be a random String persisted to a database or a JWT token)
        // The issued token must be associated to a user
        // Return the issued token
        return username;
    }

}
