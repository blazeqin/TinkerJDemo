# TinkerJDemo
tinker热更新demo

参照官方文档集成就可以了
http://www.tinkerpatch.com/Docs/SDK

如果不明白，就参考别人的写法
https://www.cnblogs.com/huangjialin/p/7693816.html

最后说几个坑：
这个东西成功率确实不高，不知道是不是自己的打开方式不对。
# 1.每次打补丁包都要修改的地方
//基包文件夹名（打补丁包的时候，需要修改，对照bakpath目录修改）
def baseInfo = "app-1.0-0802-11-07-35"
# 2.基准包
选定一个就行
# 3.appVersion
appVersion就是app.gradle里的versionName
# 4.最好是在APP启动等一些关键路径，使用fetchPatchUpdate(true)强制检查更新
 TinkerPatch.with().fetchPatchUpdate(true);
# 5.同一版本，多次发布补丁
不需要修改baseinfo。除非发布新的版本包。
# 6.成功问题
感觉成功率就是不行，如果还是没能成功，参考官方demo，查看日志解决

https://github.com/TinkerPatch/tinkerpatch-easy-sample
# 7.影响极光推送获取注册id
获取id有两种方式，采用监听广播的形式就会好一点，但是还是会有问题。
只能采取一些小措施了，TinkerPatch.with().fetchPatchUpdate(true);这一句延迟执行。

https://community.jiguang.cn/t/registrationid/15658/2
