package com.zeta.ai.zeta_ai.application.dtos;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @EqualsAndHashCode.Include
    @Column(name = "uuid", updatable = false, nullable = false)
    @Getter
    @Setter
    private UUID uuid;

    @Getter
    @Setter
    @CreationTimestamp
    @Column(nullable = false, updatable = false, columnDefinition = "timestamp with time zone")
    private OffsetDateTime createDateTime;

    @PrePersist
    public void generateUuid() {
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
    }
}
