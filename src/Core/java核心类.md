### 字符串和编码

```
//在Java中，String是一个引用类型，它本身也是一个class。但是，Java编译器对String有特殊处理，即可以直接用"..."来表示一个字符串
String s1 = "hello";
//实际上字符串在String内部是通过一个char[]数组表示的，因此，按下面的写法也是可以的
String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});
```

* 字符串不可变

### StringBuilder
