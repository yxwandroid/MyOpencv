# MyOpencv
# 高斯模糊
     Imgproc.GaussianBlur(src, src, new Size(3, 3), 0);
     ``
# 2均值模糊

[参考](http://blog.csdn.net/jia20003/article/details/7201069)
     Imgproc.blur(src, src, new Size(10, 10));
![blur](http://oo0vme8mf.bkt.clouddn.com/blur.png)


# 3锐化
# 4膨胀
# 5腐蚀
[腐蚀膨胀原理](http://www.tuicool.com/articles/ua22Uf)
    
    文字提取方法
    1.转化为灰度图
    2.边缘提取
    3.二值化
    4.膨胀,让轮廓突出
    5.腐蚀，去掉细节
    6.再次膨胀
    7.查找轮廓
    8.剔除部分不可能的轮廓区域(比如面积小的，长宽比错误的)

