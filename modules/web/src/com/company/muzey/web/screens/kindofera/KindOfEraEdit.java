package com.company.muzey.web.screens.kindofera;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.KindOfEra;

@UiController("muzey_KindOfEra.edit")
@UiDescriptor("kind-of-era-edit.xml")
@EditedEntityContainer("kindOfEraDc")
@LoadDataBeforeShow
public class KindOfEraEdit extends StandardEditor<KindOfEra> {
}