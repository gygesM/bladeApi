package org.drill.service;

import org.drill.model.po.User;
import org.drill.model.vo.ActiveUser;

import java.util.List;

/**
 * Created by gygesM on 2016/11/23.
 */
public interface UserService {
    /**
     * 根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
     * @param userCode
     * @param password
     * @return
     * @throws Exception
     */
   public ActiveUser authenticate(String userCode,String password) throws Exception;
}
