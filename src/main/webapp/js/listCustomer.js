$(function () {
    $('#dg').datagrid({
        toolbar : '#tb',

        pagination : true,
        pageList : [ 2, 4, 6, 8 ],
        pageSize : 2,
        pageNumber : 1,

        singleSelect : true,
        fit : false,
        url : 'cust/kehuxixilist',

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
        }] ],

        toolbar:[
            {
                text:'修改',
                iconCls:'icon-edit',
                handler:function(){
                   alert("客服信息修改")
                    parent.doOpenTab('修改','/edit')
                }
            },'-',{
                text:'联系人',
                iconCls : "op_button",
                handler : function() {
                    alert("联系人")
                    parent.doOpenTab('联系人','/linkman')
                }
            },'-',{
              text:'交往记录',
                iconCls:"op_button",
                handler:function () {
                    alert("交往记录")
                }
            },'-',{
                text:'历史订单',
                iconCls:"op_button",
                handler:function () {
                    alert("交往记录")
                }
            },'-',{
                text:'删除',
                iconCls:"icon-remove",
                handler:function () {
                    alert("删除")
                    parent.doOpenTab('字典修改','/add');
                }
            }
        ]


    });








});