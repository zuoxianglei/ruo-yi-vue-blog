<p align="center">
	<img alt="logo" src="public/favicon.ico">
</p>
<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">Blog</h1>
<h4 align="center">基于RuoYi-Vue  v3.8.0平台开发的博客网站</h4>

## 介绍

基于**RuoYi-Vue**前后端分离基础平台开发的**博客网站**。

👍👍 感谢若依提供如此优秀的框架❤️❤️ 

**RuoYi-Vue** 是一个 Java EE 企业级快速开发平台，基于经典技术组合（Spring Boot、Spring Security、MyBatis、Jwt、Vue），内置模块如：部门管理、角色用户、菜单及按钮授权、数据权限、系统参数、日志管理、代码生成等。在线定时任务配置；支持集群，支持多数据源，支持分布式事务。

## 开发

```bash
# 克隆项目
git https://gitee.com/Ning310975876/ruo-yi-vue-blog.git

# 进入项目目录
cd ruoyi-ui

# 安装依赖
npm install

# 建议不要直接使用 cnpm 安装依赖，会有各种诡异的 bug。可以通过如下操作解决 npm 下载速度慢的问题
npm install --registry=https://registry.npm.taobao.org

# 启动服务
npm run dev
```

浏览器访问 http://localhost:80

## 发布

```bash
# 构建测试环境
npm run build:stage

# 构建生产环境
npm run build:prod
```

