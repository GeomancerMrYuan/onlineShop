package com.yp.manager.controller;

import com.alibaba.fastjson.JSONObject;
import com.yp.common.util.FastDFSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * desc
 *
 * @Author 袁朋
 * @Date 2019/4/9
 */
@Controller
public class PictureController {

    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;

    @RequestMapping(value="/pic/upload",produces = MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
    @ResponseBody
    public String fileUpload(MultipartFile uploadFile) {
        try { //1、取文件的扩展名
            String originalFilename = uploadFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1); //2、创建一个 FastDFS 的客户端
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:conf/config.properties"); //3、执行上传处理
            String path = fastDFSClient.uploadFile(uploadFile.getBytes(), extName); //4、拼接返回的 url 和 ip 地址，拼装成完整的 url
            String url = IMAGE_SERVER_URL + path;
            //5、返回 map
            Map result = new HashMap<>();
            result.put("error", 0);
            result.put("url", url);
            return JSONObject.toJSONString(result);
        } catch (Exception e) {
            e.printStackTrace();
            //5、返回 map
            Map result = new HashMap<>();
            result.put("error", 1);
            result.put("message", "图片上传失败");
            return JSONObject.toJSONString(result);

        }
    }
}