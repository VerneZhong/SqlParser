package com.sql.parse.util;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Mr.Zxb
 * @description
 * @date 2024/03/28 22:07
 */
public class FileUtil {
    /**
     * 读取文件内容并返回字符串。
     *
     * @param filePath 文件的路径。
     * @return 文件内容的字符串。
     */
    public static String readFileAsString(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
