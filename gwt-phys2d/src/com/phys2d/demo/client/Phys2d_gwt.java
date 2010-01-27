package com.phys2d.demo.client;

import gwt.g2d.client.graphics.Surface;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Phys2d_gwt implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		Surface surface = new Surface(600,600);
		RootPanel.get().add(surface);
		
		GwtDemo1 demo = new GwtDemo1(surface);
		demo.start();
	}
}
