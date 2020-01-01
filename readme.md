使用Apache CXF发布和调用WebService

1.设置URL:http://localhost:9999/userService

2.设置请求模式：Post

3.设置Header：添加 Content-Type ，值为 text/xml;charset=utf-8

4.设置Body：勾选raw

5.输入Body内容：
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
	<soap:Body>
		<ns2:sayHello xmlns:ns2="http://service.aaa.com/">
			<arg0>aaa</arg0>
		</ns2:sayHello>
	</soap:Body>
</soap:Envelope>
```

6.响应时的Body结构
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <ns2:sayHelloResponse xmlns:ns2="http://service.aaa.com/">
            <return>Hello,aaa</return>
        </ns2:sayHelloResponse>
    </soap:Body>
</soap:Envelope>
```