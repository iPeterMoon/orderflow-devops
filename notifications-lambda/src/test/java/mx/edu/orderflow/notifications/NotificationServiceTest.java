package mx.edu.orderflow.notifications;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NotificationServiceTest {
    @Test
    void createsConfirmation() {
        var m = new NotificationService().confirmation("1001", "c-1");
        assertTrue(m.message().contains("1001"));
    }
}
