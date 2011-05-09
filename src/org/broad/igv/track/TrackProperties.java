/*
 * Copyright (c) 2007-2011 by The Broad Institute, Inc. and the Massachusetts Institute of
 * Technology.  All Rights Reserved.
 *
 * This software is licensed under the terms of the GNU Lesser General Public License (LGPL),
 * Version 2.1 which is available at http://www.opensource.org/licenses/lgpl-2.1.php.
 *
 * THE SOFTWARE IS PROVIDED "AS IS." THE BROAD AND MIT MAKE NO REPRESENTATIONS OR
 * WARRANTES OF ANY KIND CONCERNING THE SOFTWARE, EXPRESS OR IMPLIED, INCLUDING,
 * WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER
 * OR NOT DISCOVERABLE.  IN NO EVENT SHALL THE BROAD OR MIT, OR THEIR RESPECTIVE
 * TRUSTEES, DIRECTORS, OFFICERS, EMPLOYEES, AND AFFILIATES BE LIABLE FOR ANY DAMAGES
 * OF ANY KIND, INCLUDING, WITHOUT LIMITATION, INCIDENTAL OR CONSEQUENTIAL DAMAGES,
 * ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER
 * THE BROAD OR MIT SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT
 * SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
 */


package org.broad.igv.track;

//~--- JDK imports ------------------------------------------------------------

import java.awt.*;


/**
 * This class is based on the UCSC track configuration parameters
 *
 * @author jrobinso
 */
public class TrackProperties {

    public enum BaseCoord {
        ZERO, ONE, UNSPECIFIED
    }

    /**
     * Base coordinate system,  either 0 or 1
     */
    private BaseCoord baseCoord = BaseCoord.UNSPECIFIED;

    /**
     * The track name.  Will be displayed to the left of the track.
     */
    private String name;

    /**
     * The track description.  The description, when supplied, will appear in popup text
     * when hovering over the track.  May optionally be displayed centered over the track
     * on certain chart types (currently scatter plot and barchart).
     */
    private String description;

    /**
     * A url to an web page associated with this track.  This is currently not used.
     */
    private String url;

    /**
     * The track height in pixels
     */
    private int height;

    private int minHeight;

    /**
     * The default color for the track.  This can be overridden by individual feature lines in
     * certain formats, notably BED.
     */
    private Color color;

    /**
     * An alternate color. The use of this color depends on the particular graph type (renderer)
     * being displayed.  See documentation for specific renderes for details.
     */
    private Color altColor;

    private Color midColor;

    private String genome;

    private int offset;

    private boolean autoScaleFlag = false;

    private float minValue = Float.NaN;

    private float maxValue = Float.NaN;

    private float midValue = Float.NaN;

    private float neutralFromValue = Float.NaN;

    private float neutralToValue = Float.NaN;

    private boolean drawYLine = true;

    private Class rendererClass;

    private WindowFunction windowingFunction;

    private int smoothingWindow;

    private boolean itemRGB = true;

    private boolean useScore = false;

    private int featureVisibilityWindow = -1;

    private boolean logScale;

    private float yLine;

    public TrackProperties() {

    }
 
    public boolean isLogScale() {
        return logScale;
    }

    public void setLogScale(boolean logScale) {
        this.logScale = logScale;
    }

    public int getFeatureVisibilityWindow() {
        return featureVisibilityWindow;
    }

    public void setFeatureVisibilityWindow(int featureVisibilityWindow) {
        this.featureVisibilityWindow = featureVisibilityWindow;
    }

    public boolean isUseScore() {
        return useScore;
    }

    public void setUseScore(boolean useScore) {
        this.useScore = useScore;
    }

    public boolean isItemRGB() {
        return itemRGB;
    }

    public void setItemRGB(boolean itemRGB) {
        this.itemRGB = itemRGB;
    }

    /**
     * Method description
     *
     * @return
     */
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }


    public Color getAltColor() {
        return altColor;
    }


    public void setAltColor(Color altColor) {
        this.altColor = altColor;
    }


    public boolean isAutoScale() {
        return autoScaleFlag || Float.isNaN(minValue) || Float.isNaN(maxValue);
    }


    public String getGenome() {
        return genome;
    }


    public void setGenome(String genome) {
        this.genome = genome;
    }


    public float getMinValue() {
        return minValue;
    }


    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }


    public float getMaxValue() {
        return maxValue;
    }


    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }


    public WindowFunction getWindowingFunction() {
        return windowingFunction;
    }


    public void setWindowingFunction(WindowFunction windowingFunction) {
        this.windowingFunction = windowingFunction;
    }


    public int getSmoothingWindow() {
        return smoothingWindow;
    }


    public void setSmoothingWindow(int smoothingWindow) {
        this.smoothingWindow = smoothingWindow;
    }


    public Class getRendererClass() {
        return rendererClass;
    }

    public void setRendererClass(Class rendererClass) {
        this.rendererClass = rendererClass;
    }

    public void setAutoScale(

            boolean autoScale) {
        this.autoScaleFlag = autoScale;
    }

    public float getMidValue() {
        return midValue;
    }

    public void setMidValue(float midValue) {
        this.midValue = midValue;
    }

    public Color getMidColor() {
        return midColor;
    }

    public void setMidColor(Color midColor) {
        this.midColor = midColor;
    }

    public boolean isDrawYLine() {
        return drawYLine;
    }

    public void setDrawYLine(boolean drawYLine) {
        this.drawYLine = drawYLine;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public BaseCoord getBaseCoord() {
        return baseCoord;
    }

    public void setBaseCoord(BaseCoord baseCoord) {
        this.baseCoord = baseCoord;
    }

    public float getNeutralFromValue() {
        return neutralFromValue;
    }

    public void setNeutralFromValue(float neutralFromValue) {
        this.neutralFromValue = neutralFromValue;
    }

    public float getNeutralToValue() {
        return neutralToValue;
    }

    public void setNeutralToValue(float neutralToValue) {
        this.neutralToValue = neutralToValue;
    }

    public float getyLine() {
        return yLine;
    }

    public void setyLine(float yLine) {
        this.yLine = yLine;
    }




}
