package com.zeta.ai.zeta_ai.modules.conversation.models;

import java.util.UUID;

import com.zeta.ai.zeta_ai.application.dtos.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "conversation_history")
@AllArgsConstructor
public class ConversationHistory extends BaseEntity{
    
    @Column(nullable = false)
    private UUID userUuid;

    @Column(nullable = false)
    private String content;

}
