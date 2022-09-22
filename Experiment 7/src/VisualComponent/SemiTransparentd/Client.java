package VisualComponent.SemiTransparentd;

import VisualComponent.Transparentd.Component.Component;
import VisualComponent.Transparentd.Component.ConcreteComponent.ListBox;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.BlackBorderDecorator;
import VisualComponent.Transparentd.Decorator.ConcreteDecorator.ScrollBarDecorator;

public class Client {
    public  static void main(String args[]) throws Exception{
        Component component_o;//使用抽象构件类型定义
        component_o = new ListBox();


        BlackBorderDecorator component_b;//使用具体装饰类型定义 
        component_b = new BlackBorderDecorator(component_o);
        component_b.setBlackBorder();//单独调用新增业务方法
        ScrollBarDecorator component_s;//使用具体装饰类型定义 
        component_s = new ScrollBarDecorator(component_o);
        component_s.setScrollBar();

        component_o.display();



    }
}