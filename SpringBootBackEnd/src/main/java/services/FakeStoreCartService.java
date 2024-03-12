package services;

@Service
public class FakeStoreCartService {
    public class FakeStoreCartService implements CartService {
        private RestTemplate restTemplate = new RestTemplate();

        @Override
        public List<Cart> getAllCarts() {

            return null;
        }

        @Override
        public Cart getSingleCart(Long id) {
          return null;
        }
        }
}
