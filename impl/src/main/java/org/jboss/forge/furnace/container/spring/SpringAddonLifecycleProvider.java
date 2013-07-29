package org.jboss.forge.furnace.container.spring;

import org.jboss.forge.furnace.Furnace;
import org.jboss.forge.furnace.addons.Addon;
import org.jboss.forge.furnace.addons.AddonRegistry;
import org.jboss.forge.furnace.lifecycle.AddonLifecycleProvider;
import org.jboss.forge.furnace.lifecycle.ControlType;
import org.jboss.forge.furnace.services.ServiceRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAddonLifecycleProvider implements AddonLifecycleProvider
{

   private Furnace furnace;

   private ApplicationContext context;

   @Override
   public void initialize(Furnace furnace, AddonRegistry registry, Addon self) throws Exception
   {
      this.furnace = furnace;
   }

   @Override
   public void start(Addon addon) throws Exception
   {
      context = new ClassPathXmlApplicationContext("/META-INF/spring/application-container.xml");
      SpringFurnaceContext springFurnaceContext = (SpringFurnaceContext) context.getBean("springFurnaceContext");
      springFurnaceContext.setFurnace(furnace);
      springFurnaceContext.setAddon(addon);
   }

   @Override
   public void stop(Addon addon) throws Exception
   {
   }

   @Override
   public ServiceRegistry getServiceRegistry(Addon addon) throws Exception
   {
      return null;
   }

   @Override
   public void postStartup(Addon addon) throws Exception
   {

   }

   @Override
   public void preShutdown(Addon addon) throws Exception
   {

   }

   @Override
   public ControlType getControlType()
   {
      return ControlType.DEPENDENTS;
   }

}
