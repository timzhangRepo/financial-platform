package com.tim.financialplatform.documents;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Document(collection = "dict")
@Data
@Schema(name = "Dict", description = "数据字典")
public class Dict {

    @Id
    @Schema(description = "id")
    private String id;

    @Schema(description = "上级id")
    private Long parentId;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "值")
    private Integer value;

    @Schema(description = "编码")
    private String dictCode;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "删除标记（0:不可用 1:可用）")
    private Boolean deleted;

    @Schema(description = "是否有子节点")
    private boolean hasChildren;
}