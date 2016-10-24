/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

package org.opensolaris.opengrok.analysis.puppet;

import java.util.HashSet;
import java.util.Set;

/**
  * Holds static hash set containing the Puppet keywords
  */
public class Consts{
    public static final Set<String> kwd = new HashSet<String>() ;
    static {
        kwd.add( "and" );
        kwd.add( "application" );
        kwd.add( "attr" );
        kwd.add( "case" );
        kwd.add( "class" );
        kwd.add( "consumes" );
        kwd.add( "default" );
        kwd.add( "define" );
        kwd.add( "else" );
        kwd.add( "elsif" );
        kwd.add( "environment" );
        kwd.add( "false" );
        kwd.add( "function" );
        kwd.add( "if" );
        kwd.add( "import" );
        kwd.add( "in" );
        kwd.add( "inherits" );
        kwd.add( "node" );
        kwd.add( "or" );
        kwd.add( "private" );
        kwd.add( "produces" );
        kwd.add( "true" );
        kwd.add( "type" );
        kwd.add( "undef" );
        kwd.add( "unless" );
    }
}
