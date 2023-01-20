package com.luxoft.ecommerce.dao;

import com.luxoft.ecommerce.dto.PurchaseReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseReceiptRepository extends JpaRepository<PurchaseReceipt, Long> {

    List<PurchaseReceipt> findByUserName(String userName);
}
