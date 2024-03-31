package com.sql.parse.seasar.mybatis;

import com.sql.parse.seasar.mybatis.ColumnInfo;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/31 11:37
 */
@Data
public class TableInfo {
    private String name;
    private List<ColumnInfo> columns = new ArrayList<>();
}
