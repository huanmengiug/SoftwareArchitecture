package VisualComponent.Transparentd.Decorator;

import VisualComponent.Transparentd.Component.Component;

public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();

    }

}
