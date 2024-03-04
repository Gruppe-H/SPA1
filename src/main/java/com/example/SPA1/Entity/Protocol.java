package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Protocols")
public class Protocol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "protocol_id")
    private int protocolId;

    @Column(name = "protocol")
    private String protocol;

    @Column(name = "protocol_column")
    private String protocolColumn;

    @Column(name = "emission_id")
    private Long emissionId;
}
