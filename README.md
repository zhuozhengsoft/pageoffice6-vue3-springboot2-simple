# pageoffice6-vue3-springboot2-simple

### 一、简介

​       pageoffice6-vue3-springboot2-simple项目演示了在前端Vue框架和后端Springboot框架的结合下如何使用PageOffice V6.0产品，此项目是一个最简单的demo项目。

### 二、项目环境要求

- 前端Vue项目（vue-front）:Node.js10及以上版本
- 后端Springboot项目（springboot-back）：Intelij IDEA,jdk1.8及以上版本

### 三、项目运行准备

   在当前服务器磁盘上新建一个pageoffice系统文件夹，例如：D:/pageoffice（此文件夹将用来存放PageOffice注册后生成的授权文件“license.lic”和pageoffice客户端程序“posetup_6.x.x.x_.exe），然后拷贝“集成文件”夹中的所有文件到当前pageoffice系统文件夹下。

### 四、项目运行步骤

解压当前项目压缩包。

- #### 后端Springboot项目（springboot-back）

1. 打开application.properties文件，将posyspath变量的值配置成您上一步新建的PageOffice系统文件夹  （例如：D:/pageoffice）。
2. 运行项目：点击运行按钮即可。

> 注意：如果后端Springboot项目的8081端口已经被占用，后端项目更换其他端口后，请记得将前端Vue项目samples6-vue-front/vue.config.js文件中proxy对象中的 target指向的地址改成更改后的后端项目的端口，并且将前端Vue项目的index.html中对pageoffice.js引用时的后端项目的端口也改成更改后的端口。

- #### 前端Vue项目（vue-front）

1. **npm install** ：安装依赖
2. **npm run dev** ：运行启动

### 五、PageOffice序列号

PageOfficeV6.0标准版试用序列号：A7VHK-HDTK-338U-NARCV

PageOfficeV6.0专业版试用序列号：6VD6L-3MJL-DASM-YD9B5

### 六、联系我们

​   卓正官网：[https://www.zhuozhengsoft.com](http://www.zhuozhengsoft.com)

​   联系电话：400-6600-770  

   QQ: 800038353