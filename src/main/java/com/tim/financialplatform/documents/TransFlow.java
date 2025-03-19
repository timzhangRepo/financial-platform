package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "trans_flows")
@Data
@Schema(name = "TransFlow", description = "交易流水表")
public class TransFlow {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "用户名称")
    private String userName;

    @Schema(description = "交易单号")
    private String transNo;

    @Schema(description = "交易类型（1：充值 2：提现 3：投标 4：投资回款 ...）")
    private Integer transType;

    @Schema(description = "交易类型名称")
    private String transTypeName;

    @Schema(description = "交易金额")
    private BigDecimal transAmount;

    @Schema(description = "备注")
    private String memo;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}