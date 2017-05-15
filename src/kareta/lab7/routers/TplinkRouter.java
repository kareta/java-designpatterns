package kareta.lab7.routers;


import kareta.lab7.confugurators.Configurator;

/**
 * Created by vitya on 03.04.17.
 */
public class TplinkRouter implements Router {

    public TplinkRouter() {
        System.out.println("TpLink Router");
    }

    @Override
    public void configure(Configurator configurator) {
        configurator.configure();
    }
}
