<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="/common/head.jsp" %>
    <script src="js/listService1.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>

</head>
<body>
<div class="page_title">客户服务管理 > 服务分配</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="reload();">查询</button>
</div>

<table class="query_form_table" height="53">
    <tr>
        <th height="28">客户</th>
        <td><input id="svrCustName"/></td>
        <th height="28">概要</th>
        <td><input id="svrTitle"/></td>
        <th height="28">服务类型</th>
        <td>
            <select id="svrType">
            <option value="全部">全部</option>
            <option value="咨询">咨询</option>
            <option value="建议">建议</option>
            <option value="投诉">投诉</option>
        </select>
        </td>
    </tr>
    <tr>
        <th height="22">创建日期</th>
        <td colspan="3">
        <input id="startDate" size="10" /> - <input id="endStart" size="10" /></td>
        <th height="22">状态</th>
        <td>
            <select id="svrStatus">
                <option selected value="新创建">新创建</option>
            </select>
        </td>
    </tr>
</table>
<br />
<table id="dg"></table>

<!-- 添加/修改对话框 -->
<div id="dlg" class="easyui-dialog"
     style="width:400px;height:280px;padding:10px 20px" closed="true"
     buttons="#dlg-buttons">
    <form id="ff" method="post">
        <div class="fitem">
            <label>分配给:</label>
            <input id="ccc" class="easyui-combobox" name="svrDueId"
                   data-options="valueField:'id',textField:'text',url:'doListUser',data: [{label: '---请选择---',value: '---请选择---'}]"/>
            <input id="idd" type="hidden" name="svrId"/>
        </div>


    </form>
</div>
</body>
</html>
