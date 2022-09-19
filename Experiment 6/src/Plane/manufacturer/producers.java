package Plane.manufacturer;

import Plane.products.plane;

public abstract class producers {

    protected plane plane;

    public void setPlane(plane plane) {
        this.plane = plane;
    }

    public abstract void product();
}
