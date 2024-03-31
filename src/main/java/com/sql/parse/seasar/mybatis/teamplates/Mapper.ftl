// Mapper.ftl
package ${package};

public interface ${mapperName} {

<#list methods as method>
    ${method.returnType} ${method.name}(${method.parameterType} ${method.parameterName});
</#list>

}
