package com.wjh.server;

import com.wjh.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/", description = "全部的post请求")
@RequestMapping("/v1")
public class MyPostMethod {

    //这个变量用来装cookies信息的。
    private static Cookie cookie;

    /**
     * 用户登录成功，获取到cookies
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后获取cookies",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName", required = true) String userName,
                        @RequestParam(value = "password", required = true) String password) {
        if (userName.equals("zhangsan")  && password.equals("123456")){
            cookie = new Cookie("login", "true");
            response.addCookie(cookie);
            return "恭喜你登录成功了！";
        }
        return "用户名或者密码错误";
    }

    /**
     * 登陆成功，得到的cookies后，再去查找用户列表。
     */
    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                            @RequestBody User user){
        //获取cookies
        Cookie[] cookies = request.getCookies();
        User u;
        //验证cookies是否合法
        for (Cookie c : cookies) {
            if (c.getName().equals("login")
                    && c.getValue().equals("true")
                    && user.getUsername().equals("zhangsan")
                    && user.getPassword().equals("123456")){
                u = new User();
                u.setName("lisi");
                u.setAge("18");
                u.setSex("man");
                return u.toString();
            }
        }
        return "cookies参数不合法";
    }
}
