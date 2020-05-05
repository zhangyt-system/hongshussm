
# 仿小红书官网项目的后端代码
使用ssm框架 MySQL数据库 项目是练习了ssm框架的整合，联表查询，大家可以随意拷贝，下载，学习哦，如果对你有用，请给个star，

## 使用方法
1. 配置电脑的环境 我使用的环境jdk1.8.0_102+ apache-tomcat-7.0.70+eclipse-jee-mars-x_64+mysql-5.5.27
2. 下载jdk、eclipse、tomcat、mysql
3. 在环境变量中配置Java环境（某度即可）
4. eclipse中配置tomcat，配置jdk
5. tomcat中端口号和前端vue的端口号冲突了，所以修改tomcat端口号为8000
6. MySQL的用户名和密码为root，root
7. 把下载的代码导入到eclipse中，run即可
8. 在项目中使用了jar包，所以没有下载maven，如果有需要的，更换一下即可
9. 在数据库中创建create database hongshu; 有两张表 user和article表，一对多的关系，把数据库.txt内容拷贝
数据库中
