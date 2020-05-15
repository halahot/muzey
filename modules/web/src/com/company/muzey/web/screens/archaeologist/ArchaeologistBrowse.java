package com.company.muzey.web.screens.archaeologist;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Archaeologist;

@UiController("muzey_Archaeologist.browse")
@UiDescriptor("archaeologist-browse.xml")
@LookupComponent("archaeologistsTable")
@LoadDataBeforeShow
public class ArchaeologistBrowse extends StandardLookup<Archaeologist> {
}