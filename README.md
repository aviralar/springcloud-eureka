# springcloud-eureka

1. web starter dependency needed for all the client application to be in running state
2. service location url should be given for eureka server also, otherwise client application will go for default url
3. Circuit breaker design pattern is implemented using nteflix-hystrix. Fallback methods are provided for api calls.
4. API Gateway / Proxy server is made by netflix-zuul. It is a common proxy which handles client requests and send it to eureka server which in turn sends the api to respective discovery client.
