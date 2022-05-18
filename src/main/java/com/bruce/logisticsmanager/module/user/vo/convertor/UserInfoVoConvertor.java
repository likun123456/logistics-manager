package com.bruce.logisticsmanager.module.user.vo.convertor;

import com.bruce.logisticsmanager.convertor.IVoConvertor;
import com.bruce.logisticsmanager.entity.UserEntity;
import com.bruce.logisticsmanager.module.user.vo.UserInfoVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/18 10:53
 */
@Mapper(componentModel = "spring")
public abstract class UserInfoVoConvertor implements IVoConvertor<UserInfoVO, UserEntity> {

    @Mappings({
            @Mapping(source = "nickname", target = "name"),
            @Mapping(source = "role", target = "roles", qualifiedByName = "getRoles")
    })
    @Override
    public abstract UserInfoVO po2Vo(UserEntity var1);

    @Named("getRoles")
    public static int[] getRoles(Integer role) {
        int[] roles = new int[1];
        roles[0] = role;
        return  roles;
    }
}
