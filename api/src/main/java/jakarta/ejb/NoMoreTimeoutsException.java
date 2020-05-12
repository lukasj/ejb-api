/*
 * Copyright (c) 2006, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.ejb;

/**
 * This exception indicates that a calendar-based timer will not result in any more timeouts.
 *
 * @since EJB 3.1
 */
public class NoMoreTimeoutsException extends EJBException {

    private static final long serialVersionUID = 1373788283844991998L;

    /**
     * <p>Constructor for NoMoreTimeoutsException.</p>
     */
    public NoMoreTimeoutsException() {
    }

    /**
     * <p>Constructor for NoMoreTimeoutsException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public NoMoreTimeoutsException(String message) {
        super(message);
    }

}
