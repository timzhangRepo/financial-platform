package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "integral_grades")
@Data
@Schema(name = "IntegralGrade", description = "积分等级表")
public class IntegralGrade {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "积分区间开始")
    private Integer integralStart;

    @Schema(description = "积分区间结束")
    private Integer integralEnd;

    @Schema(description = "借款额度")
    private BigDecimal borrowAmount;

    @Schema(description = "创建时间", example = "2021-01-01 08:00:00")
    private LocalDateTime createTime;

    @Schema(description = "更新时间", example = "2021-01-01 08:00:00")
    private LocalDateTime updateTime;
}