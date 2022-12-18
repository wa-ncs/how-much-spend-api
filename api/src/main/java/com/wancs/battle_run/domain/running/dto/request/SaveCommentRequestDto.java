package com.wancs.battle_run.domain.running.dto.request;

import com.wancs.battle_run.domain.running.entity.Comment;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SaveCommentRequestDto {
    private Long userId;

    private String content;

    public Comment toEntity(Long recordId){
        return Comment.builder()
                .recordId(recordId)
                .userId(this.userId)
                .content(this.content)
                .build();
    }
}
