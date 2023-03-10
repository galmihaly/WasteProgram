package hu.logcontrol.wasteprogram.models;

public class RawMaterialTypeMass {

    private String timeStamp;
    private String wasteCode;
    private String materialType;
    private String storageBoxIdentifier;
    private String massData;

    public RawMaterialTypeMass(String timeStamp, String wasteCode, String materialType, String storageBoxIdentifier, String massData) {
        this.timeStamp = timeStamp;
        this.wasteCode = wasteCode;
        this.materialType = materialType;
        this.storageBoxIdentifier = storageBoxIdentifier;
        this.massData = massData;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getWasteCode() {
        return wasteCode;
    }

    public String getMaterialType() {
        return materialType;
    }

    public String getStorageBoxIdentifier() {
        return storageBoxIdentifier;
    }

    public String getMassData() {
        return massData;
    }

    @Override
    public String toString() { return String.format("%s;%s;%s;%s;%s", this.timeStamp, this.wasteCode, this.materialType, this.storageBoxIdentifier, this.massData); }

    public static String getCSVHeader(){
        return "TimeStamp;WasteCode;MaterialType;StorageBoxIdentifier;MassData";
    }
}
