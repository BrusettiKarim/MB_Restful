/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Dao.PostDAO;
import entity.Post;
import java.util.Date;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post getPost(@PathParam("id") String postId) {
        Post p = PostDAO.findPost(Long.parseLong(postId));
        return p;
    }
        
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPost(Post p) {
        p.setDataOra(new Date());
        PostDAO.create(p);
}
}