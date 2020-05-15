package com.company.muzey.web.screens.era;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Era;

@UiController("muzey_Era.browse")
@UiDescriptor("era-browse.xml")
@LookupComponent("erasTable")
@LoadDataBeforeShow
public class EraBrowse extends StandardLookup<Era> {
}