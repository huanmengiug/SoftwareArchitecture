package VisualComponent.Transparentd.Decorator.ConcreteDecorator;

import VisualComponent.Transparentd.Component.Component;
import VisualComponent.Transparentd.Decorator.ComponentDecorator;

public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.print("增加滚动条的");
    }

}
