package com.wzllr.mantle.engine;

public class Vector3f {

    private float x;
    private float y;
    private float z;

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float length() {
        return (float)Math.sqrt(x * x + y * y + z * z);
    }

    public float dot(Vector3f v) {
        return x * v.getX() + y * v.getY() + z * v.getZ();
    }

    // The cross product a × b is defined as a vector c that is
    // perpendicular to both a and b, with a direction given by
    // the right-hand rule and a magnitude equal to the area of
    // the parallelogram that the vectors span.
    public Vector3f crossProduct(Vector3f v) {
        float x_ = y * v.getZ() - z * v.getY();
        float y_ = z * v.getX() - x * v.getZ();
        float z_ = x * v.getY() - y * v.getX();

        return new Vector3f(x_, y_, z_);
    }

    public Vector3f normalize() {
        float length = length();

        x /= length;
        y /= length;
        z /= length;

        return this;
    }

    public Vector3f rotate(float angle) {
        return null;
    }

    public Vector3f add(Vector3f v) {
        return new Vector3f(x + v.getX(), y + v.getY(), z + v.getZ());
    }

    public Vector3f add(float f) {
        return new Vector3f(x + f, y + f, z + f);
    }

    public Vector3f sub(Vector3f v) {
        return new Vector3f(x - v.getX(), y - v.getY(), z - v.getZ());
    }

    public Vector3f sub(float f) {
        return new Vector3f(x - f, y - f, z - f);
    }

    public Vector3f mul(Vector3f v) {
        return new Vector3f(x * v.getX(), y * v.getY(), z * v.getZ());
    }

    public Vector3f mul(float f) {
        return new Vector3f(x * f, y * f, z * f);
    }

    public Vector3f div(Vector3f v) {
        return new Vector3f(x / v.getX(), y / v.getY(), z / v.getZ());
    }

    public Vector3f div(float f) {
        return new Vector3f(x / f, y / f, z / f);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
