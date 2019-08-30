package com.zking.p2p.controller;

import com.zking.p2p.model.Yo;
import com.zking.p2p.service.IYonhuService;
import com.zking.p2p.util.HttpUtils;
import com.zking.p2p.util.JsonData;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class YonhuController {
    @Autowired
    private IYonhuService iYonhuService;

    private String yzm = null;

    @RequestMapping("/add")
    @ResponseBody
    public JsonData add(Yo yo) {
        JsonData jsonData=new JsonData();
        if (yo.getYoYan().equals(yzm)){
            System.out.println("进来了》》》》》");
            iYonhuService.add(yo);
            jsonData.setCode(0);
            jsonData.setMessage("注册成功！！");
            return jsonData;
        }else{
            System.out.println(yo.getYoYan());
            jsonData.setCode(1);
            jsonData.setMessage("注册失败！！");
            return jsonData;
        }

    }

    @RequestMapping("/Yan")
    @ResponseBody
    public void main(String[] args, Yo yo) throws UnsupportedEncodingException {
        String host = "http://yzx.market.alicloudapi.com";
        String path = "/yzx/sendSms";
        String method = "POST";
        String appcode = "c45039b13fe64e268de772be011b9559";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();

        String s = "";
        while (s.length() < 6)
            s += (int) (Math.random() * 10);
        yzm = s;
        querys.put("mobile", String.valueOf(yo.getYoTe()));
        querys.put("param", "code:"+s+"");
        querys.put("tpl_id", "TP1710262");
        Map<String, String> bodys = new HashMap<String, String>();

        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
