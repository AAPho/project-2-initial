package com.csc205.project2;

public class Pyramid implements ThreeDimensionalShape{

    private double width;
    private double length;
    private double height;

    public Pyramid(){
        super();
        this.width = 0.0;
        this.length = 0.0;
        this.height = 0.0;
    }

    public Pyramid(double w, double l, double h){
        super();
        this.width = w;
        this.length = l;
        this.height = h;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth() {
        this.width = width;
    }

    public void setLength(){
        this.length = length;
    }

    public void setHeight(){
        this.height = height;
    }

    public double surfaceArea(){
        return length * width + length * Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2))
                + width * Math.sqrt(Math.pow(length/2, 2) + Math.pow(height, 2));
    }

    public double volume(){
        return (length * width * height)/3;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("width = ").append(width);
        sb.append(", length = ").append(length);
        sb.append(", height = ").append(height);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }

}
