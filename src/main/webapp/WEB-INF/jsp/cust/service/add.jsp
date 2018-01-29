<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="/common/head.jsp" %>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>

    <script type="text/javascript">
        //添加用户信息
        function addObject(){
            alert(9999);
            $('#fm').form('submit', {
                url:'addService'
        });
            $('#fm').form('clear');
        }
    </script>
</head>
<body>
<div class="page_title">客户服务管理 > 服务创建</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="addObject();">保存</button>
</div>
<table class="query_form_table">
    <form id="fm" method="post" >
    <tr>
        <th>编号</th>
        <td><input disabled /></td>
        <th>服务类型</th>
        <td>
            <select name="svrType">
                <option>请选择...</option>
                <option value="咨询">咨询</option>
                <option value="投诉">投诉</option>
                <option value="建议">建议</option>
            </select><span class="red_star">*</span>
        </td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3"><input size="53" name="svrTitle"/><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>客户</th>
        <td><input name="svrCustName" size="20" /><span class="red_star">*</span></td>
        <th>状态</th>
        <td>新创建</td>
    </tr>
    <tr>
        <th>服务请求</th>
        <td colspan="3"><textarea rows="6" cols="50" name="svrRequest"></textarea><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>创建人</th>
        <td><input name="svrCreateBy" value="黄师傅" readonly size="20" /><span class="red_star">*</span></td>
    </tr>
    </form>
</table>
<br />
<table disabled class="query_form_table" id="table3">
    <tr>
        <th>分配给</th>
        <td>
            <select>
                <option>请选择...</option>
                <option>小明</option>
                <option>旺财</option>
                <option>球球</option>
                <option>孙小美</option>
                <option>周洁轮</option>
            </select> <span class="red_star">*</span></td>
        <th>分配时间</th>
        <td><input id="t2"  readonly size="20" /><span class="red_star">*</span></td>
    </tr>
</table>
<br />
<table disabled class="query_form_table" id="table1">
    <tr>
        <th>服务处理</th>
        <td colspan="3"><textarea rows="6" cols="50"></textarea><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>处理人</th>
        <td><input  value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
        <th>处理时间</th>
        <td><input id="t3"  readonly size="20" /><span class="red_star">*</span></td>
    </tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
    <tr>
        <th>处理结果</th>
        <td><input size="20" /><span class="red_star">*</span></td>
        <th>满意度</th>
        <td>
            <select >
                <option>请选择...</option>
                <option>☆☆☆☆☆</option>
                <option>☆☆☆☆</option>
                <option>☆☆☆</option>
                <option>☆☆</option>
                <option>☆</option>
            </select><span class="red_star">*</span></td>
    </tr>
</table>
<script>
    setCurTime('t1');
    setCurTime('t2');
    setCurTime('t3');
</script>



</body>
</html>
