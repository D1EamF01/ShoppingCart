package com.dreamfor.shoppingcart.service.impl;

import com.dreamfor.shoppingcart.dao.UserDao;
import com.dreamfor.shoppingcart.domain.ProductQuantity;
import com.dreamfor.shoppingcart.domain.User;
import com.dreamfor.shoppingcart.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean insertUser(User user) {
        long id = userDao.insertUser(user);
        if(id == -1)
            return false;
        else{
            user.setUser_id(String.valueOf(id));
            return true;
        }
    }

    @Override
    public User queryUserByID(int id) {
        return userDao.queryUserByID(id);
    }

    @Override
    public void updateSelectedProducts(int userId, int productId, int quantity) {
        userDao.updateSelectedProducts(userId, productId, quantity);
    }

    @Override
    public List<ProductQuantity> getSelectedProducts(int userId) {
        return userDao.getSelectedProducts(userId);
    }
}
