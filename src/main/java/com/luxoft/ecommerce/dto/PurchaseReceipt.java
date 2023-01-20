package com.luxoft.ecommerce.dto;

import com.luxoft.ecommerce.enuns.PurchaseStatus;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PurchaseReceipt implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String userName;

    @Column
    private double debitAmount;

    @Column
    private PurchaseStatus status;
}
