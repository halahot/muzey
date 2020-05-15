package com.company.muzey.web.screens.era;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Era;

@UiController("muzey_Era.edit")
@UiDescriptor("era-edit.xml")
@EditedEntityContainer("eraDc")
@LoadDataBeforeShow
public class EraEdit extends StandardEditor<Era> {
}