$(function () {
    $('#dg').datagrid({
        toolbar : '#tb',
        pagination : true,
        pageList : [ 2, 4, 6, 8 ],
        pageSize : 2,
        pageNumber : 1,

        singleSelect : true,
        fit : false,
        url : 'customerList',

        columns : [ [{
            field : 'custNo',
            title : '客户编号',
            width : '18%'
        },  {
            field : 'custName',
            title : '名称',
            width : '16%'
        }, {
            field : 'custRegion',
            title : '地区',
            width : '16%'
        }, {
            field : 'custManagerName',
            title : '客户经理',
            width : '16%'
        }, {
            field : 'custLevelLabel',
            title : '客户等级',
            width : '16%'
        } ] ]

    });

});