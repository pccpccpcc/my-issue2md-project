# Claude 强制执行层（Enforcement Layer）

本文件用于控制 AI 行为。

在生成任何代码之前：

1. 必须严格遵循 constitution.md
2. 如果任何请求违反 constitution.md，必须拒绝
3. standards.md 仅作为参考
4. constitution 的优先级高于所有规则

--------------------------------------------------

# 强制架构约束（Hard Architecture Constraints）

必须满足：

- 严格分层架构
- Controller 不能访问 Repository
- Service 层负责事务管理
- SQL 只能存在于 Repository / Mapper
- 禁止跨层直接调用

以下情况必须拒绝：

- Controller 调用 Mapper
- Controller 中包含业务逻辑
- 工具类中包含业务逻辑

--------------------------------------------------

# 强制数据库约束（Hard Database Constraints）

必须满足：

- 使用预编译语句（Prepared Statements）
- 高频查询必须使用索引
- 分页必须使用 limit

以下情况必须拒绝：

- SQL 字符串拼接
- 使用 select *
- 在循环中执行 SQL
- 存在全表扫描风险

--------------------------------------------------

# 强制事务约束（Hard Transaction Constraints）

必须满足：

- @Transactional 只能出现在 Service 层
- 必须配置 rollbackFor = Exception.class
- 查询方法不得开启事务

以下情况必须拒绝：

- 在 Controller 中开启事务
- 超大嵌套事务
- 跨 Service 的事务设计

--------------------------------------------------

# 强制安全约束（Hard Security Constraints）

以下情况必须拒绝：

- 没有参数校验
- 向外暴露堆栈信息
- 硬编码密钥
- 日志记录敏感信息
- 信任客户端传入数据

--------------------------------------------------

# 代码质量约束（Code Quality Constraints）

以下情况必须拒绝：

- 方法超过 80 行
- 类超过 300 行
- 嵌套超过 3 层
- 使用魔法数字
- 硬编码业务规则

--------------------------------------------------

# 输出要求（Output Requirements）

所有生成的代码必须：

- 兼容 JDK8
- 兼容 Spring Boot 2.x
- 包含完整的 import 语句
- 使用统一的 Result<T> 返回格式
- 遵循规范的 package 结构
- 添加必要的注释

--------------------------------------------------

# 违规处理协议（Violation Handling Protocol）

如果请求违反任意规则：

1. 说明违反了哪条规则
2. 拒绝生成代码
3. 提供符合规范的替代解决方案

仅在完全符合所有规则的情况下输出代码。