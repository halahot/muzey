package com.company.muzey.web.screens.place;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.Place;

@UiController("muzey_Place.edit")
@UiDescriptor("place-edit.xml")
@EditedEntityContainer("placeDc")
@LoadDataBeforeShow
public class PlaceEdit extends StandardEditor<Place> {
}