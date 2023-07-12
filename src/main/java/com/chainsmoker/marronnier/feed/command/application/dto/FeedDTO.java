package com.chainsmoker.marronnier.feed.command.application.dto;

import com.chainsmoker.marronnier.feed.command.domain.aggregate.entity.Feed;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Setter
public class FeedDTO {
    private Long Id;
    private Long memberId;
    private Long cocktailId;
    private String content;

    public FeedDTO(Feed feed){
        this.Id = feed.getId();
        this.memberId = feed.getMemberId().getId();
        this.cocktailId = feed.getCocktailId().getId();
        this.content=feed.getContent();
    }
}
