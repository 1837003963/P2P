package com.zking.p2p.service;

import com.zking.p2p.model.TreeNode;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ITreeNodeService {
    List<TreeNode> list(TreeNode treeNode);
}
