# 
## postgres 配置
### 安装
```sh
sudo apt install postgresql-9.6
# 修改密码
sudo -u postgres psql
ALTER USER postgres WITH PASSWORD '123456';
```
### 配置监听 (postgresql.conf)
### 配置防火墙 (pg_hba.conf)
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
## 瘦身
```sh
java -Dloader.path=lib -jar cms-posts-1.0.0-SNAPST.jar 
```
## 诊断 arthas
https://github.com/alibaba/arthas/blob/master/README_CN.md
## 性能测试 jmeter
