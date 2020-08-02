package pl.sda.ex17;

public enum ConversionType
{
    CENTIMETERS_TO_INCHES(1d/2.54d),
    INCHES_TO_CENTIMETERS(2.54d);

    ConversionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }

    private double converter;
}
