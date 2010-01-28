package net.phys2d.client.raw.forcesource;

import net.phys2d.client.raw.Body;

/**
 * A source of force that can potentially be applied to every body every frame
 * 
 * @author kevin
 */
public interface ForceSource {
	/**
	 * Apply the force of this source to the given body
	 * 
	 * @param body The body to which the force should be applied
	 * @param dt The change in time since last update - in most cases constant
	 */
	public void apply(Body body, float dt);
}
