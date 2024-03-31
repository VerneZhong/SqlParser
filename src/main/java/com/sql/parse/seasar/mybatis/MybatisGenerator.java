package com.sql.parse.seasar.mybatis;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mr.Zxb·
 * @description
 * @date 2024/03/31 11:51
 */
public class MybatisGenerator {
    public static void generator(TableInfo tableInfo) {
        // 伪代码
        try {
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_32);
            // 设置模板加载的目录
            cfg.setDirectoryForTemplateLoading(new File("/Users/verne.zhong/IdeaProjects/SqlParser/src/main/java/com/sql/parse/seasar/mybatis/teamplates"));
            Template entityTemplate = cfg.getTemplate("Entity.ftl");

            Map<String, Object> templateData = new HashMap<>();
            templateData.put("package", "com.sql.mybatis.generator");
            templateData.put("entityName", tableInfo.getName());
            templateData.put("columns", tableInfo.getColumns());

            // 使用模板引擎生成代码
            Writer out = new OutputStreamWriter(System.out);
            entityTemplate.process(templateData, out);
            System.out.println("mybatis generator finish...");
        } catch (IOException | TemplateException e) {
            throw new RuntimeException(e);
        }
    }

    public static void generateCode(Map<String, Object> dataModel, String templateName, File outputFile) throws Exception {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_32);
        cfg.setDirectoryForTemplateLoading(new File("/Users/verne.zhong/IdeaProjects/SqlParser/src/main/java/com/sql/parse/seasar/mybatis/teamplates"));
        Template template = cfg.getTemplate(templateName);

        try (Writer fileWriter = new FileWriter(outputFile)) {
            template.process(dataModel, fileWriter);
        }
    }
}
