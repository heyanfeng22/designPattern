package com.template.combinationTemplate;

import com.template.extendsTemplate.MytemplateByIn;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/21 20:46
 * @Modified By:
 */
public class RoleDao
{
    private MytemplateByZuHe mytemplateByZuHe = new MytemplateByZuHe();

    public void add(int id) {
        mytemplateByZuHe.add(id);
    }
    public void delete(int id) {
        mytemplateByZuHe.delete(id);
    }


}
