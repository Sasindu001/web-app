package pizzaloop;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CartRepository extends CrudRepository<Cart, String> {
    List<Cart> findByPname(String pname);
    List<Cart> deleteByPname(String pname);
}
