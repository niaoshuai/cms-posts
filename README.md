# 
## postgres 配置
### 配置监听
### 配置防火墙
### 创建数据库
```postgresql
create database posts encoding = 'UTF8';

create table posts (
  id varchar(32) primary key ,
  title varchar(200),
  gmt_create timestamp,
  gmt_modified timestamp
);
```