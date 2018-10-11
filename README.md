## 实时获取当前Android应用的CPU和内存占用

### Usage
```java
// 100L为采样周期，单位ms  
Sampler.getInstance().init(getApplicationContext(), 100L);  
Sampler.getInstance().start();  
```
