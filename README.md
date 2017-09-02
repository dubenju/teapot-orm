# teapot-orm
对象关系映射的Java简单实现。
快速开发。
代码简洁优雅。

## 2017/08/13 发布0.0.1版。

#### 数据库操作
1. 单表的CRUD处理
2. 基于连接的CRUD事务处理

#### 代码自动生成
3. 从数据库中直接生成JavaBean代码及其测试代码
4. 从XML定义文件直接生成JavaBean代码及其测试代码

## 2017/09/02 发布0.0.2版。

### 功能

■One2One OK
One2Many ★
Many2One = One2Many
Many2Many = List<List>
Wrapper

■UModel.keyMatch OK
■UModel.keyBreak OK
■UModel.keyBreakMany OK

#### 数据库操作
■ResultSet=>Model 变换时编辑处理 OK
■Model =>PreparedStatement 变换时编辑处理OK

■SELECT FOR UPDATE OK

#### 代码自动生成
■ant gen OK
■自动生成时输出文件夹的自动做成。OK
■velocity-2.0 OK
-----
velocity-1.7.jar => velocity-engine-core-2.0.jar velocity-engine-scripting-2.0.jar
commons-lang-2.6.jar => commons-lang3-3.6.jar
 => slf4j-api-1.7.25.jar slf4j-simple-1.7.25.jar

$velocityCount => $foreach.count or $foreach.index + 1
1.7的时候的改动，但还支持，2.0的时候完全不支持了。
-----
■向生成的JavaBean追加equal和compareTo方法。
■从数据库信息生成XML定义文件
【代码简洁】IKeyValue的方法名改为get/set
【代码简洁】使用链式方法

## 0.0.3版将包括一下功能：
④DDL?
