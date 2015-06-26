package de.braintags.mongoPojo.annotation;

public class RemoveNoWordCharactersConverter implements ResourceConverter {

  /*
   * (non-Javadoc)
   * 
   * @see de.braintags.mongoPojo.annotation.ResourceConverter#convert(java.lang.String)
   */
  public String convert(String input) {
    return input.replaceAll("\\W", "");
  }
}