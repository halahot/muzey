package com.company.muzey.web.screens.extype;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.ExType;

@UiController("muzey_ExType.browse")
@UiDescriptor("ex-type-browse.xml")
@LookupComponent("exTypesTable")
@LoadDataBeforeShow
public class ExTypeBrowse extends StandardLookup<ExType> {
}