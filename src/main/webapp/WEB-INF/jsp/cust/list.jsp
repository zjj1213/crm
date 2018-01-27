<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>

<head>
    <title>CRM客户关系管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
</head>


<body>
<div class="page_title">客户信息管理</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="reload();">查询</button>
</div>

<f:form modelAttribute="customer" action="kehuxixilist">

   <table class="query_form_table">
    <tr>
        <th>客户编号</th>
        <td><input /></td>
        <th>名称</th>
        <td><input /></td>
        <th>地区</th>
        <td>
            <select name="custRegion">
                <option>请选择...</option>
                <option>全部</option>
                <option>北京</option>
                <option>华北</option>
                <option>中南</option>
                <option>东北</option>
                <option>西部</option>
            </select>
        </td>
    </tr>
    <tr>
        <th>客户经理</th>
        <td><input /></td>
        <th>客户等级</th>
        <td>
            <select name="custLevelLabel">
                <option>请选择...</option>
                <option>全部</option>
                <option>战略合作伙伴</option>
                <option>合作伙伴</option>
                <option>大客户</option>
                <option>普通客户</option>
            </select>
        </td>
        <th>　</th>
        <td>　</td>
    </tr>
</table>
<br />
<table class="data_list_table">
    <tr>
        <th>序号</th>
        <th>客户编号</th>
        <th>名称</th>
        <th>地区</th>
        <th>客户经理</th>
        <th>客户等级</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${customerList}" var="c">
        <tr>
            <td class="list_data_number"></td>
            <td class=class="list_data_text">${c.custNo}</td>
            <td class="list_data_ltext">${c.custName}</td>
            <td class="list_data_text">${c.custRegion}</td>
            <td class=list_data_text>${c.custManagerName}</td>
            <td class="list_data_text">${c.custLevelLabel}</td>
        </tr>


    </c:forEach>

    <tr>
        <td class="list_data_op">
            <img onclick="to('edit.html');" title="编辑" src="../../images/bt_edit.gif" class="op_button" />
            <img onclick="to('linkman.html');" title="联系人" src="../../images/bt_linkman.gif" class="op_button" />
            <img onclick="to('activities.html');" title="交往记录" src="../../images/bt_acti.gif" class="op_button" />
            <img onclick="to('orders.html');" title="历史订单" src="../../images/bt_orders.gif" class="op_button" />
            <img onclick="del('“客户：聪海信息科技有限公司”');" title="删除" src="../../images/bt_del.gif" class="op_button" />

        </td>
    </tr>

   </table>

</f:form>

</body>

</html>
