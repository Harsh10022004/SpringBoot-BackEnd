package controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    private final CartService CartService;

    public CartController(CartService CartService) {

        this.CartService = CartService;
    }

    @GetMapping("/Carts")
    public List<Cart> getAllCarts() {


        return new ArrayList<>();
    }

    @GetMapping("/Carts/{id}")
    public Cart getSingleCart(@PathVariable("id") Long id) {

        return CartService.getSingleCart(id);
    }
}

