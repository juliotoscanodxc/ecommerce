package com.luxoft.ecommerce.controller;

import com.luxoft.ecommerce.dto.PurchaseReceipt;
import com.luxoft.ecommerce.dto.PurchaseRequest;
import com.luxoft.ecommerce.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ecommerce")
public class EcommerceController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    @Transactional
    public PurchaseReceipt buy(@RequestBody PurchaseRequest request) {

        // Send message to kafka

        //save purchase confirmation in database

        // return purchase receipt
        return new PurchaseReceipt();
    }

    @GetMapping("/purchases/${clientName}")
    public List<PurchaseReceipt> findByClient(@PathVariable String clientName) {

        List<PurchaseReceipt> purchasesReceipts = purchaseService.findByClient(clientName);

        return purchasesReceipts;
    }
}
