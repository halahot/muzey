package com.company.muzey.web.screens.extype;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.ExType;

@UiController("muzey_ExType.edit")
@UiDescriptor("ex-type-edit.xml")
@EditedEntityContainer("exTypeDc")
@LoadDataBeforeShow
public class ExTypeEdit extends StandardEditor<ExType> {
}