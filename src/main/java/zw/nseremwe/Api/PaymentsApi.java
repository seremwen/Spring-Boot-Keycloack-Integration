package zw.nseremwe.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentsApi {

    @GetMapping("/all")
    public List<Payment> getAllPayments() {
        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(101, "John Doe", 50.0));
        payments.add(new Payment(102, "Jane Smith", 75.5));
        payments.add(new Payment(103, "Bob Johnson", 100.0));
        return payments;
    }

    // Sample Payment class
    private static class Payment {
        private int paymentId;
        private String payeeName;
        private double amount;

        public Payment(int paymentId, String payeeName, double amount) {
            this.paymentId = paymentId;
            this.payeeName = payeeName;
            this.amount = amount;
        }

        public int getPaymentId() {
            return paymentId;
        }

        public String getPayeeName() {
            return payeeName;
        }

        public double getAmount() {
            return amount;
        }
    }
}