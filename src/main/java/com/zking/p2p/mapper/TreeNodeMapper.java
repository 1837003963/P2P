package com.zking.p2p.mapper;

import com.zking.p2p.model.TreeNode;

import java.util.List;

public interface TreeNodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    List<TreeNode> list(TreeNode treeNode);
}