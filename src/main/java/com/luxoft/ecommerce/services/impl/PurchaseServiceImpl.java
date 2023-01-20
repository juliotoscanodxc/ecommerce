package com.luxoft.ecommerce.services.impl;

import com.luxoft.ecommerce.dao.PurchaseReceiptRepository;
import com.luxoft.ecommerce.dto.PurchaseReceipt;
import com.luxoft.ecommerce.services.PurchaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseReceiptRepository repository;

    @Override
    public List<PurchaseReceipt> findByClient(String clientName) {
        return repository.findByUserName(clientName);
    }
}
