package com.company.muzey.web.screens.university;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.University;

@UiController("muzey_University.browse")
@UiDescriptor("university-browse.xml")
@LookupComponent("universitiesTable")
@LoadDataBeforeShow
public class UniversityBrowse extends StandardLookup<University> {
}