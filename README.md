# apidocj4

APIDOC java implementation via ANTLR

apidoc原本是用nodejs开发的， Java项目想使用它作为在线接口文档的标准。

可以用antlr来解析APIDOC语法树。后续可以写入数据库，保存起来。并且Java网站可以在线浏览接口文档.


# Step

1. git clone https://github.com/flylib/apidoc4j.git
2. cd apidoc4j/apidoc4j-parser   
    open project 'apidoc4j-parser' with IDEA

3. Config ANTLR
Install ANTLR4 grammar plugin in IDEA. Then:

  Output directory where all output is generated: 
```
    D:\git\flylib\apidoc4j\apidoc4j-parser\src\main\java
```

  Package/namespace for the generated code:    
```
    io.github.flylib.apidoc4j.parser.antlr.api
```

# 运行

D:\git\flylib\apidoc4j\apidoc4j-parser\src\main\java\io\github\flylib\apidoc4j\parser\ApidocParserApp

右键运行，  
测试程序会解析以下路径里的包含apidoc注释的java代码

D:\git\flylib\apidoc4j\apidoc4j-parser\doc  拷贝到
-> E:/tmp/antlr/TestCode3.java

TestCode3.java代码
```java

/**
 * ssssssssaa我是 1 aaa
 * @api {GET} /sms/send Send message 发送短信 好的呀aaa bb
 * @apiName thisIsApiName
 * @apiParam {String} lastname    sssssssss姓氏
 * @apiParamExample {json} Request-Example:
 * mmmmm
 * @apiSuccess {String} firstname Firstname of the User1
 * @apiSuccess {String} firstname Firstname of the User2
 * @apiSuccess {String} firstname Firstname of the User3
 */
public static void main() {
		int i=11;
		System.out.println("XXX");
		i++;
		}


/**
 * ssssssssaa我是2
 * @api {GET} /sms/send Send message 发送短信2
 * @apiName thisIsApiName
 * @apiParam {String} lastname  姓氏2
 * @apiParamExample {json} Request-Example:2
 * mmmmm2
 * @apiSuccess {String} firstname Firstname of the User2
 * @apiSuccess {String} laststname LastName
 * @apiSuccess {String} middlerName MiddlerName2
 */
public static void method2() {
		int i=11;
		System.out.println("XXX");
		i++;
		}
```

ApidocParserApp
```java
package io.github.flylib.apidoc4j.parser;

import io.github.flylib.apidoc4j.parser.antlr.AntlrUtil;

public class ApidocParserApp {
    public static void main(String[] args) {
        String filePath = "E:/tmp/antlr/TestCode3.java";
        AntlrUtil.parse(filePath);
    }
}

```
<code></code> 可以改成自己的需要被提取apidoc的java代码的路径
