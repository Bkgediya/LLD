package factories;

import java.util.List;
import models.*;
import strategies.*;
import utils.*;

public interface OrderFactory {
    Order createOrder(
        User user,
        Cart cart,
        Restaurant restaurant,
        List<MenuItem> menuItems,
        PaymentStrategy paymentStrategy,
        double totalCost,
        String orderType
    );
}
