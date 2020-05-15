package com.company.muzey.web.screens.exhibit;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Exhibit;

@UiController("muzey_Exhibit.edit")
@UiDescriptor("exhibit-edit.xml")
@EditedEntityContainer("exhibitDc")
@LoadDataBeforeShow
public class ExhibitEdit extends StandardEditor<Exhibit> {
}