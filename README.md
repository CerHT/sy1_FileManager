# sy1_FileManager
一个简易的Java文件管理器，swing布局  
开发者请切换至update分支

#项目结构
由于是早期项目练手，故部分代码风格及格式较乱，正在逐渐填坑  
swing布局有很多东西并不常用，布局风格才是借用可视化工具拖动生产的，  
因此可读性略差，暂时小修小补，倘若有时间，会使用idea的GUI工具重新生成一遍，  
以便有配置文件可以保证打开

# github地址
https://github.com/CerHT/sy1_FileManager.git  
请同步该仓库后，顺便同步到GitHub上的update分支上

# 编码规范
添加新功能放在function包中  
方法名按照驼峰命名  
可以参考阿里Java开发手册  

#以下是git的配置文件
```
[core]
    repositoryformatversion = 0
    filemode = false
    bare = false
    logallrefupdates = true
    symlinks = false
    ignorecase = true

[remote "origin"]
    url = https://github.com/CerHT/sy1_FileManager.git
    fetch = +refs/heads/*:refs/remotes/origin/*

[branch "master"]
    remote = origin
    merge = refs/heads/master

[remote "gitee"]
    url = https://gitee.com/chenhantao_cht/sy1_FileManager.git
    fetch = +refs/heads/*:refs/remotes/gitee/*

[branch "update"]
    remote = origin
    merge = refs/heads/update

[branch "gitee-master"]
    remote = gitee
    merge = refs/heads/master

[branch "gitee-update"]
remote = gitee
merge = refs/heads/update 

```