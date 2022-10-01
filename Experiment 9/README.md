# take

## 实验9

### **（1）某软件公司要开发一个基于Windows平台的公告板系统。系统提供一个主菜单(Menu)，在主菜单中包含了一些菜单项( MenuItem)，可以通过Menu类的addMenuItem()方法增加菜单项。菜单项的主要方法是click()，每一个菜单项包含一个抽象命令类，具体命令类包括openCommand(打开命令)、createCommand(新建命令)、editCommand(编辑命令)等，命令类具有一个execute()方法，用于调用公告板系统界面类(BoardScreen)的open()、create()、edit()等方法。现使用命令模式设计该系统，使得MenuItem类与BoardScreen类的耦合度降低，绘制类图并编程实现.**

#### answer

![命令模式](https://s1.328888.xyz/2022/10/01/MQm6s.png)](<https://imgloc.com/i/MQm6s>)

### **（2）电视机遥控器是一个迭代器的现实应用，通过它可以实现对电视频道集合的遍历操作，电视机可以看成一个存储频道的聚合对象。试模拟电视机遥控器的实现，要求绘制相应的类图并编程模拟实现。**

#### answer

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
