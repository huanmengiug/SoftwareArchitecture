package VisualComponent.Transparentd;

import VisualComponent.Transparentd.Component.Component;
import VisualComponent.Transparentd.Component.ConcreteComponent.TextBox;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.BlackBorderDecorator;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.ScrollBarDecorator;

public class Client {
    public static void main(String args[]) throws Exception {
        Component component, componentSB, componentBB;// 全部使用抽象构件
        component = new TextBox();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
