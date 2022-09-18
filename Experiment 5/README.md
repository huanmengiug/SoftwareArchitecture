# take

## 实验5

### **（1）实现一个双向适配器实例，使得猫(Cat)可以学狗(Dog)叫，狗可以学猫抓老鼠。绘制相应类图并使用代码编程模拟**

#### answer

[![BidirectionalAdapter](https://s1.328888.xyz/2022/09/16/cYzgC.png)](https://imgloc.com/i/cYzgC)

### **（2）某OA系统需要提供一个加密模块，将用户机密信息（例如口令，邮箱等）加密之后存储在数据库中，系统已经定义好了数据库操作类。为了提高开发效率，现需要重用已有的加密算法，这些算法封装在一些由第三方提供的类中，有些甚至没有源代码。试使用适配器模式设计该加密模块，实现在不修改现有类的重用第三方加密方法，要求绘制相应的类图并使用编程语言编程模拟实现，需要提供对象适配器和类适配器两套实现方案。**

#### answer

+ **类适配器**

[![Class adapters](https://s1.328888.xyz/2022/09/16/cY7nd.png)](https://imgloc.com/i/cY7nd)

+ **对象适配器**

[![Object adapter](https://s1.328888.xyz/2022/09/16/cYS4U.png)](https://imgloc.com/i/cYS4U)

## 代码说明

### Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

### Folder Structure

The workspace contains two folders by default, where:

+ `src`: the folder to maintain sources
+ `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

### Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
