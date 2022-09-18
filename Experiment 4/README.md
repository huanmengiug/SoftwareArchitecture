# take

## 实验3

### **（1）某系统为了改进数据库操作的性能，自定义数据库连接对象*Connection*和语句对象*Statement*，可针对不同类型的数据库提供不同的连接对象和语句对象，例如提供Oracle或MySQL专用连接类和语句类，而且用户可以通过配置文件等方式根据实际需要动态更换系统数据库。使用抽象工厂模式设计该系统。**

#### answer

[![Connection](https://s1.328888.xyz/2022/09/09/9KhCB.png)](https://imgloc.com/i/9KhCB)

### **（2）某软件公司开发人员要创建一个数据库连接池，将指定个数的（如两个或3个）数据库连接对象存储在连接池中，客户端代码可以从池中随机取一个连接对象来连接数据库。试通过对单例类进行改造，设计一个能够自行提供指定个数实例对象的数据库连接类**

#### answer

[![ConnectionPool](https://s1.328888.xyz/2022/09/09/9KBZP.png)](https://imgloc.com/i/9KBZP)

## 代码说明

### Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

### Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

### Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
