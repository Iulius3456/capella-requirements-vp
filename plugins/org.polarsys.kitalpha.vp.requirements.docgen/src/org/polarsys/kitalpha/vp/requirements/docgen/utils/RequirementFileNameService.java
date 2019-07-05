/**
 *  Copyright (c) 2019 THALES GLOBAL SERVICES.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     Thales - initial API and implementation
 */

package org.polarsys.kitalpha.vp.requirements.docgen.utils;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;
import org.polarsys.kitalpha.vp.requirements.Requirements.IdentifiableElement;

public class RequirementFileNameService implements IFileNameService {

  public static final RequirementFileNameService SERVICE = new RequirementFileNameService();

  @Override
  public String getFileName(EObject element) {
	String fileName = "";
	if (element instanceof NamedElement) {
		fileName = ((NamedElement) element).getId();
	} else if (element instanceof CapellaElement) {
		fileName = ((CapellaElement) element).getId();
	} else if (element instanceof IdentifiableElement) {
		fileName = ((IdentifiableElement) element).getId();
	}
    return DocGenHtmlUtil.getValidFileName(fileName);
  }
}
