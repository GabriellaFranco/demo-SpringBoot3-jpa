package com.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.course.entities.OrderItem;
import com.enterprise.course.entities.pk.OrderItemPK;



@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
