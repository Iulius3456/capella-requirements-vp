/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.vp.requirements.importer.transposer.bridge;

public class ImageImporter {
  private ImageImportStrategy imgImportStrategy;
  private String absPath;
  private String relPath;
  
  public ImageImportStrategy getImgImportStrategy() {
    return imgImportStrategy;
  }
  
  public void setImgImportStrategy(ImageImportStrategy imgImportStrategy) {
    this.imgImportStrategy = imgImportStrategy;
  }
  
  public String getAbsPath() {
    return absPath;
  }
  public void setAbsPath(String absPath) {
    this.absPath = absPath;
  }
  public String getRelPath() {
    return relPath;
  }
  public void setRelPath(String relPath) {
    this.relPath = relPath;
  }

}
