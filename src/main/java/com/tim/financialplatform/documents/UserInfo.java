package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

@Document(collection = "user_info")
@Data
@Schema(name = "UserInfo", description = "用户基本信息")
public class UserInfo {

    public static final Integer STATUS_NORMAL = 1;
    public static final Integer STATUS_LOCKED = 0;
    public static final String USER_AVATAR = "https://srb-file-200921.oss-cn-beijing.aliyuncs.com/avatar/01.jpg";

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "1：出借人 2：借款人")
    private Integer userType;

    @Schema(description = "手机号")
    private String mobile;

    @Schema(description = "用户密码")
    private String password;

    @Schema(description = "用户昵称")
    private String nickName;

    @Schema(description = "用户姓名")
    private String name;

    @Schema(description = "身份证号")
    private String idCard;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "微信用户标识openid")
    private String openid;

    @Schema(description = "头像")
    private String headImg;

    @Schema(description = "绑定状态（0：未绑定，1：绑定成功 -1：绑定失败）")
    private Integer bindStatus;

    @Schema(description = "借款人认证状态（0：未认证 1：认证中 2：认证通过 -1：认证失败）")
    private Integer borrowAuthStatus;

    @Schema(description = "绑定账户协议号")
    private String bindCode;

    @Schema(description = "用户积分")
    private Integer integral;

    @Schema(description = "状态（0：锁定 1：正常）")
    private Integer status;

    @Schema(description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}