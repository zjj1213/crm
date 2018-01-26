package com.zking.crm.biz.impl;

import com.zking.crm.biz.ITreeNodeBiz;
import com.zking.crm.mapper.TreeNodeMapper;
import com.zking.crm.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeNodeBizImpl implements ITreeNodeBiz {
    @Autowired
    TreeNodeMapper treeNodeMapper;

    @Override
    public TreeNode list(TreeNode record) {
        return treeNodeMapper.list(record);
    }
}
