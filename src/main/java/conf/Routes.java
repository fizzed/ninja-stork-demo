package conf;

import ninja.AssetsController;
import ninja.Router;
import ninja.application.ApplicationRoutes;
import controllers.Application;

public class Routes implements ApplicationRoutes {

    @Override
    public void init(Router router) {
        router.GET().route("/").with(Application.class, "index");
        router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");
    }
    
}