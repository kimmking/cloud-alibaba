package org.sukerin.shardingjdbc.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sukerin
 */
@Data
@TableName("account")
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_UUID)
    private String uuid;
    private String userId;
    private String username;
    private Integer user_no;
}
