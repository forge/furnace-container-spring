/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.furnace.container.spring;

import org.jboss.forge.furnace.Furnace;
import org.jboss.forge.furnace.addons.Addon;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 */
public class SpringFurnaceContext
{
   private Furnace furnace;
   private Addon addon;

   public Furnace getFurnace()
   {
      return furnace;
   }

   public void setFurnace(Furnace furnace)
   {
      this.furnace = furnace;
   }

   public Addon getAddon()
   {
      return addon;
   }

   public void setAddon(Addon addon)
   {
      this.addon = addon;
   }

}
