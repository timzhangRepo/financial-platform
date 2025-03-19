package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "lend_items")
@Data
@Schema(name = "LendItem", description = "标的出借记录表")
public class LendItem {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "投资编号")
    private String lendItemNo;

    @Schema(description = "标的id")
    private Long lendId;

    @Schema(description = "投资用户id")
    private Long investUserId;

    @Schema(description = "投资人名称")
    private String investName;

    @Schema(description = "投资金额")
    private BigDecimal investAmount;

    @Schema(description = "年化利率")
    private BigDecimal lendYearRate;

    @Schema(description = "投资时间")
    private LocalDateTime investTime;

    @Schema(description = "开始日期")
    private LocalDate lendStartDate;

    @Schema(description = "结束日期")
    private LocalDate lendEndDate;

    @Schema(description = "预期收益")
    private BigDecimal expectAmount;

    @Schema(description = "实际收益")
    private BigDecimal realAmount;

    @Schema(description = "状态（0：默认 1：已支付 2：已还款）")
    private Integer status;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}