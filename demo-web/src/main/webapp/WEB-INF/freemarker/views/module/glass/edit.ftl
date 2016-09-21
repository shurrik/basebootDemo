<div class="bjui-pageContent">
    <form action="${wwwroot}/admin/glass/save" id="editForm" data-toggle="validate" data-alertmsg="false" reloadNavtab="true">
        <input type="hidden" name="id" value="${(glass.id)!}" />
        <div class="pageFormContent" data-layout-h="0">
            <table class="table table-condensed table-hover" width="100%">
                <tbody>
                    <tr>
                        <td>
                            <label for="name" class="control-label x85">书名：</label>
                            <input type="text" name="name" id="name" value="${(glass.name)!}" maxlength="100" data-rule="required" >
                        </td>
                        <td>
                            <label for="price" class="control-label x85">价格：</label>
                            <input type="text" name="price" id="price" value="${(glass.price)!}"  data-rule="digits" >
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </form>
</div>
<div class="bjui-pageFooter" >
    <ul>
        <li><button type="button" class="btn btn-close" data-icon="close">取消</button></li>
        <li><button type="submit" class="btn btn-success" data-icon="save">保存</button></li>
    </ul>
</div>
