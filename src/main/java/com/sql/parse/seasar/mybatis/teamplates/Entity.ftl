// Entity.ftl
package ${package};

public class ${entityName} {
<#list columns as column>
    private ${column.type} ${column.name};
</#list>

<#list columns as column>
    public ${column.type} get${column.name?cap_first}() {
    return this.${column.name};
    }

    public void set${column.name?cap_first}(${column.type} ${column.name}) {
    this.${column.name} = ${column.name};
    }
</#list>
}
