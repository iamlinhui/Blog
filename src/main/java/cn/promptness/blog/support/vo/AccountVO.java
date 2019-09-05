package cn.promptness.blog.support.vo;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author : Lynn
 * @date : 2019-05-31 22:42
 */
@Data
public class AccountVO {

    @NotNull(message = "登录名不能为空", groups = {Login.class})
    private String loginName;

    @NotNull(message = "密码不能为空", groups = {Login.class})
    private String password;

    @NotNull(message = "登录名不能为空", groups = {Register.class})
    private String username;

    @Email(message = "邮箱格式不正确", groups = {Register.class, Forget.class})
    private String email;

    private String userNiceName;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }


    public interface Login {
    }

    public interface Register {
    }

    public interface Forget {
    }
}
