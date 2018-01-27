<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title></title>
	<%@ include file="/common/head.jsp" %>
	<script type="text/javascript">
	var contextPath="<%=request.getContextPath()%>";
	$(function(){

        $('#t1').tabs({
            onBeforeClose:function(title,index){
                if(1==$('#t1').tabs("tabs").length){
                    $('#t1').tabs('add',{
                        title:"桌面",
                        closable:true,
                        index:1,
                        content:'<div title="桌面" style="padding:20px;display:none;" data-options="closable:false">桌面</div>'
                    });
                }
                return true;
            }

        });
	$("ul.myTree").each(function(){
	     var id= $(this).attr("id");
	     var url="index?id="+id;
	     $(this).tree({
	     url:url,
	     onLoadSuccess:function(){
	     $("ul.myTree").tree("options").url="index";
	         },
	         onSelect:function(node){
	         if(!node.attributes.url)return;
	         
	         var text=node.text;
	         var href=node.attributes.url;
	         doOpenTab(text,href);
	        
	         }
	     });
	});
	});
	
	
	function doOpenTab(text,href){

	              href=contextPath+"/add";



	              if(!$('#t1').tabs('exists',text)){
                      href+="?ts="+new Date().getTime();
	              var content ='<iframe scrolling="no" frameborder="0" src="'+href+'" style="width:99%;height:99%;"></iframe>';
	              $('#t1').tabs('add',{
	              title:text,
	              selected:true,
	              closable:true,
	              content:content
	              });
	              }else{
	              $('#t1').tabs('select',text);
	              }



	}
	</script>
  </head>
  
  <body class="easyui-layout">

		<div class="easyui-accordion" data-options="region:'west',split:true" style="width:20%;">
            <c:if test="${nulls == null}"><c:import url="/index2">
        </c:import></c:if>

            <c:forEach var="v" items="${nodes}">
                <div title="${v.text}">
                <ul class="myTree" id="${v.id}"></ul>
                </div>
            </c:forEach>

		</div>
		<div id="t1" class="easyui-tabs" data-options="region:'center'" style="padding:0px;background:#eee;">
            <div title="桌面" style="padding:20px;display:none;" data-options="closable:true">
                <h2>桌面</h2>
            </div>
		</div>
	</body>
</html>
