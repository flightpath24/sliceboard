package edu.wpi.first.shuffleboard.data;

import java.util.Map;

public class AnalogInputData extends NamedData<Double> {

  public AnalogInputData(String name, double value) {
    super(name, value);
  }

  public AnalogInputData(Map<String, Object> map) {
    this((String) map.getOrDefault("Name", "?"), (double) map.getOrDefault("Value", 0.0));
  }

}
