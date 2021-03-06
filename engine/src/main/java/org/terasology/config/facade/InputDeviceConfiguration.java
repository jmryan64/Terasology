
package org.terasology.config.facade;

import org.terasology.config.Config;
import org.terasology.config.ControllerConfig.ControllerInfo;

/**
 * Facade for {@link Config#getInput()}
 */
public interface InputDeviceConfiguration {
    /**
     * Returns the mouse sensitivity in the range of [0,1]
     */
    float getMouseSensitivity();

    /**
     * Sets the mouse sensitivity, the value should be in [0,1].
     */
    void setMouseSensitivity(float mouseSensitivity);

    /**
    * Resets the the mouse sensitivity and axis settings back to the default values.
     */
    void reset();

    /**
     * Returns true if the y axis is inverted.
     */
    boolean isMouseYAxisInverted();

    /**
     * Sets the y-axis as inverted (true) or resets it back to normal (false).
     */
    void setMouseYAxisInverted(boolean mouseYAxisInverted);

    /**
     * Returns the controller info for the controller with the given name.
     */
    ControllerInfo getController(String name);
}
