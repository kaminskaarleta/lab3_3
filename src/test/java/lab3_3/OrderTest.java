package lab3_3;

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
		//Added 25h to current time
		FakeTime fakeTime = new FakeTime(25*60*60*1000);
		Order order = new Order(fakeTime);
		order.submit();
		order.confirm();
	}

}
