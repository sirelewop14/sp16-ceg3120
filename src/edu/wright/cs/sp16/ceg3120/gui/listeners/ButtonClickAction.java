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

package edu.wright.cs.sp16.ceg3120.gui.listeners;

import edu.wright.cs.sp16.ceg3120.gui.MainTabPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class to handle button click events.
 * 
 * @author Alex
 */
public class ButtonClickAction implements ActionListener {
	private MainTabPane parentPane;

	/**
	 * Initial constructor to bring in parent pane instance.
	 * 
	 * @author Alex
	 * 
	 */
	public ButtonClickAction(MainTabPane pane) {
		parentPane = pane;
	}

	// action event for clicking on a url.
	@Override
	public void actionPerformed(ActionEvent evt) {
		MainTabPane mainPane = parentPane;

		if (!mainPane.checkLearnDiscoverStatus()) {
			mainPane.addLearnAndDiscoverTab();
		}
	}

}