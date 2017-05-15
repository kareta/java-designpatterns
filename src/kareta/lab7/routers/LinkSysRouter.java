package kareta.lab7.routers;

import kareta.lab7.confugurators.Configurator;

/**
 * Created by vitya on 03.04.17.
 */
public class LinkSysRouter implements Router {

    public LinkSysRouter() {
        System.out.println("LinkSys Router");
    }

    @Override
    public void configure(Configurator configurator) {
        configurator.configure();
    }
}
