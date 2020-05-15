package com.company.muzey.web.screens.place;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Place;

@UiController("muzey_Place.browse")
@UiDescriptor("place-browse.xml")
@LookupComponent("placesTable")
@LoadDataBeforeShow
public class PlaceBrowse extends StandardLookup<Place> {
}