package com.gowtham.library.utils;

public class CompressOption {

    private int frameRate=30;

    private String bitRate="0k";

    private double width=0;

    private double height=0;

    private String encodeType = "pad";

    public CompressOption() {
    }

    public CompressOption(int frameRate, String bitRate, double width, double height) {
        this.frameRate = frameRate;
        this.bitRate = bitRate;
        this.width = width;
        this.height = height;
    }

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }

    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getFrameRate() {
        return frameRate;
    }

    public String getBitRate() {
        return bitRate;
    }

    public String getEncodeType() {
        return encodeType;
    }

    public void setEncodeType(String encodeType) {
        this.encodeType = encodeType;
    }
}
