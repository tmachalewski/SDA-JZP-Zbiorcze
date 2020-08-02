package pl.sda.ex17;

public class MeasurementConverter {
    public double convert(int value, ConversionType conversionType)
    {
        return value*conversionType.getConverter();
    }
}
