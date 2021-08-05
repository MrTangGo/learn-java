# 泛型

## 问题的出现

在没有出现泛型之前，如果定义一个ArryList是这样定义的：
```java
ArrayList arrayList = new ArrayList();
arrayList.add("aaa");
arrayList.add("bbb");
arrayList.add("ccc");
```
因为ArrayList中的元素是后添加，不明白添加何元素的情况下，添加元素的类型统一按照Object类添加处理。

用迭代器来遍历这个ArryList的时候，用Object数据类型的变量来接收也是正常的。
```java
Iterator iterator = arrayList.iterator();
while (iterator.hasNext()){
    Object next = iterator.next();
    System.out.println(next);
}
```

但是会存在一个问题。如果对元素使用.length()方法的话，编译会不通过。这是因为Object类没有.length()这个方法。
可是传入的元素是字符串，如果是一定要用.length的方法，可以使用强制转化的方法把Object类转化为String类对象。

```java
String next = (String) iterator.next();
```
```java
Iterator iterator = arrayList.iterator();
while (iterator.hasNext()){
    String next = (String) iterator.next();
    System.out.println(next);
}
```

这样在使用.length()的方法就不会报错了。

但是这样做是不完美的。如果ArrayList里面添加的不仅仅只有String类型一种数据呢？如果是添加了一个Interager数据类型呢？
那还是会报错的。

```java
ArrayList arrayList = new ArrayList();
arrayList.add("aaa");
arrayList.add("bbb");
arrayList.add("ccc");
arrayList.add(123);

Iterator iterator = arrayList.iterator();
while (iterator.hasNext()){
    String next = (String) iterator.next();
    System.out.println(next);
}
```
```java
java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
```

ArrayList可以存放任意类型的数据。例子中ArryList添加了String类型，也添加了一个Integer类型。在使用强制转化的时候（认为next都是String类型的数据，都对他进行了强身转化）程序报错了(Integer类型的数据不能强制的转化为String类型的数据)。而且这样的报错在编译的过程中还发现不了。
在这个问题的背景下泛型应运而生。







## 泛型类

类定义的过程中，类名的后面是 `< 单个英文字母 >` ，表示这是一个泛型类。实列化泛型类的时候，必须要给这个泛型类确定具体的数据类型。
```java
public class 类名<E>(){...}
```


可以看看一下最常用到泛型的地方之一ArrayList的类源代码：

```java
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
    ...
    public E get(int index) {...}
    public E set(int index, E element) {...}
    private void add(E e, Object[] elementData, int s) {...}
}
```

类名ArrayList`<E>`，`<E>`表示接收的是泛型。

在get、set方法中，返回值也是`<E>`类型的数据。也就是说，在实例化类的时候，返回值`<E>`的类型就确认好了。


同时在编译的过程中，add方法的参数`<E>`表明了add方法接收的参数类型为`<E>`类型的数据。这样就可以在编译的过程中发现错误了。

可以尝试着自己写一个泛型类:
```java
public class Box<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setElement("aaa");
        System.out.println(stringBox.getElement());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElement(123);
        System.out.println(integerBox.getElement());
    }
}
```







## 泛型方法

