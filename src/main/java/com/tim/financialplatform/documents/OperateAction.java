package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Document(collection = "operate_actions")
@Data
@Schema(name = "OperateAction", description = "操作行为记录表")
public class OperateAction {

    @Id
    @Schema(description = "id")
    private String id;

    @Schema(description = "操作主键id")
    private Long operateId;

    @Schema(description = "操作类型")
    private String operateType;

    @Schema(description = "操作内容")
    private String content;

    @Schema(description = "操作用户id")
    private Long actUserId;

    @Schema(description = "操作用户名")
    private String actUser;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}