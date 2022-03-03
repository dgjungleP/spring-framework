# Spring 代码阅读手记

## Bean 获取
1. 尝试从注册的单例表中查找  
2. 获取失败后，尝试从ParentBeanFactory获取bean的BeanDefinition，从其他的BeanFactory中去获取对象  
3. 如果再次失败，则从初始化容器的时候扫描到的BeanDefinition表中获取对应的BeanDefinition  
4. 组装依赖项  
5. 通过包装的形式创建出实例对象  
6. 为实例填充属性  
7. 执行实例化回调  
8. 执行后置通知    
9. 执行实例的初始化操作  
10. 执行后置通知  
11. 获得Bean

