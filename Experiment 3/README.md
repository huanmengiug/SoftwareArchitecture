# take

## 实验3

### **（1）某系统运行日志记录器(Logger)可以通过多种途径保存系统的运行日志 例如通过文件记录或数据库记录，用户可以通过修改配置文件灵活地更 换日志记录方式。在设计各类日志记录器时，开发人员发现需要对日志 记录器进行一些初始化工作，初始化参数的设置过程较为复杂，而且某 些参数的设置有严格的先后次序，否则可能会发生记录失败。 为了更好地封装记录器的初始化过程并保证多种记录器切换的灵活性 现使用工厂方法模式设计该系统。**

#### answer

[![Logger](https://s1.328888.xyz/2022/09/06/5GSSo.png)](https://imgloc.com/i/5GSSo)

### **（1）要求用工厂方法模式编程解决如下两题（绘制相应的类图并模拟实现)**

+ a. 海尔（Haier）工厂专门负责生产海尔电视机，TCL工厂专门负责生产TCL电视机。使用工厂方法模式模拟该场景

+ b. 新增海信（Hisense）工厂生产海信电视机。

#### answer

+ a.[![TVFactory-1](https://s1.328888.xyz/2022/09/06/5GHaS.png)](https://imgloc.com/i/5GHaS)

+ b. [![TVFactory-2](https://s1.328888.xyz/2022/09/06/5GqWN.png)](https://imgloc.com/i/5GqWN)

## 代码说明

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

+ `src`: the folder to maintain sources
+ `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
