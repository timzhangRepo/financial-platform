package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Document(collection = "user_login_records")
@Data
@Schema(name = "UserLoginRecord", description = "用户登录记录表")
public class UserLoginRecord {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "ip")
    private String ip;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}