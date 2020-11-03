package com.lucky.mall.admin.bo;

import com.lucky.mall.mbg.model.UmsAdmin;
import com.lucky.mall.mbg.model.UmsResource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @program: LuckyMall
 * @author: ShyBlue
 * @create: 2020-11-03 10:39
 **/
public class AdminUserDetails implements UserDetails {
    private UmsAdmin umsAdmin;
    private List<UmsResource> resourceList;
    public AdminUserDetails(UmsAdmin umsAdmin,List<UmsResource> resourceList) {
        this.umsAdmin = umsAdmin;
        this.resourceList = resourceList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的角色
//        return resourceList.stream()
//                .map(role ->new SimpleGrantedAuthority(role.getId()+":"+role.getName()))
//                .collect(Collectors.toList());
        return resourceList.stream().map(new Function<UmsResource, SimpleGrantedAuthority>() {
            @Override
            public SimpleGrantedAuthority apply(UmsResource role) {

                /**
                 * 查询当前登录的用户可以授权的资源 根据id:name
                 */
                return new SimpleGrantedAuthority(role.getId()+":"+role.getName());
            }
        }).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }
}