package com.luxoft.ecommerce.services;

import com.luxoft.ecommerce.dto.PurchaseReceipt;

import java.util.List;

public interface PurchaseService {
    List<PurchaseReceipt> findByClient(String clientName);
}
