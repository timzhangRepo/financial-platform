package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

/**
 * 借款人
 */
@Data
@Document(collection = "borrowers")
@Schema(name = "Borrower", description = "借款人")
public class Borrower {

    @Id
    private String id;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "姓名")
    private String name;

    @Schema(description = "身份证号")
    private String idCard;

    @Schema(description = "手机")
    private String mobile;

    @Schema(description = "性别（1：男 0：女）")
    private Integer sex;

    @Schema(description = "年龄")
    private Integer age;

    @Schema(description = "学历")
    private Integer education;

    @Schema(description = "是否结婚（1：是 0：否）")
    private Boolean marry;

    @Schema(description = "行业")
    private Integer industry;

    @Schema(description = "月收入")
    private Integer income;

    @Schema(description = "还款来源")
    private Integer returnSource;

    @Schema(description = "联系人名称")
    private String contactsName;

    @Schema(description = "联系人手机")
    private String contactsMobile;

    @Schema(description = "联系人关系")
    private Integer contactsRelation;

    @Schema(description = "状态（0：认证中 1：认证通过 -1：认证失败）")
    private Integer status;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}