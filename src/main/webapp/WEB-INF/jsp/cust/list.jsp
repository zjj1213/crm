<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>

<head>
    <title>CRM客户关系管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>

    <script type="text/javascript">

        $('#dg').datagrid({
            loadFilter: function(data){
                if (data.q){
                    return data.q;
                } else {
                    return data;
                }
            }

        });



    </script>

</head>

<body class="easyui-layout" fit="true">
<div class="page_title">客户信息管理</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="reload();">查询</button>
</div>

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
<br/>
<div region="center" border="false" style="overflow: hidden;">

<table id="dg" class="data_list_table" data-options="url:'/cust/list',fitColumns:true,singleSelect:true">
    <thead>
    <tr>
        <th>序号</th>
        <th data-options="field:'custNo'">客户编号</th>
        <th data-options="field:'custName'">名称</th>
        <th data-options="field:'custRegion'">地区</th>
        <th data-options="field:'custManagerName'">客户经理</th>
        <th data-options="field:'custLevelLabel'">客户等级</th>
        <th>操作</th>
    </tr>
    </thead>
   </table>

</div>

</body>
</html>
