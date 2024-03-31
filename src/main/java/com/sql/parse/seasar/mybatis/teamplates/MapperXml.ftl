<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${package}.${mapperName}">

        <#list mappings as mapping>
                <select id="${mapping.id}" resultType="${mapping.resultType}">
                        ${mapping.query}
                </select>
        </#list>

</mapper>
