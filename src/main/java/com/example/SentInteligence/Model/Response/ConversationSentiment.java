package com.example.SentInteligence.Model.Response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
public class ConversationSentiment {
    private String conversationId;   // Unique identifier for the conversation
    private double score;             // Sentiment score (e.g., 95.56)
    private String rating;            // Sentiment rating (e.g., "POSITIVE")
    private String description;       // Description or summary of the sentiment analysis
    private Map<String,String> metadata;
}