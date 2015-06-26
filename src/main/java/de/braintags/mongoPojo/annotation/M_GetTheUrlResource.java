package de.braintags.mongoPojo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import de.braintags.mongoPojo.annotation.UrlResource.UpperLowerCase;

public class M_GetTheUrlResource {

  @UrlResource(value = "http://tutego.de/aufgaben/bond.txt", upperLowerCase = UpperLowerCase.UPPERCASE, trim = true, converter = {
      RemoveNoWordCharactersConverter.class, SortConverter.class })
  public String testFile;

  @Deprecated
  public String xmlValue;

  public static void main(String[] args) throws Exception {
    for (Field field : M_GetTheUrlResource.class.getFields())
      for (Annotation a : field.getAnnotations())
        System.out.println(a);
  }
}
