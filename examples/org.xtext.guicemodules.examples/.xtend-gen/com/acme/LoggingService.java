/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.acme;

import com.acme.impl.SystemOutLoggingService;
import com.google.inject.ImplementedBy;

@ImplementedBy(SystemOutLoggingService.class)
@SuppressWarnings("all")
public interface LoggingService {
  public abstract void logMessage(final String msg);
}
