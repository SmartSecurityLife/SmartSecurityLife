/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.seam.security.examples.id_provider;

import java.util.LinkedList;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.jboss.seam.security.external.api.SamlIdentityProviderApi;
import org.jboss.seam.security.external.api.SamlIdentityProviderConfigurationApi;
import org.jboss.seam.security.external.saml.SamlExternalEntity;
import org.jboss.seam.security.external.saml.idp.SamlIdpSession;

@Model
public class Saml
{
   @Inject
   private SamlIdentityProviderApi samlIdp;

   @Inject
   private SamlIdentityProviderConfigurationApi samlIdpConfig;

   public List<String> getSpEntityIds()
   {
      List<String> entityIds = new LinkedList<String>();
      for (SamlExternalEntity entity : samlIdpConfig.getExternalSamlEntities())
      {
         entityIds.add(entity.getEntityId());
      }
      return entityIds;
   }

   public SamlIdpSession getSession()
   {
      return samlIdp.getSession();
   }
}