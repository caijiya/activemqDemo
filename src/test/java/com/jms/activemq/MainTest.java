package com.jms.activemq;

import com.baidu.aip.face.AipFace;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class MainTest {
    //设置APPID/AK/SK
    public static final String APP_ID = "11713159";
    public static final String API_KEY = "Gr44n7RHjAY8EhDQv4KM21D0";
    public static final String SECRET_KEY = "xE5yxwWruvmEScw6y26Shd0GMS9Rpvml";

    public static void main(String[] args) throws JSONException {
        // 初始化一个AipFace
        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        //  System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        String path = "G:\\activemq\\src\\main\\resources\\img\\beautiful.jpg";

        String imageType = "jpg";
        JSONObject res = client.detect(path, imageType, new HashMap<String, String>());
        System.out.println(res.toString());

    }
}


