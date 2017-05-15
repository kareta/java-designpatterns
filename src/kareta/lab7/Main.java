package kareta.lab7;

import kareta.lab7.confugurators.LinuxConfigurator;
import kareta.lab7.confugurators.WindowsConfigurator;
import kareta.lab7.routers.DlinkRouter;
import kareta.lab7.routers.LinkSysRouter;
import kareta.lab7.routers.TplinkRouter;


public class Main {
    public static void main(String[] args) {

        LinuxConfigurator linuxConfigurator = new LinuxConfigurator();
        WindowsConfigurator windowsConfigurator = new WindowsConfigurator();

        TplinkRouter tplinkRouter = new TplinkRouter();
        tplinkRouter.configure(linuxConfigurator);
        System.out.println();

        DlinkRouter dlinkRouter = new DlinkRouter();
        dlinkRouter.configure(windowsConfigurator);
        System.out.println();

        LinkSysRouter linkSysRouter = new LinkSysRouter();
        linkSysRouter.configure(linuxConfigurator);
        System.out.println();
    }
}
