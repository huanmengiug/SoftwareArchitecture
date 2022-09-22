package VisualComponent.Transparentd;

import VisualComponent.Transparentd.Component.Component;
import VisualComponent.Transparentd.Component.ConcreteComponent.Window;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.BlackBorderDecorator;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.ScrollBarDecorator;

public class Client {
    public  static void main(String args[]) throws Exception{
        Component component,componentSB,componentBB; 
        component = new Window(); 
        componentSB = new ScrollBarDecorator(component); 
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display(); 
    }
}
