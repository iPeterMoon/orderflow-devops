package mx.edu.orderflow.orders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST encargado de exponer y gestionar los endpoints de las
 * órdenes de los clientes.
 * <p>
 * Todas las operaciones se encuentran bajo la ruta base /api/orders
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> get(@PathVariable long id) {
        return service.find(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CreateOrderRequest r) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.create(r.customerId(), r.total()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
