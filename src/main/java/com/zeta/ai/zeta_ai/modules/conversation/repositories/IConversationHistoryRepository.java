package com.zeta.ai.zeta_ai.modules.conversation.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeta.ai.zeta_ai.modules.conversation.models.ConversationHistory;

@Repository
public interface IConversationHistoryRepository extends JpaRepository<ConversationHistory, UUID> {

    
}
