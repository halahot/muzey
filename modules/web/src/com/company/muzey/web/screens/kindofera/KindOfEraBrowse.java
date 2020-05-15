package com.company.muzey.web.screens.kindofera;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.KindOfEra;

@UiController("muzey_KindOfEra.browse")
@UiDescriptor("kind-of-era-browse.xml")
@LookupComponent("kindOfErasTable")
@LoadDataBeforeShow
public class KindOfEraBrowse extends StandardLookup<KindOfEra> {
}