/*******************************************************************************
 * Copyright (c) 2016, 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.vp.requirements.semantic.browser.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.vp.requirements.Requirements.AttributeDefinition;

/**
 * @author Joao Barata
 */
public class AttributeDefinitionDataTypeQuery extends AbstractViewpointQuery {

  /**
   * @param object: The model element for which the semantic browser extension is generated
   * @return List of object to display in the parent category
   */
  public List<Object> computeQuery(Object object) {
    List<Object> result = new ArrayList<Object>();
    AttributeDefinition definition = (AttributeDefinition) object;

    EObject type = definition.getDefinitionType();
    if (type != null)
      result.add(type);

    return result;
  }
}
