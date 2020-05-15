package com.company.muzey.web.screens.university;

import com.haulmont.cuba.gui.screen.*;
import com.company.muzey.entity.University;

@UiController("muzey_University.edit")
@UiDescriptor("university-edit.xml")
@EditedEntityContainer("universityDc")
@LoadDataBeforeShow
public class UniversityEdit extends StandardEditor<University> {
}