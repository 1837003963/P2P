package com.zking.p2p.service.impl;

import com.zking.p2p.mapper.TreeNodeMapper;
import com.zking.p2p.model.TreeNode;
import com.zking.p2p.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeNodeService implements ITreeNodeService {
    @Autowired
    private TreeNodeMapper treeNodeMapper;


    @Override
    public List<com.zking.p2p.model.TreeNode> list(TreeNode treeNode) {
        return treeNodeMapper.list(treeNode);
    }
}
