# 简易报警系统

## 条件
```
* ABOVE 高于阈值时报警
* BELOW 低于阈值时报警
* EQUAL 等于阈值时报警
```

示例：
```
# 假设条件为小于5，输入以下信号
1, 2, 3, 4, 5, 6, 7

# 调用报警系统方法后得到如下结果，即所有小于5的信号均得到CRITICAL，大于等于5的信号得到OK
"CRITICAL", "CRITICAL", "CRITICAL", "CRITICAL", "OK", "OK", "OK"
```

## 目标
* 完成`simple.alert.AlertSystem`实现
* 在`simple.alert.AlertSystemTest`添加相关测试用例
* 代码整洁、易扩展
* 测试用例完整，覆盖以上各个条件的场景


思考：
信号需要考虑用个类，实现compareable接口
小于5定义成可配置的，比如放在配置文件里
条件也定义成可配置的
