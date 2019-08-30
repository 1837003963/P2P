package com.zking.p2p.controller;

import com.zking.p2p.model.TreeNode;
import com.zking.p2p.service.ITreeNodeService;
import com.zking.p2p.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeNodeController {
    @Autowired
    private ITreeNodeService iTreeNodeService;

    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(TreeNode treeNode){
        JsonData jsonData=new JsonData();
        List<TreeNode> list = iTreeNodeService.list(treeNode);
        jsonData.setCode(0);
        jsonData.put("list",list);
        return jsonData;
    }
}
