# Development & Technical Standards

--------------------------------------------------

# 一、包结构

com.pcc
 ├── controller
 ├── service
 ├── service.impl
 ├── repository
 ├── entity
 ├── dto
 ├── vo
 ├── config
 ├── util
 └── exception

--------------------------------------------------

# 二、命名规范

类名：大驼峰  
方法名：小驼峰  

布尔字段必须：

- isXxx
- hasXxx
- enableXxx

禁止拼音命名。

--------------------------------------------------

# 三、数据库规范

表名：小写 + 下划线  

主键：

id bigint primary key auto_increment

必须字段：

create_time datetime not null
update_time datetime not null

--------------------------------------------------

# 四、API规范

统一返回格式：

{
  "code": 0,
  "message": "success",
  "data": {}
}

--------------------------------------------------

# 五、日志规范

- 使用 SLF4J
- 禁止 System.out.println
- 生产环境禁止 debug
- 禁止打印敏感信息

--------------------------------------------------

# 六、Git提交规范

feat: 新功能
fix: 修复
refactor: 重构
docs: 文档
test: 测试

--------------------------------------------------

# 七、测试规范

- Service 层必须可单测
- 覆盖率 >= 60%
- 禁止连接真实数据库