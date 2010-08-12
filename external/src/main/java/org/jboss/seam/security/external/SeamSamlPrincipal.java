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
package org.jboss.seam.security.external;

import java.security.Principal;
import java.util.LinkedList;
import java.util.List;

import org.jboss.seam.security.external.configuration.SamlIdentityProvider;
import org.jboss.seam.security.external.jaxb.samlv2.assertion.AssertionType;
import org.jboss.seam.security.external.jaxb.samlv2.assertion.AttributeType;
import org.jboss.seam.security.external.jaxb.samlv2.assertion.NameIDType;

public class SeamSamlPrincipal implements Principal
{
   private NameIDType nameId;

   private SamlIdentityProvider identityProvider;

   private List<AttributeType> attributes = new LinkedList<AttributeType>();

   private String sessionIndex;

   private AssertionType assertion;

   public NameIDType getNameId()
   {
      return nameId;
   }

   public void setNameId(NameIDType nameId)
   {
      this.nameId = nameId;
   }

   public SamlIdentityProvider getIdentityProvider()
   {
      return identityProvider;
   }

   public void setIdentityProvider(SamlIdentityProvider identityProvider)
   {
      this.identityProvider = identityProvider;
   }

   public List<AttributeType> getAttributes()
   {
      return attributes;
   }

   public void setAttributes(List<AttributeType> attributes)
   {
      this.attributes = attributes;
   }

   public String getSessionIndex()
   {
      return sessionIndex;
   }

   public void setSessionIndex(String sessionIndex)
   {
      this.sessionIndex = sessionIndex;
   }

   public AssertionType getAssertion()
   {
      return assertion;
   }

   public void setAssertion(AssertionType assertion)
   {
      this.assertion = assertion;
   }

   public String getName()
   {
      return nameId.getValue();
   }
}