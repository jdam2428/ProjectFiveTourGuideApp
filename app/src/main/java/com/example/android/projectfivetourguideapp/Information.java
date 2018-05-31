package com.example.android.projectfivetourguideapp;

/**
 * {@link Information} represents a piece of information within a category.
 * It contains resource IDs for the piece of information and optional image file for that word.
 */
public class Information {

    /**
     * String resource ID for the information
     */
    private int mInformationId;

    /**
     * Image resource ID for the information
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this piece of information
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Information object.
     *
     * @param informationId is the string resource ID for the information in a Fragment
     */
    public Information(int informationId) {
        mInformationId = informationId;
    }

    /**
     * Create a new Word object.
     *
     * @param informationId   is the string resource ID for the information in a Fragment
     * @param imageResourceId is the drawable resource ID for the image associated with the info
     */
    public Information(int informationId, int imageResourceId) {
        mInformationId = informationId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default information.
     */
    public int getmInformationId() {
        return mInformationId;
    }

    /**
     * Return the image resource ID of the information.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this piece of information.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}