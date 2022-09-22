package VisualComponent.SemiTransparentd;

import VisualComponent.Transparentd.Component.Component;
import VisualComponent.Transparentd.Component.ConcreteComponent.ListBox;
import VisualComponent.Transparentd.Component.ConcreteComponent.Window;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.BlackBorderDecorator;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.ScrollBarDecorator;

public class Client {
    public static void main(String args[]) throws Exception {
        Component component1,component2;// 使用抽象构件类型定义
        component1 = new ListBox();
        component2 = new Window();

        BlackBorderDecorator component_b;// 使用具体装饰类型定义
        component_b = new BlackBorderDecorator(component1);
        component_b.setBlackBorder();// 单独调用新增业务方法
        component1.display();

        ScrollBarDecorator component_s;
        component_s = new ScrollBarDecorator(component2);
        component_s.setScrollBar();
        
        component2.display();
    }
}
