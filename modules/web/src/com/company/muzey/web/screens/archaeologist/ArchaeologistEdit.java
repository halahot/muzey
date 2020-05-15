package com.company.muzey.web.screens.archaeologist;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Archaeologist;

@UiController("muzey_Archaeologist.edit")
@UiDescriptor("archaeologist-edit.xml")
@EditedEntityContainer("archaeologistDc")
@LoadDataBeforeShow
public class ArchaeologistEdit extends StandardEditor<Archaeologist> {
}