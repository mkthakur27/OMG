package com.omg.omgWebApp.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.omg.omgWebApp.model.Cart;
import com.omg.omgWebApp.model.CartItemMap;
import com.omg.omgWebApp.model.CartUserMap;

@Mapper
public interface CartRepo {

//	@Insert("insert into item_size_quantity_price_map(itemid,size,quantity,price) values(#{itemId},#{size},#{quantity},#{price})")
//	public void save(int itemId,String size, int quantity, double price);
	
	@Select("select * from cart_user_map where userid=#{userId}")
	public List<CartUserMap> getCartId(int userId);
	
	@Select("select * from cart where id=#{cartId}")
	public Cart isActive(int cartId);
	
	@Insert("insert into cart_item_map(cartid, itemid, size, quantity) values(#{cartId}, #{itemId}, #{size}, 1)")
	public void addToCart(int cartId, int itemId, String size);
	
	@Insert("insert into cart_user_map(cartid, userid) values(#{cartId}, #{userId})")
	public void addCartUserMap(int cartId, int userId);
	
	@Select("SELECT LAST_INSERT_ID()")
	public int lastInsertId();
	
	@Select("Select quantity from cart_item_map where cartid=#{cartId} AND itemid=#{itemId} AND size=#{size}")
	public List<Integer> getCartItem(int cartId, int itemId, String size);
	
	@Update("Update cart_item_map set quantity=#{quantity} where cartid=#{cartId} AND itemid=#{itemId} AND size=#{size}")
	public void updateQuantity(int cartId, int itemId, String size, int quantity);

	@Insert("insert into cart(isactive) values(1)")
	public void addNewCartId();
	
	@Delete("delete from cart_item_map where cartid=#{cartId} AND itemid=#{itemId} AND size=#{size}")
	public void removeItemFromCart(int cartId, int itemId, String size);
	
	@Update("update cart set isactive=0 where id=#{cartId}")
	public void disableCart(int cartId);
	
	@Select("select * from cart_item_map where cartid=#{cartId}")
	public List<CartItemMap> getCartDetails(int cartId);

	@Select("select * from cart_item_map")
	public List<CartItemMap> getAllCart();
}