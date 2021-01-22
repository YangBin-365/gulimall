package edu.xau.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import edu.xau.common.valid.AddGroup;
import edu.xau.common.valid.ListValue;
import edu.xau.common.valid.UpdateGroup;
import edu.xau.common.valid.UpdateStatusGroup;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 *
 * @author yangbin
 * @email 1765595108@qq.com
 * @date 2021-01-16 14:50:01
 */
@Data
@TableName("pms_brand")
@ToString
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "修改必须指定id",groups = {UpdateGroup.class})
	@Null(message = "新增不能指定id",groups = AddGroup.class)
	@TableId
		private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名不可为空",groups = {UpdateGroup.class,AddGroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "logo必须是合法的地址")
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@ListValue(vals = {0,1},groups={UpdateStatusGroup.class,AddGroup.class})
	@NotNull(groups = {AddGroup.class,UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotEmpty(groups = {AddGroup.class})
	@Pattern(regexp = "^[a-zA-Z]$",message = "首字必须为字母",groups = {UpdateGroup.class,AddGroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@Min(value = 0,message = "最小为0")
	private Integer sort;

}
