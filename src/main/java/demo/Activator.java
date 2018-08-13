package demo;

import ch.vorburger.minecraft.osgi.api.CommandRegistration;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.spongepowered.api.event.EventListener;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        context.registerService(CommandRegistration.class, new HelloWorldCommand(), null);
        context.registerService(EventListener.class, new ExampleEventListener(), null);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
    }

}

