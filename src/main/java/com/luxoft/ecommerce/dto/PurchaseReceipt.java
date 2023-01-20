package com.luxoft.ecommerce.dto;

import com.luxoft.ecommerce.enuns.PurchaseStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PurchaseReceipt {
    private String username;

    private double debitAmount;

    private PurchaseStatus status;
}
