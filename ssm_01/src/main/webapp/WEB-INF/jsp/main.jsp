<%--
  Created by IntelliJ IDEA.
  User: 20806
  Date: 2022/7/25
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>main</title>
    <script src="/js/jquery-3.3.1.js"></script>
    <script type="text/javascript">
        function show(){
            $.ajax({
                url:"/showAll.action",
                method:"get",
                dataType:"json",
                success:function(list){
                    var s = "";
                    $.each(list,function (i, stu) {
                        s += stu.userId + "===" + stu.uName + "===" + stu.uPass + "<br>";

                    })
                    $("#mydiv").html(s);
                }
            })
        }

        /*function(list){
            var s = "";
            $.each(list,function (i, stu) {
                s += stu.userId + "===" + stu.uName + "===" + stu.uPass + "<br>";

            })
            $("#mydiv").html(s);
        }*/
        function f1(list) {
            var s = "";
            $.each(list,function (i, stu) {
                s += stu.userId + "===" + stu.uName + "===" + stu.uPass + "<br>";

            })
            alert(s)
            $("#mydiv").html(s);
        }
    </script>
</head>
<body>
<a href="javascript:show()">显示列表</a><br>
<div id="mydiv"></div>
</body>
</html>
