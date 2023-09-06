package com.dreamfor.shoppingcart.service;

import com.dreamfor.shoppingcart.domain.Product;
import com.dreamfor.shoppingcart.domain.ProductQuantity;

import java.util.List;

public interface ProductService {
    // 查询用户添加的商品以及对应数量
    List<ProductQuantity> getUserProducts(int userId);

    // 设定用户购买商品的数量 返回操作结果
    boolean setProductAndSyncUser(int userId, int productId, int quantity);

    // 根据物品ID获取物品所有数据
    Product getProduct(int productId);

    // 根据物品名称获取物品列表
    List<Product> getProductsByNameFromDB(String productName);

    // 根据ProductQuantity列表获取物品信息列表
    List<Product> getProductsByProductQuantities(List<ProductQuantity> productQuantityList);
}
