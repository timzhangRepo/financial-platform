package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "user_accounts")
@Data
@Schema(name = "UserAccount", description = "用户账户")
public class UserAccount {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "帐户可用余额")
    private BigDecimal amount;

    @Schema(description = "冻结金额")
    private BigDecimal freezeAmount;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "版本号")
    private Integer version;
}