/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Dao.PostDAO;
import entity.Post;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Karim
 */
@Path("/posts")
public class PostService
{
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Post> getPosts() {
        List<Post> posts = PostDAO.findPostEntities();
        return posts;
    }



}