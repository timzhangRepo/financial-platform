package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Document(collection = "user_binds")
@Data
@Schema(name = "UserBind", description = "用户绑定表")
public class UserBind {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "用户姓名")
    private String name;

    @Schema(description = "身份证号")
    private String idCard;

    @Schema(description = "银行卡号")
    private String bankNo;

    @Schema(description = "银行类型")
    private String bankType;

    @Schema(description = "手机号")
    private String mobile;

    @Schema(description = "绑定账户协议号")
    private String bindCode;

    @Schema(description = "状态")
    private Integer status;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}