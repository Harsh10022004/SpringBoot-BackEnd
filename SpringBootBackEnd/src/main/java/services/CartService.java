package services;

public interface CartService {
    List<Service> getAllServices();

    Service getSingleService(Long id);

    Service createService(Service service);
}
