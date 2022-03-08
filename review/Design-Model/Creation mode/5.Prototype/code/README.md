# 原型模式

原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节。即用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象。

将原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建。即用基类Object的clone()方法或序列化。