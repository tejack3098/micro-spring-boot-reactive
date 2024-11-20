package com.tejack.microspringbootreactive;


import com.tejack.microspringbootreactive.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {

}
