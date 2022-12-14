# 软件架构设计与开发

## 设计模式

软件模式是将模式的一般概念应用于软件开发领域，即软件开发的 总体指导思路或参照样板。软件模式并非仅限于设计模式，还包括 架构模式、分析模式和过程模式等，实际上，在软件生存期的每一 个阶段都存在着一些被认同的模式。
软件架构设计就是从宏观上说明一套软件系统的组成与特性。

## UML类图和时序图

![UML示例](https://design-patterns.readthedocs.io/zh_CN/latest/_images/uml_class_struct.jpg)

+ 车的类图结构为**abstract**，表示车是一个抽象类；
+ 它有两个继承类：小汽车和自行车；它们之间的关系为实现关系，使用带空心箭头的虚线表示；
+ 小汽车为与SUV之间也是继承关系，它们之间的关系为泛化关系，使用带空心箭头的实线表示；
+ 小汽车与发动机之间是组合关系，使用带实心箭头的实线表示；
+ 学生与班级之间是聚合关系，使用带空心箭头的实线表示；
+ 学生与身份证之间为关联关系，使用一根实线表示；
+ 学生上学需要用到自行车，与自行车是一种依赖关系，使用带箭头的虚线表示；

### [时序图](https://blog.51cto.com/smartlife/284874)

为了展示对象之间的交互细节，后续对设计模式解析的章节，都会用到时序图；

时序图（Sequence Diagram）是显示对象之间交互的图，这些对象是按时间顺序排列的。时序图中显示的是参与交互的对象及其对象之间消息交互的顺序。

时序图包括的建模元素主要有：*对象（Actor）、生命线（Lifeline）、控制焦点（Focus of control）、消息（Message）*等等。
