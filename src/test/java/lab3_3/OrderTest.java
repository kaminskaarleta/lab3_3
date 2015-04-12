package lab3_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = OrderExpiredException.class)
	public void test_expiratedOrder_expectedOrderExpiredException() {
		Order order = new Order();
		order.submit();
		order.confirm();
	}

}
