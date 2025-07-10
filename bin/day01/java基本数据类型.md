#### java基本数据类型

| 数据类型 | 默认值   | 大小   |
| -------- | -------- | ------ |
| boolean  | false    | 不确定 |
| char     | '\u0000' | 2字节  |
| byte     | 0        | 1字节  |
| short    | 0        | 2字节  |
| int      | 0        | 4字节  |
| long     | 0L       | 8字节  |
| float    | 0.0f     | 4字节  |
| double   | 0.0      | 8字节  |

基本数据类型

```java
//布尔型
boolean flag = false;
boolean flag = true;

//byte （范围-128到127）
byte b;
b = 10;
byte c = -100;

//short 
short s; // 声明一个 short 类型变量
s = 1000; // 将值 1000 赋给变量 s
short t = -2000; // 声明并初始化一个 short 类型变量 t，赋值为 -2000

//int
int i; // 声明一个 int 类型变量
i = 1000000; // 将值 1000000 赋给变量 i
int j = -2000000; // 声明并初始化一个 int 类型变量 j，赋值为 -2000000

//long
long l; // 声明一个 long 类型变量
l = 100000000000L; // 将值 100000000000L 赋给变量 l（注意要加上 L 后缀）
long m = -20000000000L; // 声明并初始化一个 long 类型变量 m，赋值为 -20000000000L

//float 
float f; // 声明一个 float 类型变量
f = 3.14159f; // 将值 3.14159f 赋给变量 f（注意要加上 f 后缀）
float g = -2.71828f; // 声明并初始化一个 float 类型变量 g，赋值为 -2.71828f

//double
double myDouble = 3.141592653589793;

//char  char 用于表示 Unicode 字符，占 16 位（2 字节）的存储空间，取值范围为 0 到 65,535。
char letterA = 'A'; // 用英文的单引号包裹住。

```

#### 强制类型转换

```java
//int->char
int value = 65;
char a = (char) value;
```
