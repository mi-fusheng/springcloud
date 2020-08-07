package cn.fusheng.springcloud.service;

import cn.fusheng.springcloud.entities.Payment;

public interface PaymentService {
   public int create(Payment payment);

   public Payment getPaymentById(Long id);

}
