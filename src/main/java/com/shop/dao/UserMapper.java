package com.shop.dao;






import java.util.List;

import com.shop.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectUserByName(String name);
}