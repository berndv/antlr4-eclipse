/*
 * Copyright 2015 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.antlr4.eclipse.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class Activator extends AbstractUIPlugin {

   // The plug-in ID
   public static final String PLUGIN_ID = "org.sourcepit.antlr4.eclipse.ui"; //$NON-NLS-1$

   // The shared instance
   private static Activator plugin;

   public Activator() {
   }

   @Override
   public void start(BundleContext context) throws Exception {
      super.start(context);
      plugin = this;
   }

   @Override
   public void stop(BundleContext context) throws Exception {
      plugin = null;
      super.stop(context);
   }

   /**
    * @return the shared instance
    */
   public static Activator getDefault() {
      return plugin;
   }

   public Image getImage(String path) {
      final ImageRegistry imageRegistry = getImageRegistry();
      Image image = imageRegistry.get(path);
      if (image == null) {
         final ImageDescriptor imageDescriptor = imageDescriptorFromPlugin(PLUGIN_ID, path);
         if (imageDescriptor == null) {
            throw new IllegalArgumentException(String.format("Image %s not found in plug-in %s.", path, PLUGIN_ID));
         }
         image = imageDescriptor.createImage();
         imageRegistry.put(path, image);
      }
      return image;
   }

}
