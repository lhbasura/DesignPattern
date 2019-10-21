# DesignPattern
## 设计模式的分类
　　1. 根据其目的（模式是用来做什么的）可分为创建型(Creational)，结构型(Structural)  和行为型(Behavioral)  三种：  
　　　　* 创建型模式主要用于创建对象。  
　　　　* 结构型模式主要用于处理类或对象的组合。  
　　　　* 行为型模式主要用于描述对类或对象怎样交互和怎样分配职责。  

　　2. 根据范围（模式主要是用于处理类之间关系还是处理对象之间的关系）可分为类模式和对象模式两种：  
　　　　* 类模式处理类和子类之间的关系，这些关系通过继承建立，在编译时刻就被确定下来，是属于静态的。  
　　　　* 对象模式处理对象间的关系，这些关系在运行时刻变化，更具动态性。  
#### 创建型模式
　　1.抽象工厂模式(Abstract Factory) √  
　　2.建造者模式(Builder)      
　　3.工厂方法模式(Factory Method) √   
　　4.原型模式(Prototype)    
　　5.单例模式(Singleton) √   
#### 结构型模式
　　1.适配器模式(Adapter)    
　　2.桥接模式(Bridge)    
　　3.组合模式(Composite)    
　　4.装饰模式(Decorator)    
　　5.外观模式(Facade)  
　　6.享元模式(Flyweight)  
　　7.代理模式(Proxy)  
#### 行为型模式
　　1.职责链模式(Chain of Responsibility)  
　　2.命令模式(Command)  
　　3.解释器模式(Interpreter)  
　　4.迭代器模式(Iterator)  
　　5.中介者模式(Mediator)  
　　6.备忘录模式(Memento)  
　　7.观察者模式(Observer)  
　　8.状态模式(State)  
　　9.策略模式(Strategy)√    
　　10.模板方法模式(Template Method)  
　　11.访问者模式(Visitor)  
 
>目录结构：
```
.
├── README.md
├── directoryList.md
├── gen_directory.sh
├── pom.xml
└── src
    ├── AbstractFactory
    ├── Decoration
    ├── DynamicProxy
    ├── FactoryMethod
    ├── CglibProxy 
    ├── Main.java
    ├── Observer
    ├── Singleton
    └── StaticProxy

 ``` 
