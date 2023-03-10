package hu.logcontrol.wasteprogram.interfaces;

import android.content.Intent;

import java.util.List;

import hu.logcontrol.wasteprogram.adapters.RawMaterialAdapter;
import hu.logcontrol.wasteprogram.enums.EditButtonEnums;
import hu.logcontrol.wasteprogram.models.RawMaterial;

public interface IModesOneView {
    void openActivityByIntent(Intent intent);
    void settingSaveButton(EditButtonEnums editButtonEnum);
    void getMessageFromPresenter(String message);
}
