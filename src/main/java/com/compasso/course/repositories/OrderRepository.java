package com.compasso.course.repositories;

import com.compasso.course.entities.Order;
import com.compasso.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
