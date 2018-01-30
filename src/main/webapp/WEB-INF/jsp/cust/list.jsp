<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>

<head>
    <title>CRM客户关系管理</title>
    <%@ include file="/common/head.jsp" %>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
    <script src="js/listCustomer.js"></script>

    <%--<script type="text/javascript">--%>
    <%--var contextPath="<%=request.getContextPath()%>";--%>
    <%--function doOpenTab(text,href){--%>
        <%--href=contextPath+href;--%>
        <%--if(!$('#t1').tabs('exists',text)){--%>
            <%--href+="?ts="+new Date().getTime();--%>
            <%--var content ='<iframe scrolling="no" frameborder="0" src="'+href+'" style="width:99%;height:99%;"></iframe>';--%>
            <%--$('#t1').tabs('add',{--%>
                <%--title:text,--%>
                <%--selected:true,--%>
                <%--closable:true,--%>
                <%--content:content--%>
            <%--});--%>
        <%--}else{--%>
            <%--$('#t1').tabs('select',text);--%>
        <%--}--%>
    <%--}--%>
<%--</script>--%>

</head>

<body>

<div class="page_title">客户信息管理</div>

<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="reload();">查询</button>
</div>

   <table class="query_form_table">
    <tr>
        <th>客户编号</th>
        <td><input id="custNo"/></td>
        <th>名称</th>
        <td><input id="custName"/></td>
        <th>地区</th>
        <td>
            <select id="custRegion">
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
        <td><input id="custManagerName"/></td>
        <th>客户等级</th>
        <td>
            <select id="custLevelLabel">
                <option>请选择...</option>
                <option>全部</option>
                <option>战略合作伙伴</option>
                <option>合作伙伴</option>
                <option>大客户</option>
                <option>普通客户</option>
            </select>
        </td>
    </tr>
</table>
<br/>

<table id="dg"></table>

</body>
</html>
