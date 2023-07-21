package com.alexandreloiola.salesmanagement.model;

import javax.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "TB_ORDER")
public class OrderModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code_order", length = 10, nullable = false, unique = true)
    private Long orderNumber;

    @Column(name = "total_price", precision = 10, scale = 2 , nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "data_time", nullable = false)
    private LocalDateTime dataTime;

    @OneToOne
    @JoinColumn(name = "id_status", referencedColumnName = "id")
    private OrderStatusModel status;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private PersonModel customer;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private PersonModel seller;

}
