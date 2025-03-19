package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Document(collection = "user_integrals")
@Data
@Schema(name = "UserIntegral", description = "用户积分记录表")
public class UserIntegral {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "积分")
    private Integer integral;

    @Schema(description = "获取积分说明")
    private String content;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}