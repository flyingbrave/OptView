# OptView

性能优化：将反射创建view改变成用new方式创建
借助gradle插件将项目中xml文件遍历出来，通过注解APT处理器，完成将扫描的view用new方式替换反射，提高性能，
减少activity跳转启动时间。

该项目主要是结合Gradle练习APT处理器.增强自己对其掌握的熟练程度。
项目参考：
        
         https://github.com/hongyangAndroid/ViewOptDemo，

         https://github.com/sweetying520/AptDemo，
          
         https://github.com/sweetying520/GradleDemo

