<!-- MapperXml.ftl -->
<mapper namespace="${package}.${mapperName}">

    <#list mappings as mapping>
        <select id="${mapping.id}" resultType="${mapping.resultType}">
            ${mapping.query}
        </select>
    </#list>

</mapper>
