/*
 * File: ShListindsActivity.java
 * 
 * Copyright (C) 2011 The Humanitarian FOSS Project (http://www.hfoss.org)
 * 
 * This file is part of POSIT, Portable Open Source Information Tool. 
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) as published 
 * by the Free Software Foundation; either version 3.0 of the License, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU LGPL along with this program; 
 * if not visit http://www.gnu.org/licenses/lgpl.html.
 * 
 */

package org.hfoss.posit.android.plugin.sh;

import org.hfoss.posit.android.api.activity.ListFindsActivity;

import android.os.Bundle;

/**
 * Displays a List of ShFinds in a contact list View. 
 *
 */
public class ShListFindsActivity extends ListFindsActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		finds = new ShListFindsFragment();
		super.onCreate(savedInstanceState);
	}
}
