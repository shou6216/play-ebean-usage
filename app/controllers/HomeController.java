package controllers;

import models.Child;
import models.Parent;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	String parentId= "100";
    	String childId = "1";
    	
    	Parent parent = Parent.findByPK(parentId);
    	Child child= Child.findByPK(childId);
    	
        return ok(index.render(parent, child));
    }

}
