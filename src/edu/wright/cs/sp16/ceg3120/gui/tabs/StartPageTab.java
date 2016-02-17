/*
 * Copyright (C) 2016
 * 
 * 
 * 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package edu.wright.cs.sp16.ceg3120.gui.tabs;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A Start Page Tab that contains items such as:
 * - Recent Connections
 * - Tip of the Day
 * - etc.
 * 
 * @author codybutz, alyssa
 *
 */
public class StartPageTab extends JPanel {

	private static final long serialVersionUID = 8991726988535798603L;

	/**
	 * Initializes Start Page Tab, pulls recent connections, adds components to GUI.
	 * TODO: Pull recent connections, initialize components.
	 */
	public StartPageTab() {
		super();
		JLabel welcomeLabel = new JLabel("Welcome to Sequel Lizard, "
				+ "hope you enjoy the application. - Cody");
		add(welcomeLabel);
	}

}