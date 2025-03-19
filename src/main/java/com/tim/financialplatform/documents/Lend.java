package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "lends")
@Data
@Schema(name = "Lend", description = "标的准备表")
public class Lend {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "借款用户id")
    private Long userId;

    @Schema(description = "借款信息id")
    private Long borrowInfoId;

    @Schema(description = "标的编号")
    private String lendNo;

    @Schema(description = "标题")
    private String title;

    @Schema(description = "标的金额")
    private BigDecimal amount;

    @Schema(description = "投资期数")
    private Integer period;

    @Schema(description = "年化利率")
    private BigDecimal lendYearRate;

    @Schema(description = "平台服务费率")
    private BigDecimal serviceRate;

    @Schema(description = "还款方式")
    private Integer returnMethod;

    @Schema(description = "最低投资金额")
    private BigDecimal lowestAmount;

    @Schema(description = "已投金额")
    private BigDecimal investAmount;

    @Schema(description = "投资人数")
    private Integer investNum;

    @Schema(description = "发布日期")
    private LocalDateTime publishDate;

    @Schema(description = "开始日期")
    private LocalDate lendStartDate;

    @Schema(description = "结束日期")
    private LocalDate lendEndDate;

    @Schema(description = "说明")
    private String lendInfo;

    @Schema(description = "平台预期收益")
    private BigDecimal expectAmount;

    @Schema(description = "实际收益")
    private BigDecimal realAmount;

    @Schema(description = "状态")
    private Integer status;

    @Schema(description = "审核时间")
    private LocalDateTime checkTime;

    @Schema(description = "审核用户id")
    private Long checkAdminId;

    @Schema(description = "放款时间")
    private LocalDateTime paymentTime;

    @Schema(description = "放款人id")
    private Long paymentAdminId;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}