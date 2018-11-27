package com.demo.service.security;

import com.demo.dao.security.SecurityUserDao;
import com.demo.entity.SyeRole;
import com.demo.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CustomUserService
 * @Description
 * @Author Hobo
 * @Date 18-11-25 下午2:11
 **/

@Service
public class CustomUserService implements UserDetailsService {


    @Autowired
    SecurityUserDao securityUserDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        SysUser user = securityUserDao.findByUsername(s);

        if (user == null) {
            return (UserDetails) new UsernameNotFoundException("用户不存在");
        }

        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (SyeRole role :user.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        System.out.println(user.getUsername()+"登录成功");
        return new User(user.getUsername(),user.getPassword(),authorities);
    }
}
