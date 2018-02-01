$(function() {
	$('#dg').datagrid( {
		toolbar : '#tb',

		pagination : true,
		pageList : [ 2, 4, 6, 8 ],
		pageSize : 2,
		pageNumber : 1,

		singleSelect : true,
		fit : false,
		url : 'listStatus1',
		columns : [ [{
            field : 'svrId',
            title : '编号',
            width : '16%'
        },  {
			field : 'svrCustName',
			title : '客户',
			width : '16%'
		}, {
			field : 'svrTitle',
			title : '概要',
			width : '16%'
		}, {
			field : 'svrType',
			title : '服务类型',
			width : '16%'
		}, {
			field : 'svrCreateBy',
			title : '创建人',
			width : '16%'
		}, {
			field : 'svrCreateDate',
			title : '创建日期',
			width : '16%'
		} ] ],
        toolbar:[
            {
                text:'删除',
                iconCls:'icon-remove',
                handler:function(){
                    var row = $('#dg').datagrid('getSelected');
                    //判断是否选中
                    if(row){
                        removeService(row['svrId']);
                    }else{
                        $.messager.alert('消息','请选择一行删除!');
                    }
                }
            },'-',{
                text:'分配',
                iconCls : "icon-edit",
                handler : function() {
                    //获得选中行
                    var row = $('#dg').datagrid('getSelected');
                    //判断是否选中
                    if(row){
                        //updateVip(row['vid']);
                        //alert(row.vid);
                        $('#idd').val(row.svrId);
                        $("#dlg").show();
                        $("#dlg").dialog({
                            title: '分配',
                            width: 300,
                            height: 300,
                            closed: false,
                            cache: false,
                            modal: true,
                            buttons : [ {
                                text : '分配',
                                handler : function() {
                                    $("#ff").form('submit', {
                                        url:'editZhipai',
                                        success: function(data){
                                            if(data=='success'){
                                                $('#dg').datagrid("load");
                                                $("#dlg").dialog('close');
                                            }
                                        }
                                    });
                                }
                            } ]
                        });
                    }else{
                        $.messager.alert('消息','请选择一行修改!');
                    }

                }
            }
        ]
    });

	

	$("a.easyui-linkbutton").click(function() {
		var formData={};
		var dictName=$("#dictName").val()||'';
		formData.dictName=dictName;
		$('#dg').datagrid( {
			queryParams : formData
		});
     addFooterButton();
     return false;
	});
	
	function addFooterButton(){
		var pager = $('#dg').datagrid().datagrid('getPager'); // get the pager of datagrid
	pager.pagination( {
		buttons : [
				{
					iconCls : 'icon-add',
					handler : function() {
						//alert('add');
					parent.doOpenTab('字典新增', '/addDict.jsp');
				}
				},
				'-',
				{
					iconCls : 'icon-edit',
					handler : function() {
						alert('edit');
						var row = $('#dg').datagrid('getSelected');
						if (!row) {
							$.messager.alert('警告', '请选择一行记录');
						} else {
							parent.doOpenTab('字典修改',
									'/editDict.jsp?dictId=' + row.dictId);
						}
						console.log(row);
					}
				}, {
					iconCls : 'icon-remove',
					handler : function() {
						alert('remove');
					}
				} ]
	});
	}



    //根据ID删除信息
    function removeService(svrId){
        var selectedRow = $('#dg').datagrid('getSelections');  //获取选中行
        $.messager.confirm('确认','确认删除?',function(r){
            if(r){
                //获得选中行
                var row = $('#dg').datagrid('getSelected');
                var svrIds = row['svrId'];
                //如果当前有选中行
                $.ajax({
                    // 删除
                    url:'delService?svrId='+svrIds,
                    success:function(data){
                        $('#dg').datagrid('load');
                        $('#dg').datagrid('unselectAll');
                        $('#dg').datagrid("load");
                        $.messager.alert('info',"删除成功", "info");

                    }

                });
            }
        }) ;


    }
	console.log("ok");
});