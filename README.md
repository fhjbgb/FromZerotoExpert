# FromZerotoExpert
FromZerotoExpert
第一天 2022.9.22 创建了项目，实现了第一个网页内容的显示（只显示了字符串，没做前端的设计与实现）。
  凭着之前打项目的经验大体想到了实现的方式，但在依赖注入的时候发现无法注入想要的依赖，于是便在pom文件中添加依赖，仍是不行，便与写出过成功的项目比较，发现是modelVersion版本不兼容dependency所致，修改后可以实现预期功能。
  第一次使用git,本来想在idea上直接上传代码到github上，发现不行，疑似连接有问题，便建立ssh使用ssh通信，还是不行,多方查找尝试，最后成功的方法是在控制台中clone项目到指定文件夹再由idea编写，再经控制台push,第一次push无法成功上传，查询后发现要先git commit -m "msg" 将内容写入暂存区再push,成功。
第二天 2022.9.23
   今天要加上cookie，我想设置一个键值对来记录用户在时间内登录了网页几次，第一次尝试：没有request.add使生成的cookie没有保存在浏览器中；第二次，可以保存session
   了但我只用了一个函数，每次重复进入网页会重新创建session使得无法记录登录次数。
