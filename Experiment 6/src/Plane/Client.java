package Plane;

import Plane.manufacturer.producers;
import Plane.products.plane;

public class Client {

    public static void main(String[] args) throws Exception {
        producers producers;
        plane plane;

        producers = (producers)XMLUtil.getBean("producer");
        plane = (plane)XMLUtil.getBean("plane");

        producers.setPlane(plane);
        producers.product();
    }

}
