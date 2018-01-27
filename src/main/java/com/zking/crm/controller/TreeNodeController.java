package com.zking.crm.controller;

import com.zking.crm.biz.ITreeNodeBiz;
import com.zking.crm.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TreeNodeController {
    @Autowired
    private ITreeNodeBiz treeNodeBiz;


    @RequestMapping("/toIndex")
    public String toIndex(Model model) {
        System.out.println("toIndex");
//        Yh yh = new Yh();
//        model.addAttribute("command", yh);

        return "redirect:/index2";
    }

    @RequestMapping("/index")
    @ResponseBody
    public List<Map<String, Object>> treeNode(TreeNode treeNode, @RequestParam(name = "id") String id, HttpServletRequest request){
        String parentNodeId =id;


//        TreeNode rr = new TreeNode();
//        rr.setParentNodeId(parentNodeId);
        treeNode.setParentNodeId(Integer.parseInt(parentNodeId));
        List<TreeNode> list = treeNodeBiz.list(treeNode);
        // 转换成easyui-tree控件需要的属性
        List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
        Map<String, Object> node = null;
        Map<String, Object> attributes = null;
        for (TreeNode t : list) {
            //节点内置属性
            node = new HashMap<String, Object>();
            node.put("id", t.getTreeNodeId());
            node.put("text", t.getTreeNodeName());
            node.put("state", t.isLeaf() ? "open" : "closed");

            //添加节点自定义属性
            attributes=new HashMap<String, Object>();
            attributes.put("url", t.getUrl());
            node.put("attributes", attributes);

            nodes.add(node);
        }
//        if ("null".equals(forwards)) {
//            request.setAttribute("nodes", nodes);
//
//        } else {
//            response.setContentType("text/plain;charset=utf-8");
//            ServletOutputStream os = response.getOutputStream();
//            JsonUtils.writeValue(os, nodes);
//            return nodes;
//        }
        return nodes;
    }

    @RequestMapping("/index2")
    public String treeNode2(TreeNode treeNode, HttpServletRequest request, HttpSession session){
      //  String parentNodeId =id;
     //   String forwards = forward;

//        TreeNode rr = new TreeNode();
//        rr.setParentNodeId(parentNodeId);
        //treeNode.setParentNodeId(Integer.parseInt(parentNodeId));
        System.out.println("999999999999999999");
        List<TreeNode> list = treeNodeBiz.list(treeNode);
        // 转换成easyui-tree控件需要的属性
        List<Map<String, Object>> nodes = new ArrayList<Map<String, Object>>();
        Map<String, Object> node = null;
        Map<String, Object> attributes = null;
        for (TreeNode t : list) {
            //节点内置属性
            node = new HashMap<String, Object>();
            node.put("id", t.getTreeNodeId());
            node.put("text", t.getTreeNodeName());
            node.put("state", t.isLeaf() ? "open" : "closed");

            //添加节点自定义属性
            attributes=new HashMap<String, Object>();
            attributes.put("url", t.getUrl());
            node.put("attributes", attributes);

            nodes.add(node);
        }
//        if ("null".equals(forwards)) {
            request.setAttribute("nodes", nodes);
            session.setAttribute("nulls","nulls");
//        } else {
//            response.setContentType("text/plain;charset=utf-8");
//            ServletOutputStream os = response.getOutputStream();
//            JsonUtils.writeValue(os, nodes);
//            return nodes;
//        }
        System.out.println("yyyyyyyyyyyyyyyyy");
        return "index";
    }
    }



