# sy1_FileManager
一个简易的Java文件管理器，swing布局<br>
开发者请切换至update分支

# github地址
https://github.com/CerHT/sy1_FileManager.git
# 请同步该仓库后，顺便同步到GitHub上的update分支上

# 编码规范
添加新功能放在function包中<br>
方法名按照驼峰命名<br>
参考阿里Java开发手册<br>

#以下是git的配置文件 注意删除\<br>和\>>>
[core]<br>
>>>>repositoryformatversion = 0<br>
>>>>filemode = false<br>
>>>>bare = false<br>
>>>>logallrefupdates = true<br>
>>>>symlinks = false<br>
>>>>ignorecase = true<br>

[remote "origin"]<br>
>>>>url = https://github.com/CerHT/sy1_FileManager.git<br>
>>>>fetch = +refs/heads/*:refs/remotes/origin/*<br>

[branch "master"]<br>
>>>>remote = origin<br>
>>>>merge = refs/heads/master<br>

[remote "gitee"]<br>
>>>>url = https://gitee.com/chenhantao_cht/sy1_FileManager.git<br>
>>>>fetch = +refs/heads/*:refs/remotes/gitee/*<br>

[user]<br>
>>>>name = chenhantao<br>
>>>>email = hantaochen@alog.com<br>

[branch "update"]<br>
>>>>remote = origin<br>
>>>>merge = refs/heads/update<br>

[branch "gitee-master"]<br>
>>>>remote = gitee<br>
>>>>merge = refs/heads/master<br>

[branch "gitee-update"]<br>
>>>>remote = gitee<br>
>>>>merge = refs/heads/update <br>
