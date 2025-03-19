package com.tim.financialplatform.documents;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;

@Document(collection = "borrower_attachments")
@Data
@Schema(name = "BorrowerAttach", description = "借款人上传资源表")
public class BorrowerAttach {

    @Id
    @Schema(description = "编号")
    private String id;

    @Schema(description = "借款人id")
    private Long borrowerId;

    @Schema(description = "图片类型（idCard1：身份证正面，idCard2：身份证反面，house：房产证，car：车）")
    private String imageType;

    @Schema(description = "图片路径")
    private String imageUrl;

    @Schema(description = "图片名称")
    private String imageName;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;
}