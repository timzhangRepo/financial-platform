package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "borrow_info")
@Data
@Schema(name = "BorrowInfo", description = "借款信息表")
public class BorrowInfo {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "借款用户id")
    private Long userId;

    @Schema(description = "借款金额")
    private BigDecimal amount;

    @Schema(description = "借款期限")
    private Integer period;

    @Schema(description = "年化利率")
    private BigDecimal borrowYearRate;

    @Schema(description = "还款方式 1-等额本息 2-等额本金 3-每月还息一次还本 4-一次还本")
    private Integer returnMethod;

    @Schema(description = "资金用途")
    private Integer moneyUse;

    @Schema(description = "状态（0：默认 1：审核通过 -1：审核不通过）")
    private Integer status;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}