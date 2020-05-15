package com.company.muzey.web.screens.exhibit;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Exhibit;

@UiController("muzey_Exhibit.browse")
@UiDescriptor("exhibit-browse.xml")
@LookupComponent("exhibitsTable")
@LoadDataBeforeShow
public class ExhibitBrowse extends StandardLookup<Exhibit> {
}